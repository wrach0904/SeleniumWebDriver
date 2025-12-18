package pl.mystoretestlab.selenium;


import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pl.mystoretestlab.BasePage;
import pl.mystoretestlab.MyStorePage;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //to make BeforeEach non-static

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected MyStorePage myStorePage;
    private final String AUT_URL = "https://mystore-testlab.coderslab.pl/index.php";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(AUT_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        myStorePage = new MyStorePage();
    }



}


