package irctc_Testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import irctcdash.IrctcSearch;

public class Testcases {

	@Test
	public void search() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gokul A S\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		IrctcSearch s = new IrctcSearch(driver);
		s.From().sendKeys("Qln");
		Thread.sleep(1000);
		s.From().sendKeys(Keys.ENTER);
		s.To().sendKeys("Awy");
		Thread.sleep(1000);
		s.To().sendKeys(Keys.ENTER);
		s.Berth().click();
		s.Date().click();
		s.Date().sendKeys("");
		s.Seldate().click();
		s.Search().click();
		//s.Refresh().click();
		//s.Refresh().click();
	}
}
