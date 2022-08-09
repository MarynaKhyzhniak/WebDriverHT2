import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailTests extends BaseTest {

    @Test
    public void existingUserIsLoggedIn() {
        getSignInPage().logInWithExistingAccount();
        getHomePage().waitUrlToLoad("https://myaccount.google.com/");
        getHomePage().isTextPresent("Harry Potter!");
    }

    @Test
    public void emailIsSuccessfullySent() {

    }
}
