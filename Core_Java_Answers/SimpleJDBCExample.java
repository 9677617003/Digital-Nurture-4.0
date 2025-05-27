import java.sql.*;
public class SimpleJDBCExample {
public static void main(String[] args) {
String url = "jdbc:sqlite::memory:"; // In-memory DB
try {
Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection(url);
Statement stmt = conn.createStatement();
String createTable = "CREATE TABLE students (" +
                     "id INTEGER PRIMARY KEY, " +
                     "name TEXT NOT NULL, " +
                     "grade INTEGER)";
stmt.execute(createTable);
stmt.execute("INSERT INTO students (name, grade) VALUES ('Alice', 90)");
stmt.execute("INSERT INTO students (name, grade) VALUES ('Bob', 85)");
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
while (rs.next()) {
System.out.println(rs.getInt("id") + ": " +
                   rs.getString("name") + " - " +
                   rs.getInt("grade"));
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
}
