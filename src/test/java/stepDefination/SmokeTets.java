package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTets {
	
	
	WebDriver driver;
	@Given("^when the firefox is open$")
	public void when_the_firefox_is_open() throws Throwable {

	System.setProperty("webdriver.gecko.driver", "C:\\selenium jars and files\\geckodriver.exe");	
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	
	}

	@When("^when i enter \"(.*?)\" and \"(.*?)\"$")
	public void when_i_enter_and(String arg1, String arg2) throws Throwable {
	
	driver.findElement(By.id("email")).sendKeys("kk23_vanteru@yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("infoguyusad12");
	
	}

	@Then("^login successful$")
	public void login_successful() throws Throwable {

		driver.findElement(By.id("loginbutton")).click();
	
	}

}
