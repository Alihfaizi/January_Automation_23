package Day14_04092023;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class T1_Staples_XpathIndex extends ReusableAnnotations {
    @Test(priority = 1)
            public void searchForKeyWordOnStaples() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to Staples home page");
        driver.navigate().to("https://www.staples.com/");

        //type on search field using sendkeys method
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='searchInput']","iphone",logger, "Search Field");

        //click on search button
        ReusableMethod_Logger.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']",logger, "Search Button");

        Thread.sleep(4000);
        //click on 4th image by xpath
        ReusableMethod_Logger.clickMethod(driver, "(//*[@class='standard-tile__image standard-tile__image_hover'])[4]",logger, "4th Image");
        Thread.sleep(2000);
    }//end of test 1


}//end of class
