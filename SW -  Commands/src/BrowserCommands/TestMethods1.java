/*Case Study – Browser Commands:
	
	1.User TestNG/Junit Framework  and Open URL By 
		a.	Chrome Browser
		b.	Firefox
		c.	Internet Explorer
	2.Open URL: http://automationpractice.com/index.php
	3.Get Page Title name and Title length 
	4.Print Page Title and Title length on the Eclipse Console
	5.Get page URL and verify whether it is the desired page or not
	6.Get page Source and Page Source length
	7.Print page Length on Eclipse Console.
	8.Close the Browser
*/

package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethods1 {

	@Test
	public void BrowserCommands() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Selenium Browsers Jars\\Chrome\\Chrome 84\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		String PageName = driver.getTitle(); // Storing Title name in the String variable
		int PageLength = driver.getTitle().length(); // Storing Title length in the Int variable
														// Printing Title & Title length in the Console window
		System.out.println("Title of WebPage is... : " + PageName);
		System.out.println("Length of WebPage is...: " + PageLength);

		// Storing URL in String variable
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals("http://www.half.ebay.com")) {
			System.out.println("Verification - TestCase Passed...!");
		} else {
			System.out.println("Verification - TestCase Failed...!");
		}

		String pageSource = driver.getPageSource(); // Storing Page Source in String variable
		int pageSourceLength = pageSource.length(); // Storing Page Source length in Int variable
			System.out.println("Total length of the Page Source is : " + pageSourceLength);// Printing length of the Page Source on console
		driver.quit();
	}
}
