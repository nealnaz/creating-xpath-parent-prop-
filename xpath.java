import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    WebDriver driver;

    @Test
    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zubair\\Desktop\\NewAutomation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
//        user needs to click on "For sale" on the homepage

//        Created XPATH from link text using "parent" property to create robust xpath
        driver.findElement(By.xpath("//a[text()='For sale']//parent::li[@class='main-footer-nav__sublist-item']")).click();


    }
}


