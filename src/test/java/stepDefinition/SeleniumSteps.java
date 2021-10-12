package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SeleniumSteps {
	WebDriver driver;
	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}


	

	@When("User Clicks on Downloads Link")
	public void user_clicks_on_downloads_link() {
	    driver.findElement(By.linkText("Downloads")).click();
	}

	@Then("title should be {string}")
	public void title_should_be(String string) {
	    Assert.assertEquals("Downloads | Selenium", driver.getTitle());
	    driver.quit();
	}


}
