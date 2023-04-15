package Day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_ChromeOptions {
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
        //options.addArguments("incognito");

        //to disable any location pop ups or anything
        options.addArguments("--disable-popup-blocking");

        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo homepage
        driver.navigate().to("https://www.yahoo.com");

        //wait 2 secs
        Thread.sleep(2000);

        //click on sign in link
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        //wait 2 secs
        Thread.sleep(2000);

        //print out sign in to yahoo text
        String result = driver.findElement(By.xpath("//*[contains(text(),'Sign')]")).getText();
        System.out.println("Result is " + result);

        driver.quit();

    }//end of main
}//end of class
