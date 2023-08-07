package irctcdash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrctcSearch {

	WebDriver driver;
	
	public IrctcSearch(WebDriver driver) {
		this.driver = driver;
	}
	By from = By.xpath("//*[@id=\"origin\"]/span/input");
	By to = By.xpath("//*[@id=\"destination\"]/span/input");
	By berth = By.xpath("//label[@for='availableBerth']");
	By search = By.xpath("//button[@type='submit']");
	By date = By.xpath("//*[@id=\"jDate\"]/span/input");
	By seldate = By.xpath("//a[normalize-space()='20']");
	By refresh = By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div");
	public WebElement From() {
		return driver.findElement(from);
	}
	
	public WebElement To() {
		return driver.findElement(to);
	}
	
	public WebElement Berth() {
		return driver.findElement(berth);
	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement Date() {
		return driver.findElement(date);
	}
	
	public WebElement Seldate() {
		return driver.findElement(seldate);
	}
	
	public WebElement Refresh() {
		return driver.findElement(refresh);
	}
}
