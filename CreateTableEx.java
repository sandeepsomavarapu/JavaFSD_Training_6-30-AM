import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//1)loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

//2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg_fsd", "root", "rpsconsulting");
//3)creating statement
		Statement stmt = conn.createStatement();
//4)executing query//ddl-->execute()    dml-->executeUpdate()   drl-->executeQuery()
		boolean result = stmt.execute("create table products(pid int,pname varchar(15),price int,category varchar(15))");
//5)closing the connection
		conn.close();
		System.out.println("table created "+result);
	}

}
