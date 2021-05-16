import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;
import java.net.MalformedURLException;

public class Main {

        static protected WebDriver driver;
        static String nodeUrl;

        public static void main(String[] args) {

            try{
            nodeUrl = "http://54.234.38.6:4444/wd/hub";

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setBrowserName("chrome");

            driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
            driver.manage().window().maximize();
            driver.get("https://Adlibris.Com/se/");

            driver.findElement(By.name("q")).sendKeys("praktisk mjukvarutestning" + Keys.RETURN);

            System.out.println(driver.getTitle());

            }
            catch(MalformedURLException e) {
             e.printStackTrace();
            }

        }
    }