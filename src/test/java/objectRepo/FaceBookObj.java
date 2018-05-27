package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookObj {
	public static class Facebook {
		  public static WebElement EmailField(WebDriver driver) {
			  WebElement element = null;
			  element = driver.findElement(By.id("email"));
			  return element;
		  }
		  
		  public static WebElement PassField(WebDriver driver) {
			  WebElement element = null;
			  element = driver.findElement(By.id("pass"));
			  return element;
		  }
		  
		  public static WebElement LoginBtn(WebDriver driver) {
			  WebElement element = null;
			  element = driver.findElement(By.id("u_0_2"));
			  return element;
		  }
		}
}
