import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Actitime {
    public static String Search(WebDriver driver){
       driver.get("https://www.actitime.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Try Free")).click();
        driver.findElement(By.id("first-name")).sendKeys("Lina");
        driver.findElement(By.id("last-name")).sendKeys("Snöre");
        driver.findElement(By.id("email")).sendKeys("linsno-1@student.ltu.se");
        driver.findElement(By.id("company")).sendKeys("LTU");
        return driver.getTitle();
    }
}
