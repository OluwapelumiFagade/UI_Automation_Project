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
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Fetch URL
        driver.get("https://monosnap.com/");

        //wait for the page to load
        Thread.sleep(5000);

        //Maximize the page
        driver.manage().window().maximize();

        //Get page title
        System.out.println(driver.getTitle());
        //Make the page wait to fully load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click accept cookies
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[3]/div[2]")).click();

        //Locate and click the sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/div[3]/span/text()")).click();

        //Locate the username field and input the value
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[1]")).sendKeys("oluwapelumifagade@yahoo.com");

        //Locate the password field and input the value
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[2]")).sendKeys("QAtesting@123");

        //Click the Login button
        driver .findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
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
