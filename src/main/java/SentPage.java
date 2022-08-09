import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'T-Jo J-J5-Ji T-Jo-auq')]")
    private WebElement allCheckbox;

    @FindBy(xpath = "//div[@data-tooltip='Отправленные']")
    private WebElement sentLink;

    @FindBy(xpath = "//div[@data-tooltip='Удалить']")
    private WebElement deleteAllIcon;

    public SentPage(WebDriver driver) {
        super(driver);
    }

    public void emptySentFolder() {
        waitElementToBeClickable(10, sentLink);
        sentLink.click();
        allCheckbox.click();
        deleteAllIcon.click();
    }
}
