package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	public static WebDriver driver;
	public static final String GoogleDriverPath = "/home/matar/Downloads/drivers/chromedriver";

	@Given("^User is on Facebook Home Page$")
	public void user_is_on_Facebook_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", GoogleDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
 	}

	@When("^User Navigate to Login Section$")
	public void user_Navigate_to_Login_Section() throws Throwable {
		FaceBookObj.Facebook.EmailField(driver).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
 		 FaceBookObj.Facebook.EmailField(driver).sendKeys("asdwd@adds.com");
		 FaceBookObj.Facebook.PassField(driver).sendKeys("1111111");
	}
	
	@When("^User Click on Login Button$")
	public void user_Click_on_Login_Button() throws Throwable {
		 FaceBookObj.Facebook.LoginBtn(driver).click();

	}

	@Then("^Message displayed Login Failed$")
	public void message_displayed_Login_Failed() throws Throwable {
		try {
			Thread.sleep(1000);

			String LoginErrors = driver.findElement(By.xpath("//div[@id='globalContainer']/div[3]/div/div/div"))
					.getText();
			String pass = "^The password you’ve entered is incorrect\\. Forgot Password[\\s\\S]$";
			String email = "^The password you’ve entered is incorrect\\. Forgot Password[\\s\\S]$";

			if (LoginErrors != null) {

				if ((LoginErrors.contains(pass)) || (LoginErrors.contains(email))) {
					if (pass != "") {
						System.out.println(LoginErrors);
					} else if (email != "") {
						System.out.println(LoginErrors);
					}
					System.out.println("Could not login with invalid credentials");
				}
			}
		} catch (Error e) {
			System.out.println(e);
		}
		driver.close();
	}
	
	
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

				System.out.println(" Search Results displayed for Selenium word "
						+ driver.findElement(By.id("resultStats")).getText());
			}
		}
		driver.close();

 	}
	
	
	
	
}