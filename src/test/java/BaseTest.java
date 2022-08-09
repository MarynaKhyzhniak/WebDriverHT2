import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String SIGN_IN_URL = "https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SIGN_IN_URL);
    }

    @AfterMethod
    public void tearDown() {
//        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public SignInPage getSignInPage() {
        return new SignInPage(getDriver());
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }
}
