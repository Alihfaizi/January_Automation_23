package Action_Items;

import Reusable_Package.ReusableMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ResourceBundle;

public class Action_Item_5_ReusableMethods {
    public static void main(String[] args) throws InterruptedException {

        //define chrome driver
        WebDriver driver = ReusableMethod.defineChromeDriver();

        //navigate to bestbuy website
        driver.navigate().to("https://www.bestbuy.com");

        //enter iphone in to search field
        ReusableMethod.sendKeysMethod(driver, "//*[@id='gh-search-input']", "iphone", "Search Bar");

        //click on the search icon
        ReusableMethod.clickMethod(driver, "//*[@aria-label='submit search']", "Search Icon");

        //Select Best Selling by visible text
        ReusableMethod.selectByTextMethod(driver, "//*[@class='tb-select']", "Best Selling", "Best Selling");

        Thread.sleep(2000);

        //click on first iphone by index
        ReusableMethod.clickMethodByIndex(driver, "//*[@class='sku-title']", 0, "1st product");

        //wait
        Thread.sleep(2000);

        //scroll to Learn About TotalTech by element
        ReusableMethod.scrollByElementMethod(driver, "//*[@data-qa='learn-more-button']", "Learn About TotalTech");

        //click add to cart
        ReusableMethod.clickMethod(driver, "//*[@class='fulfillment-add-to-cart-button']", "Add to cart button");

        //wait
        Thread.sleep(3000);

        //capture price and print out
        String price = ReusableMethod.captureTextMethod(driver, "//*[@class='sub-total v-fw-medium']", "price");
        System.out.println("iPhone price is: " + price);

        //hover your mouse over continue shopping
        ReusableMethod.mouseHoverMethod(driver, "//*[@class='c-button-link continue-shopping']", "continue shopping");

        //click on continue shopping
        ReusableMethod.clickMethod(driver, "//*[@class='c-button-link continue-shopping']", "continue shopping");

        //quit driver
        driver.quit();
    }//end of main
}//end of class
