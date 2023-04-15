package Day11_04012023;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_GoogleSearchTestNG_Priorties {
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

    @Test(priority = 2)
            public void captureSearchNumberForBMW() {
        //capture the text and print out the number
        String result = ReusableMethod.captureTextMethod(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW: " + arrayResult[1]);
    }//end of test 2

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
