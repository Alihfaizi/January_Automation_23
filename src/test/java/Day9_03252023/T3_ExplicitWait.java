package Day9_03252023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class T3_ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        // set up driver
        WebDriverManager.chromedriver().setup();

        //set your chrome options a
        ChromeOptions options = new ChromeOptions();

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //maximize
        driver.manage().window().maximize();

        //navigate to usp website
        driver.navigate().to("https://www.ups.com/us");

        //declare the explicit wait command
        WebDriverWait wait = new WebDriverWait(driver,20);

        //click on shipping
        //your explicit wait condition replaces your driver.findelement(s)
        //this is used to replace findelements
        //wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='mainNavDropdown1']"))).get(0).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='mainNavDropdown1']"))).click();

        //click on schedule a pickup
        //when you see element not interactable exception then you have to add thread.sleep statement
        Thread.sleep(2000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Schedule a Pickup']"))).click();
        //if you use element to be clickable you dont need thread statement
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Schedule a Pickup']"))).click();

        //enter a tracking number
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@name='tracknumlist']"))).sendKeys("11003");
    }//end of main
}//end of class

