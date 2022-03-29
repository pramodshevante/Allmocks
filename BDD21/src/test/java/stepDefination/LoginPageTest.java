package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://opensource-demo.orangehrmlive.com/");

	}


	
	@When("user enter valid and valid password")
	public void user_enter_valid_and_valid_password() {
		System.out.println("aaa");
	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("ccc");
	}




}
