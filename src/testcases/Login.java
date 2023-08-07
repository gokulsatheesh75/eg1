package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Forgotpassword;
import objectrepository.RediffLogin;

public class Login {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul A S\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLogin r = new RediffLogin(driver);
		r.emailID().sendKeys("qwerty");
		r.password().sendKeys("12345");
		r.signin().click();
		r.forgotPassword().click();
		Forgotpassword f = new Forgotpassword(driver);
		f.email().sendKeys("zxcvb");
		f.nextButton().click();
	}
}
