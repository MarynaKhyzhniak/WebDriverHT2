import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String RECIPIENTS = "grrriffindor@gmail.com";
    private static final String TOPIC = "Hello World!";
    private static final String MESSAGE = "This is test message.";

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']")
    private WebElement writeButton;

    @FindBy(xpath = "//div[@class='dC']")
    private WebElement sendButton;

    @FindBy(xpath = "//div[@data-tooltip='Отправленные']")
    private WebElement sentLink;

    @FindBy(name = "to")
    private WebElement recipientsField;

    @FindBy(name = "subjectbox")
    private WebElement topicField;

    @FindBy(xpath = "//div[contains(@class,'Am Al editable')]")
    private WebElement messageField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void createAndSendEmail() {
        writeButton.click();
        waitVisibilityOfElement(10, recipientsField);
        recipientsField.sendKeys(RECIPIENTS);
        topicField.sendKeys(TOPIC);
        messageField.sendKeys(MESSAGE);
        sendButton.click();
    }
}
