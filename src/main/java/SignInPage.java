import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage {

    private static final String EMAIL_1 = "grrriffindor@gmail.com";
    private static final String PASSWORD_1 = "!123Qweasd";

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='zQJV3']//button[@type='button']")
    private WebElement nextButton;

    @FindBy(className = "class='VfPpkd-vQzf8d'")
    private WebElement notNowLink;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void logInWithExistingAccount() {
        emailField.sendKeys(EMAIL_1);
        nextButton.click();
        passwordField.sendKeys(PASSWORD_1);
        nextButton.click();
        notNowLink.click();
    }
}
