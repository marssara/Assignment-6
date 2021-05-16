import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Adlibris {
    public static String Search(WebDriver driver){
        driver.get("https://Adlibris.Com/se/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("praktisk mjukvarutestning" + Keys.RETURN);
        driver.findElement(By.className("search-result__product__name")).click();
        driver.findElement(By.className("product__add-to-cart")).click();
        driver.findElement(By.className("material-icons__shopping_cart")).click();
        driver.findElement(By.linkText("Till kassan")).click();
        return driver.getTitle();
    }
}