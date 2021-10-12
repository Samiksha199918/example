package stepDefinition;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FrontSteps {
WebDriver driver;
@Before
public void before(){
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
    driver=new ChromeDriver();
}
@After
public void after() {
	driver.quit();
}


	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		
	    driver.get("http://demo.frontaccounting.eu/");
		driver.manage().window().maximize();
	}

	@When("user enters user name as {string} & password as {string} & clicks on the Login Button")
	public void user_enters_user_name_as_password_as_clicks_on_the_login_button(String un, String pwd) {
		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();
	}
	@Then("Login {string} happen")
	public void login_happen(String status) {
		if(status.equals("should happen")) {
			if(driver.getTitle().equals("Main Menu")) {
				System.out.println("Positivie test for Login get passed");
				}
		else {
			System.out.println("Positive Test for Login gets Failed");
			Assert.fail("Positive Test for Login gets Failed");
		}
	}
		else {
			if(driver.getTitle().equals("Main Menu")) {
			System.out.println("Negative Test Failed");
			Assert.fail("Negative Test Failed");
			}
			else {
				System.out.println("Negative Test Passed");
			}
		}
	}
}
