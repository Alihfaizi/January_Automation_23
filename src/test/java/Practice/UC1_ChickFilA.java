package Practice;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UC1_ChickFilA {
    //declaring driver outside of automation method
    WebDriver driver;

    @Test
    public void orderChickfila() throws InterruptedException {
        //navigate to chick-fil-a
        driver.navigate().to("https://www.chick-fil-a.com/");
        //accept all cookies
        ReusableMethod.clickMethod(driver, "//*[text()='Accept All Cookies']", "Accept all cookies");
        //click on order food
        ReusableMethod.clickMethod(driver, "//*[text()='Order food']", "Order Food button");
        //click on Pickup
        ReusableMethod.clickMethodByIndex(driver, "//*[@class='sc-lbGWWz dZRuUT']", 0, "Pickup");
        //enter zipcode
        ReusableMethod.sendKeysMethod(driver, "//*[@name='location']", "85281", "Address Text Box");
        Thread.sleep(1000);
        //submit after entering zip code
        ReusableMethod.submitMethod(driver, "//*[@name='location']", "Submitting Zip Code");
        Thread.sleep(1000);
        //select the first restaurant
        ReusableMethod.clickMethod(driver, "//*[text()='Select this restaurant']", "Select this restaurant");
        Thread.sleep(1000);
        //select carry out
        ReusableMethod.clickMethodByIndex(driver, "//*[@class='sc-lbGWWz dZRuUT option-wrapper']",1 ,"Carry-out");
        Thread.sleep(1000);
        //click on meals
        ReusableMethod.clickMethod(driver, "//*[@alt='Meals']", "Meals Button");
        Thread.sleep(1000);
        //select spicy chicken sandwich deluxe meal
        ReusableMethod.clickMethod(driver, "//*[@alt='Spicy Chicken Sandwich Deluxe Meal']", "Spicy Chicken Deluxe Meal");
        Thread.sleep(1000);
        //add pepperjack cheese
        ReusableMethod.clickMethod(driver, "//*[@alt='Pepper Jack Cheese']", "Pepper jack Cheese");
        Thread.sleep(1000);
        //add chickfila sauce
        ReusableMethod.clickMethod(driver, "//*[@alt='Chick-fil-A Sauce']", "Chick-fil-A Sauce");
        Thread.sleep(1000);
        //click next,choose a side
        ReusableMethod.clickMethod(driver, "//*[@data-cy='NextButton']", "Next,choose a side");
        Thread.sleep(1000);
        //select waffle fries
        ReusableMethod.clickMethod(driver, "//*[@class='sc-dmqHEX sc-dEcdCA iHJQdJ eNCzoD']", "Waffle Fries");
        Thread.sleep(1000);
        //select large size
        ReusableMethod.clickMethod(driver, "//*[@data-cy='LG_WAFFLE_POTATO_FRIES']", "Large size button");
        Thread.sleep(1000);
        //click next,choose a beverage
        ReusableMethod.clickMethod(driver, "//*[@data-cy='NextButton']", "Next,choose a beverage");
        Thread.sleep(1000);
        //click on fresh iced tea
        ReusableMethod.clickMethod(driver, "//*[@class='sc-jTrPJq sc-fCHrSC dDWXsD gAxVPk']", "Iced Tea");
        Thread.sleep(1000);
        //click review your meal
        ReusableMethod.clickMethod(driver, "//*[@data-cy='ReviewYourMeal']", "review your meal");
        Thread.sleep(1000);
        //click add to order
        ReusableMethod.clickMethod(driver, "//*[@data-cy='AddToOrder']", "Add to order");
        //click my order
        ReusableMethod.clickMethod(driver, "//*[@data-cy='Cart']", "My Order");
        //click check out
        ReusableMethod.clickMethod(driver, "//*[@data-cy='CheckOut']", "Check out");
        //click guest checkout
        ReusableMethod.clickMethod(driver, "//*[@data-cy='GuestCheckout']", "Guest Checkout");
    }//end of test

    //setting up driver
    @BeforeSuite
    public void setUpDriver() {
        driver = ReusableMethod.defineChromeDriver();
    }//end of before suite

    //quit driver
    @AfterSuite
    public void quitSession() {
        driver.quit();
    }//end of after suite
}
