package Action_Items;

import Reusable_Package.ReusableAnnotations;
import Reusable_Package.ReusableMethod;
import Reusable_Package.ReusableMethod_Logger;
import com.relevantcodes.extentreports.LogStatus;
import jdk.jfr.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
import java.net.http.WebSocket;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Action_Item_7 extends ReusableAnnotations{
    //1st test case
    @Test(priority = 1)
    public void findLocation() throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO, "Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //click on locations tab
        ReusableMethod_Logger.clickMethod(driver, "(//a[@rel='noopener noreferrer'])[3]", logger, "Locations Tab");
        //enter zip code
        ReusableMethod_Logger.sendKeysMethod(driver, "//*[@name='zipcode']", "11003" ,logger, "Zip Code Text Box");
        //click on mile range drop down
        ReusableMethod_Logger.clickMethod(driver, "(//span[@class='ui-selectmenu-text'])[6]", logger, "Miles Dropdown");
        //click on 5 miles
        ReusableMethod_Logger.clickMethod(driver,"(//*[text()='5 Miles'])[2]",logger,"5 Miles");
        //click find my branch
        ReusableMethod_Logger.clickMethod(driver,"//*[@title='FIND MY BRANCH']",logger,"Find My Branch");
        //Capture the names of the closest branches and print them out
        String branchName = ReusableMethod_Logger.captureTextMethod(driver,"//*[@class='details']",logger,"Branch Name");
        String[] name = branchName.split("BRANCH");
        System.out.println("My closest branch is: " + name[0]);
    }//end of test 1

    //2nd test case
    @Test(priority = 2)
    public void applyForJob() throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO,"Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //click on careers tab
        ReusableMethod_Logger.clickMethod(driver,"(//a[@rel='noopener noreferrer'])[4]", logger, "Careers Tab");
        //click on employment opportunities
        ReusableMethod_Logger.clickMethod(driver,"//*[@alt='Job Opportunities']", logger, "Employment Opportunities");
        //click continue on the pop up
        Thread.sleep(2000);
        ReusableMethod_Logger.clickMethod(driver, "//*[contains(text(),'CONTINUE')]",logger,"Continue Button");
        //switch to new tab
        ReusableMethod_Logger.switchToTabByIndexMethod(driver,1,logger,"ADP Tab");
        //type in location
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[contains(@aria-label,'Jobs in California,')]", "Brooklyn",logger,"Location");
        //Click on Search Icon
        Thread.sleep(1000);
        ReusableMethod_Logger.clickMethod(driver,"//*[@aria-label='Submit Search']",logger,"Search Icon");
        //click on the first job
        Thread.sleep(1000);
        ReusableMethod_Logger.clickMethod(driver,"//*[@class='current-openings-item']",logger,"First Job");
        //click on apply button
        ReusableMethod_Logger.clickMethod(driver,"//*[@id='recruitment_jobDescription_apply']",logger,"Apply Button");
        //enter first name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='guestFirstName']","Mike", logger,"First Name");
        //enter last name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='guestLastName']","Obama", logger,"Last Name");
        //enter email
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='guestEmail']","mike@mike.com", logger,"Email");
        //enter number
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@name='phone']","9178889999", logger,"Phone Number");
        //click continue
        ReusableMethod_Logger.clickMethod(driver,"//*[@id='recruitment_login_recaptcha']",logger,"Continue Button");
    }//end of test 2

    //3rd test case
    @Test(priority = 3)
    public void downloadApp () throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO,"Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //hover over digital banking tab
        ReusableMethod_Logger.mouseHoverMethod(driver,"//*[@aria-labelledby='DIGITAL BANKING']",logger,"Digital Banking Tab");
        //click on digital banking from the dropdown
        ReusableMethod_Logger.clickMethod(driver,"//*[contains(text(),'DIGITAL BANKING')]",logger,"Digital banking dropdown");
        //click on mobile banking
        ReusableMethod_Logger.clickMethod(driver,"//*[@alt='Northfield Bank Money Icon']",logger,"Mobile Banking Button");
        //click on download on app store
        ReusableMethod_Logger.clickMethod(driver,"//*[@alt='Download the App']",logger,"Download Button");
        //click on continue on popup
        Thread.sleep(2000);
        ReusableMethod_Logger.clickMethod(driver,"//*[contains(text(),'CONTINUE')]",logger,"Continue button");
    }//end of test 3

    //4th test case
    @Test(priority = 4)
    public void contactCustomerService () throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO, "Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //click on customer service tab
        ReusableMethod_Logger.clickMethod(driver,"(//a[@rel='noopener noreferrer'])[7]", logger, " Customer Service Tab");
        //enter first name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='FirstName']","Michelle", logger,"First Name");
        //enter last name
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='LastName']","Obama", logger,"Last Name");
        //enter email
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='Email']","obama@gmail.com", logger,"Email");
        //enter contact phone
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='phone']","9179990000", logger,"Phone Number");
        //select online banking support from dropdown
        ReusableMethod_Logger.clickMethod(driver,"//*[@title='How Can We Help You?']",logger,"How can we help you?");
        ReusableMethod_Logger.clickMethod(driver,"(//*[contains(text(),'Online Banking Support')])[1]",logger,"How can we help you?");
        //enter a message in the description
        ReusableMethod_Logger.sendKeysMethod(driver,"//*[@id='Description']","Can not log in to my account", logger,"Phone Number");
        //click submit
        ReusableMethod_Logger.clickMethod(driver,"(//*[@type='submit'])[6]",logger,"Submit Button");
    }//end of test 4

    //5th test case
    @Test(priority = 5)
    public void personalLoanApplication() throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO, "Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //hover over Personal tab
        ReusableMethod_Logger.mouseHoverMethod(driver,"//*[@aria-labelledby='PERSONAL']",logger,"Personal Banking Tab");
        //click on personal from the dropdown
        Thread.sleep(1000);
        ReusableMethod_Logger.clickMethod(driver,"//*[contains(text(),'PERSONAL BANKING')]",logger,"Personal dropdown");
        //click on customer service tab
        ReusableMethod_Logger.clickMethod(driver,"//*[@alt='Northfield Bank Wallet']", logger, "Personal Lending Button");
        //click on apply online button
        ReusableMethod_Logger.clickMethod(driver,"(//*[contains(text(),'Apply Online')])[3]", logger, "Personal Lending Button");
    }//end of test 5

    //6th test case
    @Test(priority = 6)
    public void loanCalculator() throws InterruptedException {
        //navigate to website
        logger.log(LogStatus.INFO, "Navigate to Northfield Investment Services");
        driver.navigate().to("https://www.enorthfield.com/northfield-investment-services");
        //click on calculators
        ReusableMethod_Logger.clickMethod(driver,"//*[@href='/calculators']",logger,"Calculators Tab");
        //click on enhanced loan calculator link
        ReusableMethod_Logger.clickMethod(driver,"//*[@title='Enhanced Loan Calculator']",logger,"Enhanced Loan Calculator");
        //Scroll calculator in to view
        Thread.sleep(2000);
        ReusableMethod_Logger.scrollByElementMethod(driver,"//*[@title='Enhanced Loan']","Loan Calculator");
    }//end of test 6
}//end of class