package testsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepo.GoogleObj;

public class TestGoogle {

	public static WebDriver driver;
	public static final String GoogleDriverPath = "/home/matar/Downloads/drivers/chromedriver";

	@Given("^User is on Google Home Page$")
	public void user_is_on_Google_Home_Page() throws Throwable {
 		
		System.setProperty("webdriver.chrome.driver", GoogleDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

 	}

	@When("^User Click on Search bar$")
	public void user_Click_on_Search_bar() throws Throwable {

		GoogleObj.Google.SearchField(driver).click();
 	}

	@When("^User enter Selenium word$")
	public void user_enter_Selenium_word() throws Throwable {

		GoogleObj.Google.SearchField(driver).clear();
		GoogleObj.Google.SearchField(driver).sendKeys("Selenium");
 	}

	@When("^User Click on Google Search Button$")
	public void user_Click_on_Google_Search_Button() throws Throwable {

		GoogleObj.Google.SearchBtn(driver).click();
 	}

	@Then("^Search Results displayed$")
	public void search_Results_displayed() throws Throwable {
		Thread.sleep(1000);

		if (driver.findElement(By.id("resultStats")).isDisplayed()) {
			if (driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/h3")).getText()
					.contains(("Selenium"))) {

				System.out.println(driver.findElement(By.id("resultStats")).getText() + " Search Results displayed for Selenium word ");
						
			}
		}
		driver.close();

 	}
	
	
}
