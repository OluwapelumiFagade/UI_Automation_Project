package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/");
        //wait for the page to load
        Thread.sleep(5000);
        //Maximize the page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Locate the username or email field
        driver.findElement(By.id("email")).sendKeys("itunu4dolls@yahoo.com");
        //Locate the password field
        driver.findElement(By.id("pass")).sendKeys("QAtesting@123");
        //Click the Log In button
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
            Thread.sleep(20000);
            driver.quit();
    }

    //Initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
 