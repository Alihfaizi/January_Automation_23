package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_SelectDropdownbyClick {
    public static void main(String[] args) throws InterruptedException {
        // set up driver
        WebDriverManager.chromedriver().setup();

        //set your chrome options a
        ChromeOptions options = new ChromeOptions();

        //add incognito mode to option
        options.addArguments("incognito");

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo homepage
        driver.navigate().to("https://www.mortgagecalculator.org/");

        //wait 2 secs
        Thread.sleep(2000);

        //select start month as april from the dropdown using element function
        //if the dropdown is not under select tag name click on dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();

        //wait 2 secs
        Thread.sleep(1000);
        //click on the dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='Apr']")).click();

        //wait 2 sec
        Thread.sleep(2000);

        //click on empty area to close dropdown
        driver.findElement(By.xpath("//*[@class='content-area']")).click();

        //quit driver
        driver.quit();
    }//end of main
}//end of class
