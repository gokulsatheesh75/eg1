package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {
	
	WebDriver driver;
	
	public Forgotpassword(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By emailid = By.id("txtlogin");
	By nextbutton = By.name("next");
	
	public WebElement email() {
		return driver.findElement(emailid);
	}
	
	public WebElement nextButton() {
		return driver.findElement(nextbutton);
	}
	
}
