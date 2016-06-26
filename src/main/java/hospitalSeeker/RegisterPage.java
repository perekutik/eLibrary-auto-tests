package hospitalSeeker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public static final String SUCCESSFULL_REGISTRATION_TEXT = "h3.text-success.text-center.menu";
	public static final String PLEASE_REGISTER_TITLE = "/html/body/section/div/div/div/div/div/form/fieldset/h2";
	public static final String WARNING_EMAIL_TEXT = "span.has-error.text-danger";
	public static final String WARNING_PASSWORD = "/html/body/section/div/div/div/div/div/form/fieldset/div[2]/span";
	public static final String WARNING_CONFIRM_PASSWORD = "/html/body/section/div/div/div/div/div/form/fieldset/div[3]/span";

	@FindBy(id = "email")
	public WebElement emailRegister;

	@FindBy(id = "password")
	public WebElement passwordRegister;

	@FindBy(id = "confirmPassword")
	public WebElement confirmPasswordRegister;

	@FindBy(id = "registerSubmit")
	public WebElement registerButton;
	
	@FindBy(id = "loginRedirect")
	public WebElement loginButton;

	@FindBy(css = SUCCESSFULL_REGISTRATION_TEXT)
	public WebElement successfullRegistration;

	@FindBy(css = WARNING_EMAIL_TEXT)
	public WebElement warningExistingEmail;

	@FindBy(id = "email-error")
	public WebElement warningByEmail;

	@FindBy(id = "password-error")
	public WebElement insecurePassword;

	@FindBy(css= "span.has-error.text-danger")
	public WebElement weakPassword;

	@FindBy(xpath = "//i[contains(@class, 'error help-block') and text() = 'Please provide a password']")
	public WebElement confirmPasswordError;

	@FindBy(xpath = "//i[contains(@class, 'error help-block') and text() = 'Please enter the same password as above']")
	public WebElement withoutPasswordError;

	public static RegisterPage init(WebDriver driver) {
		return PageFactory.initElements(driver, RegisterPage.class);
	}
}