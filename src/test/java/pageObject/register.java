package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class register {

	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a\"")
	WebElement regs;

	@FindBy(id = "gender-male")
	WebElement male;

	@FindBy(id = "gender-female")
	WebElement female;

	@FindBy(id = "FirstName")
	WebElement fname;

	@FindBy(id = "LastName")
	WebElement lname;

	@FindBy(name = "DateOfBirthDay")
	WebElement date;

	@FindBy(name = "DateOfBirthMonth")
	WebElement month;

	@FindBy(name = "DateOfBirthYear")
	WebElement year;

	@FindBy(name = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement pass;

	@FindBy(id = "ConfirmPassword")
	WebElement cnfpass;

	@FindBy(id = "register-button")
	WebElement regbtn;

	public void regtbtn() {
		regs.click();
	}

	public void male() {
		male.click();
	}

	public void female() {
		female.click();
	}

	public void name(String ffname) {
		fname.sendKeys(ffname);
	}

	public void lastname(String llname) {
		lname.sendKeys(llname);
	}

	public void dob() {
		Select drpDay = new Select(date);
		drpDay.selectByValue("31");

		Select drpmonth = new Select(month);
		drpmonth.selectByValue("1");

		Select drpyear = new Select(year);
		drpyear.selectByValue("1998");
	}

	public void email(String emaill) {
		email.sendKeys("emaill");
	}

	public void passw(String pass1) {
		pass.sendKeys("pass1");
	}

	public void cpass(String pass2) {
		cnfpass.sendKeys("pass2");
	}

	public void registerb() {
		regbtn.click();
	}

}