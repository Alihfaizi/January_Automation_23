package Action_Items;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod_Logger;
import org.testng.annotations.Test;

public class usman extends ReusableAnnotations {
    @Test
    public void usman() throws InterruptedException {
        //navigate to jetBlue check in page
        driver.navigate().to("https://jetblue.com/checkin");
        Thread.sleep(2000);
        ReusableMethod_Logger.clickMethod(driver,"/html/body/div[8]/div[1]/div/div[3]/a[1]", logger, "sss");

//enter in first name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='firstName']","John",logger,"First Name");

//enter in last name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='lastName']","Doe",logger,"Last Name");

//select the confirmation code dropdown box
        ReusableMethod_Logger.selectByTextMethod(driver,"//*[@id='choose']","Confirmation Code",logger,"Dropdown");

//enter in confirmation code
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='recordLocator']", "123456",logger,"Confirmation Code");

        Thread.sleep(4000);

        ReusableMethod_Logger.clickMethod(driver,"//*[@class='pdynamicbutton']",logger,"Accept Cookies area");

//click on accept cookies
        ReusableMethod_Logger.clickMethod(driver,"//a[@class='call']",logger,"Accept Cookies");

//click find flights
        ReusableMethod_Logger.clickMethod(driver,"(//*[@class='buttonGreySm btnFloatLeft'])[4]",logger,"Find Flights");

//capture and print error
        String result = ReusableMethod_Logger.captureTextMethod(driver,"//*[@class='message']",logger,"Error Message");
        System.out.println(result);
    }

}
