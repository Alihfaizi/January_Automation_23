package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        driver.findElement(By.xpath("//*[@placeholder='Search Amazon']")).sendKeys("microphone");
        driver.findElement(By.xpath("//*[@placeholder='Search Amazon']")).submit();
        String result = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
        String[] arrayResult = result.split(" ");
        System.out.println("Result Number: " + arrayResult[3]);
        System.out.println(result);

        driver.quit();


    }
}
