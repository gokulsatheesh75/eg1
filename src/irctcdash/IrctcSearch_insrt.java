package irctcdash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IrctcSearch_insrt {

	WebDriver driver;
	public IrctcSearch_insrt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"origin\"]/span/input")
	WebElement from;
	@FindBy(xpath = "//*[@id=\"destination\"]/span/input")
	WebElement to;
	@FindBy(xpath = "//label[@for='availableBerth']")
	WebElement berth;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;
	@FindBy(xpath = "//*[@id=\"jDate\"]/span/input")
	WebElement date;
	@FindBy(xpath = "//a[normalize-space()='20']")
	WebElement seldate;
	@FindBy(xpath = "//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[5]/div[1]/table/tr/td[1]/div")
	WebElement refresh;
	
	public WebElement From() {
		return from;
	}
	
	public WebElement To() {
		return to;
	}
	
	public WebElement Berth() {
		return berth;
	}
	
	public WebElement Search() {
		return search;
	}
	
	public WebElement Date() {
		return date;
	}
	
	public WebElement Seldate() {
		return seldate;
	}
}
