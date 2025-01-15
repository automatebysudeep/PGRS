package generics;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base extends dataprovider
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public static void setup() throws IOException, InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://admin.pgrs.teceads.co.in/login");
		wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public static void teardown()
	{
		driver.close();
	}
}