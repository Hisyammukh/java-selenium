package Config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
    public static WebDriver driver;

    public static void initialize(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/utils/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://seller.gudangada.com/");
        driver.manage().window().fullscreen();

    }

    public static void quit(){
        driver.quit();
    }
    
}
