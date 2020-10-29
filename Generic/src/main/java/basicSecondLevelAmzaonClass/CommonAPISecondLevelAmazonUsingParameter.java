package basicSecondLevelAmzaonClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonAPISecondLevelAmazonUsingParameter {
    public WebDriver driver;
    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","/Users/abc/IdeaProject/CapitapBank/Generic/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
