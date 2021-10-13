package test.startmatic;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

import static org.junit.Assert.*;

public class IntoToPageFromLinkTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUpTestSet(){
        //setting the driver executable
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        //Initiating your chromedriver
        driver = new ChromeDriver();
    }

    @Test
    public void IntoToSeleniumDocumentationFromSeleniumHomePage(){
        //open browser with desried URL
        driver.get("https://www.selenium.dev/");

        List<WebElement> buttons = driver.findElements(new By.ByXPath("//a[contains(@class, 'selenium-button') and contains(@class, 'selenium-webdriver')]"));

        WebElement button = null;

        if (buttons.size() == 1) {
            button = buttons.get(0);
        }
        assertNotNull(button);
        assertEquals(button.getText(),"READ MORE");

        button.click();

        WebElement h1SecondPage = new WebDriverWait(driver, 10).until(driver -> driver.findElement(By.tagName("h1")));

        assertEquals(h1SecondPage.getText(),"WebDriver");

    }

    @AfterClass
    public static void finishTestSet(){
        //closing the browser
        driver.close();
        System.out.println("Finish Tests");
    }
}
