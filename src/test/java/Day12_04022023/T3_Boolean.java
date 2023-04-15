package Day12_04022023;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class T3_Boolean extends ReusableAnnotations {
    @Test(priority = 1)
    public void verifyCheckBoxIsChecked(){
        driver.navigate().to("https://www.yahoo.com");
        ReusableMethod.clickMethod(driver, "//*[@class='_yb_1dbys']", "Sign In");
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver,7);
        try {
            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='persistent']"))).isSelected();
            System.out.println("Value: " + elementState);
            if (elementState == true) {
                System.out.println("Passed: Checkbox is checked by default");
            } else {
                System.out.println("Failed: Checkbox is not checked by default");
            }//end of conditional statement
        }catch (Exception e){
            System.out.println("Unable to verify checkbox " + e);
        }//end of exception
    }//end of @Test

    @Test (priority = 2)
            public void verifyCheckBoxIsNotChecked() {
        //click on checkbox to uncheck
        ReusableMethod.clickMethod(driver, "//*[@for='persistent']", "Checkbox");
        ReusableMethod.verifyBooleanStatement(driver,"//*[@for='persistent']", false, "Checkbox");
        /*
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, 7);
        try {
            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='persistent']"))).isSelected();
            System.out.println("Value: " + elementState);
            if (elementState == true) {
                System.out.println("Passed: Checkbox is checked by default");
            } else {
                System.out.println("Failed: Checkbox is not checked by default");
            }//end of conditional statement
        } catch (Exception e) {
            System.out.println("Unable to verify checkbox " + e);
        }//end of exception
        */
    }//end of @Test
}//end of class
