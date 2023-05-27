package Google_POM;

import Reusable_Package.ReusableAnnotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Class extends ReusableAnnotations {
    //constructor method is a helper method which creates a bridge between
    //your pom class and test class. Without constructor, you can't create a pom class
    public Base_Class(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor

    //for each page object class we must create a static reference to make each class statick for the test class

    //create static reference for google home page
    public static GoogleHomePage googleHome(){
        GoogleHomePage googleHome = new GoogleHomePage(driver);
        return  googleHome;
    }//end of static reference for GoogleHome class

    //create static reference for google search result page
    public static GoogleSearchResult googleSearchResult(){
        GoogleSearchResult googleSearchResult = new GoogleSearchResult(driver);
        return  googleSearchResult;
    }//end of static reference for GoogleSearchResult class


}
