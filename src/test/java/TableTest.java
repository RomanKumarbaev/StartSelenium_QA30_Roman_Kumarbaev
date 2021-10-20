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
    //HOMEWORK
    @Test
    public  void tableHW(){
        System.out.println("<<<HOMEWORK 1>>>");
        System.out.println();

        WebElement col1 = wd.findElement(By.cssSelector("tr:nth-child(4) td:first-child"));
        WebElement col2 = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)"));
        WebElement col3 = wd.findElement(By.cssSelector("tr:nth-child(4) td:last-child"));

        //xpath*********************************************************************************************************
        WebElement W=wd.findElement(By.xpath("//tr[4]"));
        System.out.println(W.getText());




        /*System.out.println("row4 = "+col1.getText()+" | "+col2.getText()+" | "+col3.getText());
        System.out.println();

        Assert.assertEquals(col2.getText(),"Francisco Chang");*/

    }

    @Test
    public void  tableHW2(){
        System.out.println("<<<Homework 2>>>");
        System.out.println();

        List<WebElement> countRows = wd.findElements(By.tagName("tr"));

        System.out.println("Numbers of rows = "+countRows.size());
        System.out.println();

        List<WebElement> countColumns1 = wd.findElements(By.tagName("th"));
        List<WebElement> countColumns2 = wd.findElements(By.tagName("td"));

        int a= countColumns1.size(), b=countColumns2.size(), c=a+b;
        System.out.println("Numbers of Columns = " + c);
        System.out.println();

        //xPath ********************************************************************************************************
        List<WebElement> col1 = wd.findElements(By.xpath("//th"));
        List<WebElement> col2 = wd.findElements(By.xpath("//td"));
        a = col1.size();
        b = col2.size();

        System.out.println("Numbers of Columns xPath = " + c);
        System.out.println();


        /*List<WebElement> lastColunm = wd.findElements(By.cssSelector("td:last-child"));

        for (WebElement print :lastColunm) {
            System.out.println(print.getText());
        }*/

        //xPath*********************************************************************************************************

        List<WebElement> lastCol = wd.findElements(By.xpath("//td[last()]"));

        for (WebElement s:lastCol) {
            System.out.println(s.getText());
        }



        WebElement find = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        Assert.assertEquals(find.getText(),"Maria Anders");

    }


    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}
