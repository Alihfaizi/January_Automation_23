package Day6_03122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_WebElement_ScrollByPixel {
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

        //wait 2 secs
        Thread.sleep(2000);

        //clear the auto populated data from purchase price
        WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
        pPrice.clear();

        //enter new purchase price
        pPrice.sendKeys("250000");

        //click on calculate
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(1500);

        //if you want you use findElements as a webelement variable, you need to store it as an Array List
        //capture the monthly payment & total 360
        ArrayList<WebElement> paymentList = new ArrayList<>(driver.findElements(By.xpath("//*[@style='font-size: 32px']")));
        //print monthly payment
        String mntPayment = paymentList.get(0).getText();
        System.out.println("Monthly Payment: " + mntPayment);
        //print total 360  payment
        String total360Pay = paymentList.get(1).getText();
        System.out.println("Total 360 Payment: " + total360Pay);


    }//end of main
}//end of class
