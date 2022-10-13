package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {
    public HMCPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(id = "btnSubmit")
    public WebElement ikinciLoginButton;

    @FindBy(id = "menuHotels")
    public WebElement hotelManagement;

}
