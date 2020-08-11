/*Case Study - Navigation Commands
	
	Sample test, we will automate the following test scenarios:
		1.	User TestNG/Junit Framework  and Open URL (http://automationpractice.com/index.php)By 
			a.Chrome Browser
			b.Firefox
			c.Internet Explorer
		2.	Click on the "Sign In" link (This link will redirect you to the “Sign In” website)
		3.	Come back to the Home page using the back command 
		4.	Again go back to the “Sign In” website using forward command
		5.	Again come back to the Home page using To command
		6.	Refresh the Browser using Refresh command
		7.	Close the Browser
*/
package NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethods2 {

	@Test
	public void BrowserCommands() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		// Click on the Link Text using click() command
		driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to("http://automationpractice.com/index.php");

		// Refresh browser
		driver.navigate().refresh();

		// Closing browser
		driver.close();
	}
}