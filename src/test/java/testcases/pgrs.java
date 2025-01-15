package testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import generics.base;
import pages.loginpage;

public class pgrs extends base
{
	@Test(dataProvider = "validvalid")
	public void validvalid(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "validinvalid>=6")
	public void validinvalid1(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "validinvalid<6")
	public void validinvalid2(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "validblank")
	public void validblank(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "invalidvalid")
	public void invalidvalid1(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "invalid<10valid")
	public void invalidvalid2(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "invalidinvalid")
	public void invalidinvalid(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "blankvalid")
	public void blankvalid(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
	@Test(dataProvider = "blankblank")
	public void blankblank(String phoneno, String password) throws IOException, InterruptedException
	{
		loginpage lp=new loginpage(driver);
		lp.loginmethod(phoneno, password);
	}
}