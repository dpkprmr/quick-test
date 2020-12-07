package testCases;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class InvokeBrowser {
	 WebDriver driver;
	 
  @Test(groups = { "Test"})
  public void f() {
	  driver.findElement(By.linkText("Core Java")).click();     
  }

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
	  System.out.println("Before Class Execution");
	  System.setProperty("webdriver.chrome.driver", "H:\\dpkprmr Work\\Integrichain\\quick-test\\src\\test\\resources\\drivers\\chromedriver.exe");
      
      // Instantiate a ChromeDriver class.     
  driver=new ChromeDriver();  
   
    // Launch Website  
 driver.navigate().to("http://www.javatpoint.com/");  
   
  //Maximize the browser  
   driver.manage().window().maximize();  
 
  }

  @AfterClass(alwaysRun = true)
  public void afterClass() {
	  driver.quit();
  }

}
