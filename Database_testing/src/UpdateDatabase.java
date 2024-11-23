import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class UpdateDatabase {

	@Test
	public void UpdateGender() throws SQLException
	{
		String host = "localhost";
		String port = "3306";
		
		//SQL query for Updating data.
		String sql = "Update OrderList SET Gender = ? WHERE id = ?";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MockData", "root", "84725V!r@j");
		PreparedStatement syntax = connect.prepareStatement(sql);
		
		//data to update into the query.
		syntax.setString(1, "Male");
		syntax.setInt(2, 4);
		
		int rows = syntax.executeUpdate(); // here we are using executeUpdate and not exeucteBatch because
		// single query can be automatically be updated, but at the time of multiple data you need to use .addbatch method
		System.out.println("Rows Updated" + rows);
		
	}
}
