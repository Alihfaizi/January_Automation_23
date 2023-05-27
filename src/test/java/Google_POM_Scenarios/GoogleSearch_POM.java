package Google_POM_Scenarios;

import Google_POM.Base_Class;
import Reusable_Package.ReusableAnnotations;
import org.testng.annotations.Test;

public class GoogleSearch_POM extends ReusableAnnotations {

    @Test
    public void captureResultForBMW(){
        driver.navigate().to("https://www.google.com");
        Base_Class.googleHome().enterKeywordOnSearchField("BMW");
        Base_Class.googleHome().submitOnGoogleSearchButton();
        Base_Class.googleSearchResult().captureSearchResults("BMW");

        //get the link count and print out the link name from the result page
        Base_Class.googleSearchResult().getCountOfTheLinks();

    }//end of test
}//end of class
