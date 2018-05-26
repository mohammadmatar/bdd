package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleObj {
	public static class Google {
		  public static WebElement SearchField(WebDriver driver) {
			  WebElement element = null;
			  element = driver.findElement(By.id("lst-ib"));
			  return element;
		  }
		  
		  public static WebElement SearchBtn(WebDriver driver) {
			  WebElement element = null;
			  element = driver.findElement(By.name("btnK"));
			  return element;
		  }
	}

}
