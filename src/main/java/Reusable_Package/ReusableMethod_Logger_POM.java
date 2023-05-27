package Reusable_Package;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class ReusableMethod_Logger_POM {

    //create void method - only an action (click,sendkeys,mouse hover,submit,scrolling,select, clear) - will only perform the action but won't return anything
    //return method - (getText, Webdriver) - executes your statements and return some conditions/values

    //create a return method to return webdriver you are going to use on your test cases
    public static WebDriver defineChromeDriver() {
        // set up driver
        WebDriverManager.chromedriver().setup();
        //set your chrome options a
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("incognito");
        // define the chrome driver you will use for automation
        //option variable must be passed inside chromedriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);
        //maximize
        driver.manage().window().maximize();
        return driver;
    }//end of webdriver method


    //create a void method for clicking
    public static void clickMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            System.out.println("Successfully clicked on element " + elementName);
            logger.log(LogStatus.PASS,"Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to click on element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of click exception
    }//end of click method


    //create a void method for clicking by index
    public static void clickMethodByIndex(WebDriver driver, String xpath, int index,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
            System.out.println("Successfully clicked on element " + elementName);
            logger.log(LogStatus.PASS,"Successfully clicked on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to click on element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of click exception by index
    }//end of click method by index


    //create a void method for sendkeys
    public static void sendKeysMethod(WebDriver driver, WebElement xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on element " + elementName);
            logger.log(LogStatus.PASS,"Successfully entered a value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to enter a value on element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of sendkeys exception
    }//end of sendkeys method


    //create a void method for sendkeys by index
    public static void sendKeysMethodByIndex(WebDriver driver, String xpath, String userValue, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            element.clear();
            element.sendKeys(userValue);
            System.out.println("Successfully entered a value on element " + elementName);
            logger.log(LogStatus.PASS,"Successfully entered a value on element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to enter a value on element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to enter a value on element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of sendkeys by index exception
    }//end of sendkeys by index method


    //capture a text and return it using return method
    public static String captureTextMethod(WebDriver driver, WebElement xpath,ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOf(xpath));
            result = element.getText();
            System.out.println("Successfully captured a text from element " + elementName);
            logger.log(LogStatus.PASS, "Successfully captured a text from element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture text form element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to capture text form element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of getText exception
        return result;
    }//end of getText method


    //create a void method for mouse hoover
    public static void mouseHoverMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions mouseActions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            mouseActions.moveToElement(element).perform();
            System.out.println("Successfully hovered over element " + elementName);
            logger.log(LogStatus.PASS, "Successfully hovered over element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover over element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to hover over element" + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of mouse hover exception
    }//end of mouse hover method

    //create a void method for mouse hoover by index
    public static void mouseHoverMethodByIndex(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions mouseActions = new Actions(driver);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            mouseActions.moveToElement(element).perform();
            System.out.println("Successfully hovered over element " + elementName);
            logger.log(LogStatus.PASS, "Successfully hovered over element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to hover over element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL,"Unable to hover over element" + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of mouse hover by index exception
    }//end of mouse hover method by index


    //create a void method for scrolling by pixel
    public static void scrollByPixelMethod(WebDriver driver, int x, int y) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            jse.executeScript("scroll("+x+","+y+")");
            System.out.println("Successfully scrolled by " + x+","+y);
        } catch (Exception e) {
            System.out.println("Unable to scroll by " + x+","+y + ": " + e);
        }//end of scroll by pixel exception
    }//end of scroll by pixel method

    //create a void method for scroll by element
    public static void scrollByElementMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView(true)",element);
            System.out.println("Successfully scrolled to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to " + elementName + ": " + e);
        }//end of scroll by element exception
    }//end of scroll by element method


    //create a void method for scroll by element by index
    public static void scrollByElementMethodByIndex(WebDriver driver, String xpath, int index,  String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            jse.executeScript("arguments[0].scrollIntoView(true)",element);
            System.out.println("Successfully scrolled to: " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll to " + elementName + ": " + e);
        }//end of scroll by element exception by index
    }//end of scroll by element by index method


    //create a void method for selecting by visible text
    public static void selectByTextMethod(WebDriver driver, String xpath, String visibleText, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(visibleText);
            System.out.println("Successfully selected drop down by visible text: " + elementName);
            logger.log(LogStatus.PASS, "Successfully selected drop down by visible text " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select dropdown by visible text : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to select dropdown by visible text : " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of select by visible text exception by index
    }//end of select by visible text method

    //create a void method for selecting by visible value
    public static void selectByValueMethod(WebDriver driver, String xpath, String valueNumber, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByValue(valueNumber);
            System.out.println("Successfully selected drop down by value: " + elementName);
            logger.log(LogStatus.PASS, "Successfully selected drop down by value " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to select dropdown by value : " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to select dropdown by value : " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of select by visible text exception by index
    }//end of select by visible text method


    //create a void method for submitting
    public static void submitMethod(WebDriver driver, WebElement xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOf(xpath)).submit();
            System.out.println("Successfully submitted element " + elementName);
            logger.log(LogStatus.PASS, "Successfully submitted element " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit element " + elementName + ": " + e);
            logger.log(LogStatus.FAIL, "Unable to submit element " + elementName + ": " + e);
            getScreenShot(driver, elementName, logger);
        }//end of submit exception
    }//end of submit method

    public static void verifyBooleanStatement(WebDriver driver, String xpath, boolean expectedValue, ExtentTest logger, String elementName){
        //store the xpath in boolean statement
        WebDriverWait wait = new WebDriverWait(driver, 7);
        try {
            boolean elementState = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).isSelected();
            System.out.println("Value: " + elementState);
            if (elementState == expectedValue) {
                System.out.println("Passed: Checkbox is " + expectedValue);
                logger.log(LogStatus.PASS, "Passed: Checkbox is " + expectedValue);
            } else {
                System.out.println("Failed: Checkbox is " + elementState);
                logger.log(LogStatus.PASS, "Failed: Checkbox is " + elementState);
            }
        } catch (Exception e) {
            System.out.println("Unable to verify element  " + elementName + " " + e);
            logger.log(LogStatus.FAIL, "Unable to verify element  " + elementName + " " + e);
            getScreenShot(driver, elementName, logger);
        }//end of exception
    }//end of verifyBooleanStatement

    //create a void method for switch to tab by index
    public static void switchToTabByIndexMethod(WebDriver driver, int x, ExtentTest logger, String tabName){
        WebDriverWait wait = new WebDriverWait(driver, 7);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        try{driver.switchTo().window(tabs.get(x));
            System.out.println("Successfully switched to tab index#: " + x + " : " + tabName);
            logger.log(LogStatus.PASS, "Successfully switched to tab index#: " + x + " : " + tabName);
        }catch(Exception e){
            System.out.println("Unable to switch to tab index#:" +x + ":" + tabName + e);
            logger.log(LogStatus.FAIL, "Unable to switch to tab index#:" +x + ":" + tabName + e);
            getScreenShot(driver, tabName, logger);
        }//end of exception
    }//end of switch to tab by index method

    //method to capture screenshot when logger fails
    public static void getScreenShot(WebDriver driver,String imageName,ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            //String imgPath = directory + fileName;
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error Occurred while taking SCREENSHOT! " + e);
        }
    }//end of getScreenshot method
}//end of class
