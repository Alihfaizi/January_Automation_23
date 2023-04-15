package Practice;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod;
import org.testng.annotations.Test;

public class Review_04022023 extends ReusableAnnotations {

    @Test
    public void checkRadioButton(){
        driver.navigate().to("https://www.mortgagecalculator.org/");
        ReusableMethod.verifyBooleanStatement(driver,"//*[@value='money']", false, "money sign");
        ReusableMethod.scrollByPixelMethod(driver, 0,5000);
    }//end of test
}//end of class

