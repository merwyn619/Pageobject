package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RSALoginpage;

public class Loginapplication {

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merwynn\\Documents\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in?clean_login=true&reset_purchase_session=1");
		RSALoginpage rs=new RSALoginpage(driver);
		rs.email().sendKeys("Hello");
		rs.password().sendKeys("123456");
		rs.login().click();
	}
	
}
