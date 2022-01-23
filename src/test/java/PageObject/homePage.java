package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    @FindBy(xpath = "//h3[normalize-space()='Registartion Status Banner']")
    public WebElement bannerText;

}
