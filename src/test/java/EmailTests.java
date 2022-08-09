import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailTests extends BaseTest {

    @Test
    public void existingUserIsLoggedIn() {
        getSignInPage().logInWithExistingAccount();
        getHomePage().waitUrlToLoad("https://mail.google.com/");
    }

    @Test
    public void emailIsSuccessfullySent() {
        existingUserIsLoggedIn();
        getHomePage().createAndSendEmail();
        getHomePage().isTextPresent("Сообщение отправлено.");
    }
}
