package TestSuite;

import Config.config;
import TestSteps.loginSteps;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends config {
    loginSteps ls;
    
    ExtentTest test;
    ExtentReports report;

    @BeforeSuite
    public void initTest(){
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("report.html");
        report = new ExtentReports();
        report.attachReporter(htmlReporter);
            
    }

    @BeforeTest
    public void start(){
        initialize();
        ls = new loginSteps();
    }

    @Test (priority = -1)
    public void login()throws InterruptedException {
        test = report.createTest("Gudang Ada Login Automation Report");
        try{
            Thread.sleep(5000);
            ls.verifyTitleLoginPage();
            test.info("Get the correct title");
            ls.verifyLoginPageDesc();
            test.info("Get the correct description");
            ls.verifyInputPhoneNumber();
            test.info("User input phone number");
            ls.loginSubmit();
            test.info("Submit login")

            test.pass("Successfully logged in and go to home page");
        }
        catch (AssertionError e){
            test.fail("Expected title should be 'Dashboard Penjual'");
            test.fail("Expected description should contain 'Kelola produk'");
            test.fail("Failed to login");
        }
       
    }

    @AfterTest
    public void close(){
        quit();
        report.flush();
    }
    
}
