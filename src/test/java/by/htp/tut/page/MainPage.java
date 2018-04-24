package by.htp.tut.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage {

	private final String URL = "https://www.tut.by/";
	private By job = By.xpath("//ul[@class='b-topbar-i']//*[contains(text(),'Работа')]");

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void openPage() {
		driver.navigate().to(URL);
	}

	public void clickJob() {
		getElement(job).click();
	}
}
