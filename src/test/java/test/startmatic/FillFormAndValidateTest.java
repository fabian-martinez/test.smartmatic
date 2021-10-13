package test.startmatic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormAndValidateTest {

    static WebDriver driver;

    @BeforeClass
    public static void SetUpTestSet(){
        driver = new ChromeDriver();
    }



    @AfterClass
    public static void FinishTestSet(){

    }
}
