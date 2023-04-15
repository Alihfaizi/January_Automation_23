package Day13_04082023;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod;
import Reusable_Package.ReusableMethod_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class T2_Staples_ReusableMethods_Logger extends ReusableAnnotations {
    @Test(priority = 1)
            public void searchForKeyWordOnStaples() {
        logger.log(LogStatus.INFO, "Navigate to Staples home page");
        driver.navigate().to("https://www.staples.com/");

        //type on search field using sendkeys method
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger, "Search Field");

        //click on search button
        ReusableMethod_Logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger, "Search Button");
    }//end of test 1

    @Test(priority = 2)
        public void printOutSearchNumber(){
        //click on the airpod pros
        ReusableMethod_Logger.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,logger,"Airpods Image");
        //add product to cart
        ReusableMethod_Logger.clickMethod(driver,"//*[@id='ctaButton']", logger, "Add to cart");
        //capture starting at price and print it out
        String result = ReusableMethod_Logger.captureTextMethod(driver,"//*[contains(text(),'starting at')]", logger,"Price");
        System.out.println("Iphone Result is: " + result);
        logger.log(LogStatus.INFO, "Iphone result is: " + result);
    }//end of test 2
}//end of class
