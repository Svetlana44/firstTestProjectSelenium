import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class MainTestFirst {
    public static void main(String[] args) {
/*        System.setProperty("webdriver.chrome.driver", "C:\\projects\\for_selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=9OEIOS1oUeY&list=RDMMeGG-PAL_RcQ&index=21&ab_channel=EurovisionSongContest");
        driver.quit();  */
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.youtube.com");
    }
}
