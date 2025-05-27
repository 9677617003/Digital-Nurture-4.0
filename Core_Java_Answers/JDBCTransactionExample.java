import java.sql.*;
public class JDBCTransactionExample {
public static void main(String[] args) {
String url = "jdbc:sqlite::memory:";
try {
Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection(url);
Statement stmt = conn.createStatement();
stmt.execute("CREATE TABLE accounts (id INTEGER PRIMARY KEY, name TEXT, balance REAL)");
stmt.execute("INSERT INTO accounts (id, name, balance) VALUES (1, 'Alice', 1000.0)");
stmt.execute("INSERT INTO accounts (id, name, balance) VALUES (2, 'Bob', 500.0)");
transferMoney(conn, 1, 2, 200.0); // Transfer 200 from Alice to Bob
ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");
System.out.println("Final Account Balances:");
while (rs.next()) 
{
System.out.println(rs.getString("name") + ": $" + rs.getDouble("balance"));
}

rs.close();
stmt.close();
conn.close();
} 
catch (Exception e)
{
e.printStackTrace();
}
}

public static void transferMoney(Connection conn, int fromAccountId, int toAccountId, double amount) {
try {
conn.setAutoCommit(false);
PreparedStatement debitStmt = conn.prepareStatement(
"UPDATE accounts SET balance = balance - ? WHERE id = ?");
debitStmt.setDouble(1, amount);
debitStmt.setInt(2, fromAccountId);
debitStmt.executeUpdate();
PreparedStatement creditStmt = conn.prepareStatement(
"UPDATE accounts SET balance = balance + ? WHERE id = ?");
creditStmt.setDouble(1, amount);
creditStmt.setInt(2, toAccountId);
creditStmt.executeUpdate();
conn.commit();
System.out.println("Transaction committed successfully.");
debitStmt.close();
creditStmt.close();
} 
catch (Exception e) 
{
try {
System.out.println("Transaction failed. Rolling back...");
conn.rollback();
} 
catch (SQLException rollbackEx) {
rollbackEx.printStackTrace();
}
e.printStackTrace();
} finally {
try {
conn.setAutoCommit(true); 
} catch (SQLException e) {
e.printStackTrace();
}}}}
