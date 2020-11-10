package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RSALoginpage {

	WebDriver driver;
	public RSALoginpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	By email=By.id("user_email");
	By password=By.name("user[password]");
	By login=By.name("commit");
	
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
}
