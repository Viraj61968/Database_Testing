import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IntegrateDatabase {

	@Test
	public void ParsingtheData() throws SQLException
	{
		String host = "localhost";
		String port = "3306";
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/MockData", "root", "84725V!r@j");
		
		
		Statement state = connect.createStatement();
		ResultSet result = state.executeQuery("Select * From OrderList Where id = 5");
		result.next();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.id("firstName")).sendKeys(result.getString("First_Name"));
		driver.findElement(By.id("lastName")).sendKeys(result.getString("Last_Name"));
		driver.findElement(By.id("userEmail")).sendKeys(result.getString("Email"));
		
		driver.close();
		
	}
}
