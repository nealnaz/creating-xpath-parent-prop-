import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customisedxpath {


    WebDriver driver;

    @Test
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
//        creating xpath starting with html tag and attribute and value
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xyz");

        driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("123");

//        using and operator in creating xpath to make it robust
        driver.findElement(By.xpath("//input[@type='submit' and @class='btn btn-small']")).submit();











    }
}

