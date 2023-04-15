package Day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_xPath_Contains {
    public static void main(String[] args) throws InterruptedException {

        //Setup web driver for chrome
        WebDriverManager.chromedriver().setup();

        //define the chrome driver you will use for automation
        WebDriver driver = new ChromeDriver();

        //naviagte to yahoo homepage
        driver.navigate().to("https://www.yahoo.com");

        //wait 2 secs
        Thread.sleep(2000);

        //using xpath contains click on the mail link by ignoring the white space on the text property for that element
        driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();

        //wait 5 seconds
        Thread.sleep(5000);

        //quit driver
        driver.quit();

    }//end of main
}// end of class
