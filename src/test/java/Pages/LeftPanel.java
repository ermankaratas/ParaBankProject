package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftPanel extends ParentPanel {
    public LeftPanel() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(name = "username")
    public WebElement username;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(css = "div.login > input[type='submit']")
    private WebElement loginButton;
    @FindBy(linkText = "Log Out")
    private WebElement logoutButton;
    @FindBy(linkText = "Register")
    private WebElement registerButton;
    @FindBy(css = "#leftPanel > p")
    public WebElement titleWelcome;
    @FindBy(linkText = "Bill Pay")
    private WebElement billPayButton;
    @FindBy(linkText = "Open New Account")
    private WebElement newAccountButton;

    public WebElement getWebElement(String element){
        switch (element){
            case "login" : return this.loginButton;
            case "register" : return this.registerButton;
            case "logout" : return this.logoutButton;
            case "Bill Pay" : return this.billPayButton;
            case "Open New Account" : return this.newAccountButton;
        }
        return null;
    }
}
