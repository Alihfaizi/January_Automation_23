package Day14_04092023;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_GoogleSearchLogger_WithOut extends ReusableAnnotations {

    @Test(priority = 1)
    public void searchForCricket() {
        //give a name to the test
        logger.log(LogStatus.INFO, "Navigate to google home page");
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //type the word cricket on search field
        ReusableMethod_Logger.sendKeysMethod(driver, "//*[@name='q']", "Cricket", logger, "Search Field");
        //hit submit on the google search
        ReusableMethod_Logger.submitMethod(driver, "//*[@name='q']", logger, "Search Field");
        //end the logger for test 1
        //reports.endTest(logger);
        //writes back to the report
        //reports.flush();
    }//end of test 1

    @Test(priority = 2)
    public void printOutSearchNumber() {
        //capture the search result
        String result = ReusableMethod_Logger.captureTextMethod(driver, "//*[@id='result-stats']", logger, "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for cricket: " + arrayResult[1]);
        logger.log(LogStatus.INFO, "Search number for cricket: " + arrayResult[1]);
    }//end of test 2

}//end of class