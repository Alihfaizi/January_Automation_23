package Action_Items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Action_Item_2_Assignment_2 {
    public static void main(String[] args) throws InterruptedException {
        //set up your driver through the web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();

        //set up ArrayList of sports
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Basketball");
        sports.add("Soccer");
        sports.add("Badminton");
        sports.add("Volleyball");
        sports.add("Hockey");

        //iterate through the list of sports and print out the number of search results
        for(int i = 0; i < sports.size(); i++){
            //navigate to Bing homepage
            driver.navigate().to("https://www.bing.com");

            //wait for 3 seconds
            Thread.sleep(3000);

            //enter animal name in search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports.get(i));

            //click on search button
            driver.findElement(By.xpath("//*[@class='search icon tooltip']")).click();

            //wait for 3 seconds
            Thread.sleep(3000);

            //capture the search message
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            //split the search message
            String[] arrayResult = result.split(" ");

            //print out the search result for each animal
            System.out.println("For " + sports.get(i) + " the number of search results is " + arrayResult[1]);
        }//end of for loop

        //quit driver
        driver.quit();
    }//end of main
}//end of class

