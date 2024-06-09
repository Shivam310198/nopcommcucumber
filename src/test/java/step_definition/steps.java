package step_definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.register;

public class steps {
	WebDriver driver;

	register r;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(options);

		r = new register();
	}

	@When("user open the URL")
	public void user_open_the_url() {
		driver.get("https://demo.nopcommerce.com/");
	}

	@When("user click on register")
	public void user_click_on_register() throws InterruptedException {
		Thread.sleep(2000);
		r.regtbtn();
	}

	@When("user select gender")
	public void user_select_gender() throws InterruptedException {
		Thread.sleep(2000);
		r.male();
	}

	@When("User fill name")
	public void user_fill_name() {
		r.name("Shivam");
		r.lastname("Agrawal");
	}

	@When("user fill DOB")
	public void user_fill_dob() {
		r.dob();
	}

	@When("user fill email")
	public void user_fill_email() {
		r.email("shivam310198@gmail.com");
	}

	@When("user fill pass")
	public void user_fill_pass() {
		r.passw("123456");
	}

	@When("user fill cnf pass")
	public void user_fill_cnf_pass() {
		r.cpass("123456");
	}

	@Then("user click on register button")
	public void user_click_on_register_button1() {
		r.registerb();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
