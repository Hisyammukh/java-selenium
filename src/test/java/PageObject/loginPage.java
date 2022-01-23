package PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
    
    @FindBy(xpath = "//img[@alt='GudangAda logo']")
    public WebElement gudangAdaLogo;

    @FindBy(xpath = "//h3[normalize-space()='Dashboard Penjual']")
    public WebElement titleText;

    @FindBy(css = ".MuiTypography-root.jss3.MuiTypography-body2")
    public WebElement descriptionText;
    
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumberField;

    @FindBy(className = "MuiButton-label")
    public WebElement masukButton;
    
    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

}
