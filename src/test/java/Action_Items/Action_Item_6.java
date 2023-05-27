package Action_Items;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod;
import org.testng.annotations.Test;

public class Action_Item_6 extends ReusableAnnotations {
    //test case 1
    @Test
    public void TC_01() throws InterruptedException {
        //navigate to fidelis care site
        driver.navigate().to("https://fideliscare.org");
        //click on search element
        ReusableMethod.clickMethodByIndex(driver, "//*[@class='dropdown-toggle']",1,"Search");
        //enter get dental coverage
        ReusableMethod.sendKeysMethod(driver, "//*[@class='form-control search-input']", "Get Dental Coverage","Search Bar");
        //click on the search icon
        ReusableMethod.clickMethod(driver,"//*[@aria-label='Execute Search']", "Search Icon");
        //capture the search result
        String results = ReusableMethod.captureTextMethod(driver, "//*[@class='gsc-result-info']","Results");
        //split and print out search number
        String[] arrayResults = results.split(" ");
        System.out.println("Search results: " + arrayResults[1]);
        //click on get dental coverage link
        ReusableMethod.clickMethod(driver, "//*[text()='Get Dental Coverage']", "First Link");
    }//end of @Test TC_01

    @Test (dependsOnMethods = "TC_01")
    public void TC_02() throws InterruptedException {
        //switch to new tab
        ReusableMethod.switchToTabByIndexMethod(driver, 1, "Get Dental Coverage");
        //enter first name
        ReusableMethod.sendKeysMethod(driver, "//*[@id='firstName']", "Captain", "First Name");
        //enter last name
        ReusableMethod.sendKeysMethod(driver, "//*[@id='lastName']", "America", "Last Name");
        //enter zip code
        ReusableMethod.sendKeysMethod(driver, "//*[@id='zipCode']", "11003", "Zip Code");
        //select nassau county from drop down
        ReusableMethod.selectByTextMethod(driver,"//*[@id='county']", "Nassau", "County");
        //enter phone number
        ReusableMethod.sendKeysMethod(driver, "//*[@id='phoneNumber']", "7185678060", "Phone Number");
        //enter email
        ReusableMethod.sendKeysMethod(driver, "//*[@id='email']", "captainamerica@gmail.com", "Email");
        //click on contact me checkbox
        ReusableMethod.clickMethodByIndex(driver,"//*[@for='contactMe']",1, "Checkbox");
        //click on contact me button
        ReusableMethod.clickMethod(driver,"//*[@type='submit']", "Contact Me");
        //capture message
        String message = ReusableMethod.captureTextMethod(driver,"//*[@class='alert alert-success']", "Message");
        //print message
        System.out.println(message);
        //close tab
        driver.close();
    }//end of @Test TC_02

    @Test(dependsOnMethods = {"TC_01", "TC_02"})
    public void TC_03() throws InterruptedException {
        //switch back to parent tab
        ReusableMethod.switchToTabByIndexMethod(driver, 0, "Parent Tab");
        //click on log in
        ReusableMethod.clickMethod(driver,"//*[@class='dropdown-toggle']", "Login");
        //click on member online portal
        Thread.sleep(2000);
        ReusableMethod.clickMethod(driver,"//*[text()='Member Online Portal']", "Member Online Portal");
        //switch to new tab
        ReusableMethod.switchToTabByIndexMethod(driver,1, "Member Online Portal");
        //capture helpful hints
        String helpfulHints = ReusableMethod.captureTextMethod(driver, "//*[@class='tipsContentText']", "Helpful Hints");
        //print helpful hints
        System.out.println("Helpful Hints: " + helpfulHints);
        //close tab
        driver.close();
    }//end of @Test TC_03
}//end of class