package by.htp.tut.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

	protected WebDriver driver;
	WebDriverWait wait;
	private int timeOutInSeconds = 10;

	public AbstractPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, timeOutInSeconds);
	}
	
	public WebElement getElement(By by) {
		return wait.until(ExpectedConditions.elementToBeClickable(by));
	}

}
