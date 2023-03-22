import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1)loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg_fsd", "root", "rpsconsulting");
		// 3)creating statement
		Statement stmt = conn.createStatement();
		// 4)executing query//ddl-->execute() dml-->executeUpdate() drl-->executeQuery()
		ResultSet result = stmt.executeQuery("select * from products");
			while(result.next())
			{
				System.out.println(result.getInt(1)+" "+result.getString("pname")+" "+result.getInt(3)+" "+result.getString("category"));
			}

		// 5)closing the connection
		conn.close();
		
	}
}
