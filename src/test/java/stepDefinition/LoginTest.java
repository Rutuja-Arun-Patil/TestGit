package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

WebDriver driver ;

@Given("^Open Firefox  and start application$")
public void open_Firefox_and_start_application() throws Throwable {
	
    System.setProperty("webdriver.gecko.driver", "C:\\Automation\\WebDrivers\\geckodriver.exe");
    //System.setProperty("webdriver.chrome.driver", "C:\\\\Automation\\\\WebDrivers\\\\chromedriver.exe");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    
}

@When("^I enter valid user name and valid password$")
public void i_enter_valid_user_name_and_valid_password() throws Throwable {
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys("7875245135");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.id("pass")).sendKeys("balaji");
	
    
}

@Then("^user should be able to Login successfully$")
public void user_should_be_able_to_Login_successfully() throws Throwable {
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.name("login")).click();
}

	
}
