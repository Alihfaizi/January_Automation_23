package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T3_HandlingTabs {
    public static void main(String[] args) throws InterruptedException {
        // set up driver
        WebDriverManager.chromedriver().setup();

        //set your chrome options a
        ChromeOptions options = new ChromeOptions();

        //add incognito mode to option
        options.addArguments("incognito");

        //to disable any location popups or anything
        options.addArguments("--disable-popup-blocking");

        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo homepage
        driver.navigate().to("https://www.fideliscare.org/");

        Thread.sleep(2000);

        //click on shop for plan
        driver.findElement(By.xpath("//*[text()='Shop For a Plan']")).click();

        Thread.sleep(2000);

        //click on 2nd shop for a plan
        driver.findElement(By.xpath("//*[text()='Shop for a Plan']")).click();

        Thread.sleep(1000);

        //click on find a doctor
        driver.findElement(By.xpath("//*[@href='/Find-A-Doctor']")).click();

        //call the window handles in arraylist and switch to the new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //switch to the new tab by index 1
        driver.switchTo().window(tabs.get(1));

        Thread.sleep(1000);

        WebElement zipCode = driver.findElement(By.xpath("//*[@id='searchLocation']"));
        //enter zipcode on location field
        zipCode.click();
        zipCode.sendKeys("11003");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='Form']")).click();

    }//end of main
}//end of class