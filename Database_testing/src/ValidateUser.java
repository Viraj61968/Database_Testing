import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateUser {
	
	@Test
	public void ValidateUserintoDatabase() throws SQLException
	{
		//Connecting the database.
		String host = "localhost";
		String port = "3306";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MockData", "root", "84725V!r@j");
		
		
		Statement state = connect.createStatement();
		ResultSet result = state.executeQuery("Select * From OrderList");
		
		result.next(); //  because at index 0 it doesn't have any data other than label / or column name
		Assert.assertEquals(result.getString("Email"), "cgarric0@arizona.edu");
		}
	
	
}
