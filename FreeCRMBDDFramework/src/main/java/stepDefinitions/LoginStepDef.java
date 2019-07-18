package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {
	
	WebDriver driver;
	
	
	
	
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	    
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

	
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		
	}
		@Then("^user is on Home page$")
		public void user_is_on_Home_page() throws Throwable {
        driver.findElement(By.id("welcome")).isDisplayed();
        
	        
	}
		
		@Then("^user logs out$")
		public void user_logs_out() throws Throwable {
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.cssSelector("#welcome-menu ul li:nth-child(2) a")).click();
	
	
		}
}
