package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdef {
	WebDriver driver;
	@Given("^Open Dell applications$")
	public void open_Dell_applications() throws Throwable {
		 System.setProperty("Webdriver.chrome.driver", "C:\\Users\\asmai\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		   ChromeOptions run = new ChromeOptions();
		   
		   run.addArguments("--remote-allow-origins=*");
		   driver = new ChromeDriver();
		   driver.get("https://www.dell.com/en-us");
		   
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.manage().window().maximize();
		      
	}

	@Then("^Mouse hover services options$")
	public void mouse_hover_services_options() throws Throwable {
	    Actions ac = new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//span[text()='Services']"))).build().perform();
       Thread.sleep(3000);
       
	}

	@Then("^Click view all services$")
	public void click_view_all_services() throws Throwable {
	WebElement go = driver.findElement(By.linkText("View All Services"));
	    go.click();
		Thread.sleep(5000);
	    driver.close();
	}
	//This is new stepdefinition
	
	
	

	@Then("^Click login$")
	public void click_login() throws Throwable {
	    
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
	   
	}

	@Then("^Enter password$")
	public void enter_password() throws Throwable {
	    
	}
	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
	   
	}

	    
}
