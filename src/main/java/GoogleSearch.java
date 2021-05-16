import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
    public static String Search(WebDriver driver){
        driver.get("https://www.google.com");

        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("Software Testing" +Keys.RETURN);
        return driver.getTitle();
    }
}
