/*Case Study - WebElements Commands
	
	Sample test, we will automate the following test scenarios:
		1.	User TestNG/Junit Framework  and Open URL (https://www.login.hiox.com/login?referrer=easycalculation.com)By 
			a.Chrome Browser
			b.Firefox
			c.Internet Explorer
		2.	Click on the "Sign In" link (This link will redirect you to the “Sign In” website)
		3.	Enter UserName and Password In Edit Box using Locators
		4.	Click on Login Botton Which Will Redirect to WebSite
		5.	Get Page Title name and Title length
		6.	Print Page Title and Title length on the Eclipse Console
		7.	Close the Browser
		
		*/

package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethods3 {

	@Test
	public void BrowserCommands() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
		driver.findElement(By.xpath("//input[contains(@name,'log_submit')]")).click();
		driver.quit();*/
		
		WebElement editbox1 = driver.findElement(By.id("log_email"));
		editbox1.sendKeys("9740673180");

		
		WebElement editbox2 = driver.findElement(By.id("log_password"));
		editbox2.sendKeys("raghubn@123"); 
		
		WebElement Button = driver.findElement(By.xpath("//input[contains(@name,'log_submit')]"));
		Button.click();
		
		driver.quit();	
 }
}
