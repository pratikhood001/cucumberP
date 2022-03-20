package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps 
{
	WebDriver driver;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() 
	{	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("user open URL {string}")
	public void user_open_url(String URL) 
	{
		 driver.get(URL);	
	}

	@When("user enter Username as {string} and Password as {string}")
	public void user_enter_username_as_and_password_as(String Username, String Password) 
	{	 
		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys(Username);
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys(Password);
		
	}

	@When("Click on login button.")
	public void click_on_login_button() 
	{
		 driver.findElement(By.id("ctl00_CPHContainer_btnLoginn")).click();
	}
}
