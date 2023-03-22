import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//1)loading the driver class
				Class.forName("com.mysql.cj.jdbc.Driver");

		//2)creating the connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ktg_fsd", "root", "rpsconsulting");
		//3)creating statement
				Statement stmt = conn.createStatement();
		//4)executing query//ddl-->execute()    dml-->executeUpdate()   drl-->executeQuery()
				//int result = stmt.executeUpdate("insert into products values(3,'lenovo',39000,'electronics')");
				//int result = stmt.executeUpdate("update products set price=29000 where pid=3 ");
				int result = stmt.executeUpdate("delete from products where pid=3 ");
		//5)closing the connection
				conn.close();
				System.out.println("data deleted "+result);
			}


}
