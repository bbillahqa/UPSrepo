package StepDefinitations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SignupStepDefinitation {

	WebDriver driver;

	@Given("^user is already on UPS Home page$")
	public void user_is_already_on_UPS_Home_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		driver.get("https://www.ups.com/us/en/Home.page?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^title of sign up page is UPS Signup$")
	public void title_of_sign_up_page_is_UPS() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Home: UPS", title);
	}

	@Then("^user clicks on sign up button from home page$")
	public void user_clicks_on_sign_up_button() {
		WebElement signUp = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[2]/a"));
		signUp.click();

	}

	@Then("^user fills out the name$")
	public void user_fills_out_the_name() {
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
		name.sendKeys("Baki");
		
		
	}

	@Then("^user fills out the email$")
	public void user_fills_out_the_email() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
		email.sendKeys("Jonnybrown@gmail.com");
	}

	@Then("^user fills out the user ID$")
	public void user_fills_out_the_user_ID() {
		WebElement userId = driver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
		userId.sendKeys("Jonnybrown2018");
	}

	@Then("^user fills out the password$")
	public void user_fills_out_the_password() {
		WebElement password = driver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
		password.sendKeys("Jonnybrown2018");
	}

	@Then("^user clicks on I agree button$")
	public void user_clicks_on_I_agree_button() {
		WebElement iAgree = driver.findElement(By.xpath("//*[@id=\"ups-checkbox_group\"]/div/span"));
		iAgree.click();
	}

	@Then("^user clicks the sign up button$")
	public void user_clicks_the_sign_up_button() {
		WebElement signUpbtn = driver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
		signUpbtn.click();
	}

}
