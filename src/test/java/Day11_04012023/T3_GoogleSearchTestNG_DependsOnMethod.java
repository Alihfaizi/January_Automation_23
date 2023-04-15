package Day11_04012023;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T3_GoogleSearchTestNG_DependsOnMethod {
    //to make variable global, you must declare it outside of the automation methods
    WebDriver driver;

    //@Test is a replacements of the main method to execute your code
    //@Test will get executed by alphabetical order of the name
    @Test(priority = 1)
    public void searchForBMW(){
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //enter bmw on search field
        ReusableMethod.sendKeysMethod(driver, "//*[@name='q']", "BMW", "Search Field");
        //submit of google search
        ReusableMethod.submitMethod(driver,"//*[@name='btnK']", "Google Search");
    }//end of test 1

    @Test(dependsOnMethods = "searchForBMW")
            public void captureSearchNumberForBMW() {
        //capture the text and print out the number
        String result = ReusableMethod.captureTextMethod(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW: " + arrayResult[1]);
    }//end of test 2

    @Test(dependsOnMethods = {"searchForBMW","captureSearchNumberForBMW"})
    public void captureOnFinance() throws InterruptedException {
        Thread.sleep(2000);
        ReusableMethod.clickMethod(driver, "//div[text()='Finance']", "Finance Button");
    }//end of test 3

    //create before suite method to define your chrome driver
    @BeforeSuite
    public void setUpDriver(){
        driver = ReusableMethod.defineChromeDriver();
    }//end of before suite

    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite
}//end of class
