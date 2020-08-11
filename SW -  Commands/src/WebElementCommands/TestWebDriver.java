package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {
	public static void main(String arg[]) throws Exception {

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\Selenium Browsers Jars\\Chrome 83\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.findElement(By.name("search_query")).sendKeys("Dress");
			// driver.findElement(By.className("login")).click();

			By locator = By.className("login");
			WebElement ele = driver.findElement(locator);
			ele.click();
			driver.findElement(By.id("email_create")).sendKeys("raghu.astepahead@gmail.com");
			driver.findElement(By.id("SubmitCreate")).click();
			// String pagecontent=
			Thread.sleep(5000);
			// driver.close();;
		}
	}

}
