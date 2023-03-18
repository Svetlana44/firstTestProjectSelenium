import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MainTestFirst {
    public static void main(String[] args) {
/*        System.setProperty("webdriver.chrome.driver", "C:\\projects\\for_selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=9OEIOS1oUeY&list=RDMMeGG-PAL_RcQ&index=21&ab_channel=EurovisionSongContest");
        driver.quit();  */
        /* Mozilla fireFox*/
        /*  System.setProperty("webdriver.mozilla.driver", "C:\\projects\\for_selenium\\geckodriver-v0.32.2-win32\\geckodriver.exe");  */
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.youtube.com");
        String title = driver.getTitle();
        System.out.println(title);
//        WebElement textBox = driver.findElement(By.name("All"));
//        WebElement submitButton = driver.findElement(By.cssSelector("All"));
        driver.manage().deleteAllCookies();

        WebElement yt_formatted_string = driver.findElement(By.xpath("//yt-formatted-string[@title='All']"));

        yt_formatted_string.click();
        System.out.println(yt_formatted_string.getAttribute("id"));

        /*  две строки ниже-один и тот же смысл, первая устарела, вторая-новее */
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.quit();
    }
}
