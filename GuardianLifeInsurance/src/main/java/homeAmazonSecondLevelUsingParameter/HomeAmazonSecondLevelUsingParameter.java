package homeAmazonSecondLevelUsingParameter;

import basicSecondLevelAmzaonClass.CommonAPISecondLevelAmazonUsingParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomeAmazonSecondLevelUsingParameter extends CommonAPISecondLevelAmazonUsingParameter {
@Test
    public void testSearchFewItems(){
    driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Electric Fan"+ Keys.ENTER);
    driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();

    //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Office Chair"+Keys.ENTER);
    //driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
    //driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Hp computer"+Keys.ENTER);
}
}
