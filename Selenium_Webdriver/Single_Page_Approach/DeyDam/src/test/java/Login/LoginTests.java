package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //wait for the page to load
        Thread.sleep(5000);
        //Maximize the page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Locate the username field
        driver.findElement(By.id("username")).sendKeys("Hightea90");
        //Locate the password field
        driver.findElement(By.id("password")).sendKeys("testing123");
        //Click on the Sign In button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
            Thread.sleep(10000);
            //close the browser after test
                driver.quit();
    }

    //Initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

}