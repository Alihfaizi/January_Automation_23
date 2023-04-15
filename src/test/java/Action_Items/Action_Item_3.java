package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Action_Item_3 {
    public static void main(String[] args) throws InterruptedException {

        //create an array list of 3 zipCodes
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11003");
        zipCode.add("11704");
        zipCode.add("07071");

        //set up driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set up chrome options
        ChromeOptions options = new ChromeOptions();

        //add incognito mode option
        //options.addArguments("headless");

        //add incognito mode option
        options.addArguments("incognito");

        //define the chrome driver you will use for automation
        WebDriver driver = new ChromeDriver(options);

        //create for loop to iterate through different zip codes
        for(int i = 0; i < zipCode.size(); i++){

            //navigate to weightwatchers.com
            driver.navigate().to("https://www.weightwatchers.com");

            //maximize the window
            driver.manage().window().fullscreen();

            //wait 2 seconds
            Thread.sleep(2000);

            //click on find a workshop link on top right
            driver.findElement(By.xpath("//*[text()='Find a Workshop']")).click();

            //wait for 2 seconds
            Thread.sleep(2000);

            //click on "In Person" link
            driver.findElement(By.xpath("//*[text()='In-Person']"));

            //wait 2 seconds
            Thread.sleep(2000);

            //clear the field and enter your zip code by using webelement
            WebElement locationBox = driver.findElement(By.xpath("//*[@id='location-search']"));
            locationBox.clear();
            locationBox.sendKeys(zipCode.get(i));

            //click on the search arrow
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();

            //wait 2 seconds
            Thread.sleep(2000);

            //store findelements in arraylist webelement
           ArrayList<WebElement> studioLocation = new ArrayList<>(driver.findElements(By.xpath("//a[@tabindex='-1']")));

           if(i==0){
               studioLocation.get(1).click();
           }if(i==1){
               studioLocation.get(2).click();
           }if(i==2){
               studioLocation.get(0).click();
            }//end of conditional statements

            //wait 2 seconds
            Thread.sleep(2000);

            //put the address in a string and split it so you only print out the address
            String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
            String[] addressOnly = address.split("In-Person");
            System.out.println("Studio location address is: " + addressOnly[0]);


            //scroll to the element Studio workshop schedule in person
            WebElement schedule = driver.findElement(By.xpath("//*[text()='Upcoming In-Person Workshops schedule']"));
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("arguments[0].scrollIntoView(true)",schedule);

            //wait for 2 seconds
            Thread.sleep(2000);

            //print out the entire table including the hours and days
            String scheduleTable = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
            System.out.println(scheduleTable);

       }//end of for loop

        //quit the driver
        driver.quit();

    }//end of main
}// end of class