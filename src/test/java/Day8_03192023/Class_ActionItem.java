package Day8_03192023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class Class_ActionItem {
    public static void main(String[] args) throws InterruptedException {
        // set up driver
        WebDriverManager.chromedriver().setup();

        //set your chrome options a
        ChromeOptions options = new ChromeOptions();

        //add incognito mode to option
        //options.addArguments("incognito");

        //options.addArguments("headless");

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //maximize
        driver.manage().window().maximize();

        //create an array list for cities
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Las Vegas");
        cities.add("Miami");
        cities.add("Houston");

        //create an array list for passengers
        ArrayList<Integer> adults = new ArrayList<>();
        adults.add(2);
        adults.add(3);
        adults.add(4);

        //create a for loop to iterate through different cities
        for(int i = 0; i < cities.size(); i++) {

            //navigate to hotels homepage
            driver.navigate().to("https://www.hotels.com/");

            //wait 2 secs
            Thread.sleep(2000);

            //click on location search field
            try{
                driver.findElement(By.xpath("//*[@aria-label='Going to']")).click();
                System.out.println("Successfully clicked on destination textbox");
            }catch (Exception e){
                System.out.println("did not click on textbox" + e);
            }//end of exception for clicking on textbox

            //click on popup element and type destination
            try{
                driver.findElement(By.xpath("//*[@id='destination_form_field']")).sendKeys(cities.get(i));
                System.out.println("Successfully typed destination in textbox");
            }catch (Exception e){
                System.out.println("typing destination in textbox was unsucessful" + e);
            }//end of exception for typing in city

            Thread.sleep(2000);

            //click on 1st suggestion from drop down
            try{
                driver.findElement(By.xpath("//*[@data-stid='destination_form_field-result-item-button']")).click();
                System.out.println("Successfully clicked on destination box");
            }catch (Exception e){
                System.out.println("clicking on destination was unsucessful" + e);
            }//end of exception for clicking on 1st suggestion

            //click on the guest number box
            try{
                driver.findElement(By.xpath("//*[@data-stid='open-room-picker']")).click();
                System.out.println("Successfully clicked on guest number box");
            }catch (Exception e){
                System.out.println("clicking on guest number box was unsucessful" + e);
            }//end of exception for clicking on the guest number box

            Thread.sleep(2000);

            //click on the minus adults button to reset to 1 passenger
            try{
                driver.findElement(By.xpath("//*[@class='uitk-step-input-button']")).click();
                System.out.println("Successfully clicked on minus one guest");
            }catch (Exception e){
                System.out.println("clicking on minus one guest was unsuccessful" + e);
            }//end of exception for clicking on the minus 1 passenger

            //create a for loop to add the amount of passengers on the trip
            for(int j = 1; j < adults.get(i); j++){
                try {
                    driver.findElement(By.xpath("//*[@aria-label='Increase the number of adults in room 1']")).click();
                    System.out.println("Successfully added passengers");
                }catch (Exception e){
                    System.out.println("Adding passengers was unsuccessfully" + e);
                }//end of exception for adding passengers
            }//end of for loop for amount of passengers

            Thread.sleep(1000);

            //click on adding 1 child
            try{
                driver.findElement(By.xpath("//*[@aria-label='Increase the number of children in room 1']")).click();
                System.out.println("Successfully clicked on adding one child");
            }catch (Exception e){
                System.out.println("Adding one child was unsuccessful" + e);
            }//end of exception for adding one child

            //select child age from drop down menu
            WebElement childAge = driver.findElement(By.xpath("//*[@id='age-traveler_selector_children_age_selector-0-0']"));

            //select child age
            try {
                Select childAgeDropdown = new Select(childAge);
                childAgeDropdown.selectByVisibleText("8");
                System.out.println("Children age selected successfully ");
            }catch (Exception e){
                System.out.println("Selecting child age was unsuccessful" + e);
            }//end of exception for selecting child age

            //click on search button
            try{
                driver.findElement(By.xpath("//*[@id='search_button']")).click();
                System.out.println("Hotel search was successful");
            }catch (Exception e){
                System.out.println("Hotel search is unsuccessful" +e);
            }//end of exception for searching

            Thread.sleep(2000);

            //create webelement in arraylist for hotel links
            ArrayList<WebElement> hotelNumber = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='open-hotel-information']")));

            //create conditional statements to select link
            if(i == 0){
                hotelNumber.get(0).click();
            }else if(i==1){
                hotelNumber.get(2).click();
            }else if(i==2){
                hotelNumber.get(1).click();
            }//end of conditional statements

            //call the window handles in arraylist and switch to the new tab
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            //switch to the new tab by index 1
            driver.switchTo().window(tabs.get(1));

            //print out hotel name
            try{
                String hotelName = driver.findElement(By.xpath("//*[@class='uitk-heading uitk-heading-3']")).getText();
                System.out.println("Hotel name is: " + hotelName);
            }catch (Exception e){
                System.out.println("Printing hotel name was unsuccessful" + e);
            }//end of exception for printing hotel name

            Thread.sleep(2000);

            //click on reserve a room button
            try {
                driver.findElement(By.xpath("//*[@data-stid='sticky-button']")).click();
                System.out.println("Successfully clicked on reserve a room button");
            }catch(Exception e){
                System.out.println("Clicking on reserve a room was unsuccessful" + e);
            }//end of exception for clicking on reserve a room

            Thread.sleep(2000);

            //print out the hotels first price per night
            try{
                String price = driver.findElement(By.xpath("//*[@class='uitk-spacing uitk-spacing-padding-block-half']")).getText();
                System.out.println(price);
            }catch (Exception e){
                System.out.println("capturing hotel price was unsuccessful." +e);
            }//end of exception for printing hotel price

            Thread.sleep(2000);

            //click on the reserve button
            try{driver.findElement(By.xpath("//*[@data-stid='submit-hotel-reserve']")).click();
                System.out.println("Successfully clicked on reserve button");
            }catch (Exception e){
                System.out.println("Clicking on reserve button was unsuccessful" + e);
            }//end of exception for clicking reserve button

            Thread.sleep(2000);

            //click on the pay now button if it pops up
            try{driver.findElement(By.xpath("//span[text()='Pay now']")).click();
                System.out.println("Successfully clicked on pay now button");
            }catch (Exception e){
                System.out.println("Pay now button does not exist");
            }//end of exception for clicking pay now button

            Thread.sleep(2000);

            //print out the check in date
            try{
                String checkIn = driver.findElement(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-in fw-bold']")).getText();
                System.out.println("Check-in is: " + checkIn);
            }catch (Exception e){
                System.out.println("capturing hotel checkin was unsuccessful." +e);
            }//end of exception for printing hotel checkin information

            //print out check out date
            try{
                String checkOut= driver.findElement(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-out fw-bold']")).getText();
                System.out.println("Check-out is: " + checkOut);
            }catch (Exception e){
                System.out.println("capturing hotel checkout was unsuccessful." +e);
            }//end of exception for printing hotel checkout information

            //close current tab
            driver.close();

            //switch back to parent tab
            driver.switchTo().window(tabs.get(0));

        }//end of for loop

        //quit driver
        driver.quit();
    }//end of main
}//end of class