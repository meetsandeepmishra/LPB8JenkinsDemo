package demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Login_Test {
	
	WebDriver driver;
  @Test
  public void Search() {
	  driver.findElement(By.name("q")).sendKeys("manipal");
	  System.out.println(driver.getTitle() );
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Selenium - Automation\\Software\\Chrome\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("http://www.google.com");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
