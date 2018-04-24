package by.htp.tut.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends AbstractPage {

	private By searhTxb = By.xpath("//div/input[contains(@class,'MainSearch')]");
	private By searchRes = By.xpath("//div/a[@class='bloko-link HH-LinkModifier']");

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void sendText(String text) {
		getElement(searhTxb).sendKeys(text);
		getElement(searhTxb).submit();
	}

	public List<WebElement> countJobs() {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(searchRes));
	}
}
