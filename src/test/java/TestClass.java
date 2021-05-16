import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

    public String driverPath = "C://Users//Lisa//Desktop//Selenium//chrome/chromedriver.exe";
    public WebDriver driver;


    @BeforeEach

    public void launchBrowser() {
        System.out.println("Starting browser! ");
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
    }

    @AfterEach

    public void terminateBrowser() {
        System.out.println("Closing browser! ");
        driver.close();
    }



    @Test
    @Order(1)
    @DisplayName("Check Title Google Search")
    public void GoogleSearch() {

        String expectedTitleSearch = "Software Testing - Sök på Google";
        String actualTitle = GoogleSearch.Search(driver);

        Assertions.assertEquals(expectedTitleSearch,actualTitle);
    }



    @Test
    @Order(2)
    @DisplayName("Check Title ActitTime")
    public void ActitTime() {

        String expectedTitle = "Free Timesheet Online Trial";
        String actualTitle = Actitime.Search(driver);

        Assertions.assertEquals(expectedTitle,actualTitle);
    }

    @Test
    @Order(3)
    @DisplayName("Check Title Adlibris \uD83E\uDD7A ")
    public void AdlibrisTest() {

        String expectedTitle = "Kassa | Adlibris";
        String actualTitle = Adlibris.Search(driver);

        Assertions.assertEquals(expectedTitle,actualTitle);
    }


}