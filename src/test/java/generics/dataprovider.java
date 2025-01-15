package generics;

import org.testng.annotations.DataProvider;

public class dataprovider
{
	@DataProvider(name="validvalid")
	public String[][] validvalid()
	{
		String[][] values= {
				{"9861274805","Abhi@9090"},//valid-valid -> homepage
		};
		return values;
	}
	@DataProvider(name="validinvalid>=6")
	public String[][] validinvalid1()
	{
		String[][] values= {
				{"9861274805","Abhi90"},//valid-invalid>=6 -> wrongpassword
		};
		return values;
	}
	@DataProvider(name="validinvalid<6")
	public String[][] validinvalid2()
	{
		String[][] values= {
				{"9861274805","Abhi@"},//valid-invalid<6 -> must be at least 6 chars
		};
		return values;
	}
	@DataProvider(name="validblank")
	public String[][] validblank()
	{
		String[][] values= {
				{"9861274805",""},//valid-blank -> password is required
		};
		return values;
	}
	@DataProvider(name="invalidvalid")
	public String[][] invalidvalid1()
	{
		String[][] values= {
				{"9861274806","Abhi@9090"},//invalid-valid -> no such user found
		};
		return values;
	}
	@DataProvider(name="invalid<10valid")
	public String[][] invalidvalid2()
	{
		String[][] values= {
				{"986127480","Abhi@9090"},//invalid<10-valid -> enter a 10 digit number
		};
		return values;
	}
	@DataProvider(name="invalidinvalid")
	public String[][] invalidinvalid()
	{
		String[][] values= {
				{"9861274806","Abhi@90"},//invalid-invalid -> no such user found
		};
		return values;
	}
	@DataProvider(name="blankvalid")
	public String[][] blankvalid()
	{
		String[][] values= {
				{"","Abhi@9090"},//blank-valid -> phone number is required
		};
		return values;
	}
	@DataProvider(name="blankblank")
	public String[][] blankblank()
	{
		String[][] values= {
				{"",""}//blank-blank -> phone number is required & password is required
		};
		return values;
	}
}