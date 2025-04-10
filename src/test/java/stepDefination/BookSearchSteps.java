package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSearchSteps {
	WebDriver driver;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://danube-webshop.herokuapp.com/");
	}
	@When("user search the novel books")
	public void user_search_the_novel_books() {
	    driver.findElement(By.xpath("//a[contains(text(), 'Crime & Thrillers')]")).click();
	    }
	@Then("user should get novel books result")
	public void user_should_get_novel_books_result() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("crime"));
	}
	
	@When("user search the Fantasy books")
	public void user_search_the_fantasy_books() {
		driver.findElement(By.xpath("//a[contains(text(), 'Fantasy')]")).click();
		
	}
	@Then("user should get Fantasy books result")
	public void user_should_get_fantasy_books_result() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("fantasy"));
	}
	
//	@AfterStep
//	public void attachScreen(Scenario sc) {
////		if(sc.isFailed()) {
//		TakesScreenshot screen = (TakesScreenshot) driver;
//		byte[] img = screen.getScreenshotAs(OutputType.BYTES);
//		sc.attach(img, "image/png", "ScreenImg");
////		}
//	}

}
