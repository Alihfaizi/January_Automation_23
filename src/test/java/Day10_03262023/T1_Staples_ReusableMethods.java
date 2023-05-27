package Day10_03262023;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;

public class T1_Staples_ReusableMethods {
    public static void main(String[] args) throws InterruptedException {

        //set up chrome driver
        WebDriver driver = ReusableMethod.defineChromeDriver();

        //navigate to staples
        driver.navigate().to("https://www.staples.com/");

        //type on search field using sendkeys method
        ReusableMethod.sendKeysMethod(driver,"//*[@id='searchInput']","iphone","Search Field");

        //click on search button
        ReusableMethod.clickMethod(driver,"//*[@class='search-bar-input__searchIcon']", "Search Button");

        //click on the airpod pros
        ReusableMethod.clickMethodByIndex(driver,"//*[@class='standard-tile__image standard-tile__image_hover']",0,"Airpods Image");

        //add product to cart
        ReusableMethod.clickMethod(driver,"//*[@id='ctaButton']", "Add to cart");

        //Thread.sleep(2000);

        //capture starting at price and print it out
        String result = ReusableMethod.captureTextMethod(driver,"//*[contains(text(),'starting at')]", "Price");
        System.out.println("My result is: " + result);

        //quit driver
        //driver.quit();

    }//end of main
}//end of class
