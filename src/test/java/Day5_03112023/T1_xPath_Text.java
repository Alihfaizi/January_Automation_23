package Day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_xPath_Text {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to google homepage
        driver.navigate().to("https://www.google.com");

        //wait for 2 seconds
        Thread.sleep(2000);

        //click on the about text link using xpath text()
        driver.findElement(By.xpath("//*[text()='About']")).click();

        //quit driver
        driver.quit();

    }//end of main
}// end of class

