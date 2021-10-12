package test.startmatic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IntoToPageFromLinkTest {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    }

    @Test
    public void IntoToGoogle(){
        //Initiating your chromedriver
        WebDriver driver = new ChromeDriver();

        //open browser with desried URL
        driver.get("https://www.google.com");

        //closing the browser
        //driver.close();
    }
}
