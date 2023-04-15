package Day6_03122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_ScrollingJava {
    public static void main(String[] args) throws InterruptedException {
        // set up driver
        WebDriverManager.chromedriver().setup();

        //set your chrome options a
        ChromeOptions options = new ChromeOptions();

        //add maximize for windows
        //options.addArguments("start-maximized");
        //add --kiosk for mac
        //options.addArguments("--kiosk");

        //add incognito mode to option
        options.addArguments("incognito");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo homepage
        driver.navigate().to("https://www.mlcalc.com");

        Thread.sleep(2000);

        //scroll to the bottom to click on mortgage rate
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //scroll down using pixels
        jse.executeScript("scroll(0,3000)");

        Thread.sleep(2000);

        //scroll up using pixels
        jse.executeScript("scroll(0,-3000)");

        Thread.sleep(2000);

        //scroll down using pixels
        jse.executeScript("scroll(0,3000)");

        driver.findElements(By.xpath("//*[text()='Mortgage Rates']")).get(1).click();
    }//end of main
}//end of class
