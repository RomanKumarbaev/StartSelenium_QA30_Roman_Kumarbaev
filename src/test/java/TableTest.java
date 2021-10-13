import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd=new ChromeDriver();

       wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void tableTestCss() {
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));

        String text = canada.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Canada");
        Assert.assertTrue(text.contains("Can"));

    }


    @AfterMethod
    public void tearDown(){

wd.quit();
    }



}
