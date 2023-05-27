package Google_POM;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod_Logger_POM;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchResult extends ReusableAnnotations {
    //must declare a local logger variable to be used for each pom class
    ExtentTest logger;

    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public GoogleSearchResult(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = ReusableAnnotations.logger;
    }//end of constructor


    //declare all the webelements here
    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement searchResultsText;

    @FindBy(xpath = "//*[@class='zItAnd FOU1zf']")
    List<WebElement> links;

    public void captureSearchResults(String userValue){
        String result = ReusableMethod_Logger_POM.captureTextMethod(driver,searchResultsText,logger,"Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for " + userValue + " is " + arrayResult[1]);
        logger.log(LogStatus.INFO,"Search number for " + userValue + " is " + arrayResult[1]);
    }//end of text method

    public void getCountOfTheLinks(){
        try{
            logger.log(LogStatus.INFO,"Link count is " + links.size());
            System.out.println("Link count is " + links.size());
        } catch (Exception e) {
            logger.log(LogStatus.FAIL,"Unable to get the link count " + e);
            System.out.println("Unable to get the link count " + e);
        }

        for(int i=0; i < links.size();i++){
            logger.log(LogStatus.INFO,"Link name is " + links.get(i).getText());
            System.out.println("Link name is " + links.get(i).getText());
        }
    }//end of getCountOfTheLinks
}
