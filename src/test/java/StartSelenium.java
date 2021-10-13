import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
