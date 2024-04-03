package loginModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {



		  WebDriver driver;

		    @BeforeClass
		    public void setUp() {
	        driver  = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    }
	        
		    @Test
		    public void testLogin() {
	        //Navigate to the Url
	        driver.get("https://www.raptorsupplies.com/");
	        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

	        

	        driver.findElement(By.id("email")).sendKeys("shusbingh0298@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Abc@12345");
	        driver.findElement(By.name("send")).click();
	        System.out.println("Login successfully");
	       
	}

	       @AfterClass
	      public void tearDown()  {
	      System.out.println("CLose the browser");
	      if (driver != null) {
	        driver.quit();
	    }
		
}
}
