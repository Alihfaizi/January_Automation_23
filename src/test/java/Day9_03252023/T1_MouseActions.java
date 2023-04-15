package Day9_03252023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions {
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

        //navigate to usps
        driver.navigate().to("https://usps.com");

        //wait
        Thread.sleep(1000);

        //declare and define the mouse action
        Actions mouseActions = new Actions(driver);

        //hover over the send tab to open up submodules/functionalities
        try{
            WebElement sendTab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
            mouseActions.moveToElement(sendTab).perform();
        }catch(Exception e){
            System.out.println("Unable to hover to Send tab" + e);
        }//end of tab exception

        //click on Tracking using mouse click
        try{
            WebElement trackingLink = driver.findElement(By.xpath("//*[text()='Tracking']"));
            mouseActions.moveToElement(trackingLink).click().perform();
        }catch(Exception e){
            System.out.println("Unable to click on Tracking" + e);
        }//end of clicking on Tracking exception

        Thread.sleep(1000);

        //click on Tracking field using mouse click
        try{
            WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
            mouseActions.moveToElement(trackingField).click().sendKeys("11003").perform();
        }catch(Exception e){
            System.out.println("Unable to type on Tracking input" + e);
        }//end of typing in tracking field exception
    }//end of main
}//end of class
