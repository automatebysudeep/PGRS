package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;

import generics.base;

public class loginpage extends base
{
	By phonenumbertextfield=By.name("phoneNumber");
	By passwordtextfield=By.name("password");
	By loginbutton=By.xpath("//button[.='Login']");

	public loginpage(WebDriver driver)
	{
		base.driver=driver;
	}
	
	public void loginmethod(String phoneno, String password) throws IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(phonenumbertextfield));
		driver.findElement(phonenumbertextfield).sendKeys(phoneno);
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordtextfield));
		driver.findElement(passwordtextfield).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbutton));
		driver.findElement(loginbutton).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Analytic Dashboard | GMS", "invalid username or password");
		Reporter.log("login successfull", true);
	}
}