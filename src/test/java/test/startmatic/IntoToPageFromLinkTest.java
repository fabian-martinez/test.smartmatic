package test.startmatic;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class IntoToPageFromLinkTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        //Initiating your chromedriver
        driver = new ChromeDriver();
    }

    @Test
    public void IntoToCeleniumDocumentationFromCeleniumHomePage(){
        //open browser with desried URL
        driver.get("https://www.selenium.dev/");

        List<WebElement> buttoms = driver.findElements(new By.ByCssSelector(".selenium-button selenium-webdriver"));

        for (WebElement buttom:buttoms){
            System.out.println(buttom.getText());
        }

    }

    @AfterClass
    public static void finishAll(){
        //closing the browser
        driver.close();
        System.out.println("Finish Tests");
    }
}
