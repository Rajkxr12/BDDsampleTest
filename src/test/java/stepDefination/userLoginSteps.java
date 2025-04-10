package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userLoginSteps {
	WebDriver driver;
	ChromeOptions options;

@Given("user is on login page")
public void user_is_on_login_page() {
	options = new ChromeOptions();
	options.addArguments("--incognito");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/login");
	
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.className("radius")).click();
}


@Then("user verifies the login")
public void user_verifies_the_login() {

	boolean isUserValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
	Assert.assertTrue(isUserValid);
}

@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("radius")).click();
}

@When("user enters the credentials")
public void user_enters_the_credentials(DataTable userdata) {
	List<Map<String, String>> data = userdata.asMaps();
	String username = data.get(0).get("username");
	String password = data.get(0).get("password");
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(password);
	driver.findElement(By.className("radius")).click();
}


}
