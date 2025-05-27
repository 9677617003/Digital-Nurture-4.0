import java.sql.*;
class Student {
int id;
String name;
int grade;
public Student(int id, String name, int grade) {
this.id = id;
this.name = name;
this.grade = grade;
}
}
class StudentDAO 
{
private Connection conn;
public StudentDAO(Connection conn) 
{
this.conn = conn;
}
public void insertStudent(Student student) throws SQLException {
String sql = "INSERT INTO students (id, name, grade) VALUES (?, ?, ?)";
try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setInt(1, student.id);
pstmt.setString(2, student.name);
pstmt.setInt(3, student.grade);
pstmt.executeUpdate();
}
}
public void updateStudentGrade(int id, int newGrade) throws SQLException {
String sql = "UPDATE students SET grade = ? WHERE id = ?";
try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setInt(1, newGrade);
pstmt.setInt(2, id);
pstmt.executeUpdate();
}
}
public void printAllStudents() throws SQLException {
String sql = "SELECT * FROM students";
try (Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(sql)) {
while (rs.next()) {
System.out.println(rs.getInt("id") + ": " +
                   rs.getString("name") + " - " +
                   rs.getInt("grade"));
}}}}
public class JDBCInsertUpdateExample {
public static void main(String[] args) {
String url = "jdbc:sqlite::memory:";
try {
Class.forName("org.sqlite.JDBC");
Connection conn = DriverManager.getConnection(url);
Statement stmt = conn.createStatement();
stmt.execute("CREATE TABLE students (id INTEGER PRIMARY KEY, name TEXT, grade INTEGER)");
StudentDAO dao = new StudentDAO(conn);
dao.insertStudent(new Student(1, "Alice", 90));
dao.insertStudent(new Student(2, "Bob", 85));
System.out.println("Before Update:");
dao.printAllStudents();
dao.updateStudentGrade(2, 95);
System.out.println("\nAfter Update:");
dao.printAllStudents();
stmt.close();
conn.close();
} 
catch (Exception e) {
e.printStackTrace();
}
}
}
