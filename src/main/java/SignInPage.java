import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    private static final String EMAIL_1 = "usert8461@gmail.com";
    private static final String PASSWORD_1 = "!123Qweasd";

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='zQJV3']//button[@type='button']")
    private WebElement nextButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void logInWithExistingAccount() {
        emailField.sendKeys(EMAIL_1);
        nextButton.click();
        waitVisibilityOfElement(10, passwordField);
        passwordField.sendKeys(PASSWORD_1);
        nextButton.click();
    }
}
