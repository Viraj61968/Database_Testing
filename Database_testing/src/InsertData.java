import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class InsertData {

	@Test
	public void Insertion() throws SQLException
	{
		String host = "localhost";
		String port = "3306";
		
		//SQL query for inserting data.
		String sql = "INSERT INTO OrderList (id, First_Name, Last_Name, Email, Gender, City, Product) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MockData", "root", "84725V!r@j");
		PreparedStatement syntax = connect.prepareStatement(sql);
		
		
		//Inserting the data.
		syntax.setInt(1, 9);
		syntax.setString(2, "Oneplus");
		syntax.setString(3, "Oxygen");
		syntax.setString(4, "eclispe@g.com");
		syntax.setString(5, "Other");
		syntax.setString(6, "India");
		syntax.setString(7, "Mobile");
		syntax.addBatch();
		
		//Execute the query to add the row into the table.
		int[]  rowcount = syntax.executeBatch();
		System.out.println("Row inserted into the table" + rowcount.length);
		
		/*
		 Prepared Statement - It's a precompiled SQL statement where actual values can be filled in later. 
		 The SQL statement template is created once and executed multiple times with different values
		 
		 Why Use ? Instead of Direct Values - you can use placeholders (?) for dynamic values when using a PreparedStatement.
		 Instead of hardcoding the data.
		 
		 */
		
		

		
		
		
		
	}
}
