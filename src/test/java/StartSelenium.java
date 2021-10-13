import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;


    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();

        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
       // wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    }
@Test
    public void testName(){
    WebElement element = wd.findElement(By.tagName("a"));
    wd.findElement(By.cssSelector("a"));
    wd.findElement(By.cssSelector("div"));

    List<WebElement> elements = wd.findElements(By.tagName("a"));
    System.out.println(elements.size());

    wd.findElement(By.className("container"));

    wd.findElement(By.cssSelector(".container"));

    wd.findElement(By.className("navbar-component_nav__1X_4m"));

    wd.findElement(By.id("root"));
    wd.findElement(By.cssSelector("#root"));

  /*  wd.findElement(By.className(""));


    wd.findElement(By.id(""));

    wd.findElement(By.tagName(""));
*/

    wd.findElement(By.linkText("HOME"));

    wd.findElement(By.cssSelector("[href]"));

    wd.findElement(By.cssSelector("[href='/login']"));

    wd.findElement(By.cssSelector("[href ^='/lo']")); //start

    wd.findElement(By.cssSelector("[href $='in']")); //end
    wd.findElement(By.cssSelector("[href *='ogi']")); //contains


    wd.findElement(By.partialLinkText("lo"));


}
@Test
public void testName2(){

}

@AfterMethod
    public void postCondition(){
//wd.close();
//wd.quit();
}


}
