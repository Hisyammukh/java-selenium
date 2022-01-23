package TestSteps;

import static Config.config.driver;
import PageObject.loginPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class loginSteps extends loginPage{

    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 30);
    
    public loginSteps(){
        PageFactory.initElements(driver,this);
    }
    
    public void verifyTitleLoginPage(){
        Assert.assertEquals(titleText.getText(), "Dashboard Penjual");
        
    }

    public void verifyLoginPageDesc(){
        Assert.assertTrue(descriptionText.getText().contains("Kelola produk dan transaksi"));
    }

    public void verifyInputPhoneNumber(){
        phoneNumberField.sendKeys("85887184592");
    }

    public void loginSubmit(){
        masukButton.click();
        // String expected_url = "https://seller.gudangada.com/home";
        // String actual_url = (driver.getCurrentUrl());
        // Assert.assertEquals(actual_url, expected_url);
    }

}