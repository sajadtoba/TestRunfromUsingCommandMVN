package homeStapleSecondLevelUsingParameter;

import basicSecondLevelAmzaonClass.CommonAPISecondLevelAmazonUsingParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomeStapleSecondLevelUsingParameter extends CommonAPISecondLevelAmazonUsingParameter {
    @Test
    public void testSearchOneItem(){
        driver.findElement(By.cssSelector("#searchInput")).sendKeys("Hp Laptop"+ Keys.ENTER);
    }
}
