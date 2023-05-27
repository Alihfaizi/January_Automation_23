package Day9_03252023;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;

public class T4_ReusableConceptUPS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = ReusableMethod.defineChromeDriver();

        //navigate to usp website
        driver.navigate().to("https://www.ups.com/us");

        ReusableMethod.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

        Thread.sleep(2000);
        ReusableMethod.clickMethod(driver,"//*[text()='Schedule a Pickup']", "Schedule a pickup");

        ReusableMethod.clickMethod(driver,"//*[@id='freightPickupLinkId']", "Schedule a pickup");
    }//end of main
}//end of class
