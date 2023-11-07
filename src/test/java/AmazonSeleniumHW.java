
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSeleniumHW {
    private WebDriver driver;
    JavascriptExecutor js;

    @BeforeAll
    public static void setupAll(){
        WebDriverManager.chromedriver().setup();}
//    private WebDriver driver;
//    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void amazonSelenium() {
        driver.get("https://www.amazon.de/?&tag=hydraamazon09-21&ref=pd_sl_781ozcfkw7_e&adgrpid=153217435865&hvpone=&hvptwo=&hvadid=674893335740&hvpos=&hvnetw=g&hvrand=3216249593203623386&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9044565&hvtargid=kwd-10573980&hydadcr=12763_2327837");
        driver.manage().window().setSize(new Dimension(1536, 960));
        {
            WebElement element = driver.findElement(By.id("nav-link-accountList"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
//        driver.findElement(By.cssSelector("#nav-flyout-icp .nav-link:nth-child(4) span:nth-child(2)")).click();
//        driver.findElement(By.linkText("Best Sellers")).click();
    }
}




