package Day12_04022023;

import Reusable_Package.ReusableAnnotations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class T2_GetElementsCount extends ReusableAnnotations {

    @Test
    public void getNavListCount(){
        driver.navigate().to("https://www.usps.com");
        //store elements list in an arraylist with common property
        WebDriverWait wait = new WebDriverWait(driver,7);
        ArrayList<WebElement> navList = new ArrayList<>(wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class,'menuheader')]"))));
        System.out.println("Count: " + navList.size());
    }//end of Test
}//end of class
