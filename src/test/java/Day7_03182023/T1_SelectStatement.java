package Day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_SelectStatement {
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

        //select start month as april from the dropdown using element function
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        Select startMonthDropdown = new Select(startMonth);

        //select by visible text
        startMonthDropdown.selectByVisibleText("Apr");

        //select by value
        //startMonthDropdown.selectByValue("4");

        //select by index
        //startMonthDropdown.selectByIndex(3);

        //wait 2 sec
        Thread.sleep(2000);

        //quit driver
        driver.quit();
    }//end of main
}//end of class
