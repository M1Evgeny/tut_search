package by.htp.tut.steps;

import static by.htp.tut.driver.DriverSinglenot.*;

import by.htp.tut.util.SearchUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import by.htp.tut.page.MainPage;
import by.htp.tut.page.SearchPage;

public class Steps {
	private WebDriver driver;
	private String searchExpression = "специалист по тестированию";
	private static final Logger logger = LogManager.getRootLogger();

	public void initDriver() {
		driver = getDriver();
	}

	public void closeStepsDriver() {
		closeDriver();
	}

	public void goToJobs() {
		MainPage page = new MainPage(driver);
		page.openPage();
		page.clickJob();
		logger.info("job page clicked");
	}

	public void getResults() {
		SearchPage page = new SearchPage(driver);
		page.sendText(searchExpression);
		SearchUtil util = new SearchUtil();
		util.getResult(page.countJobs());
		logger.info("search results");
	}
}
