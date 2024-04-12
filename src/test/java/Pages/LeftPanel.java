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
    @FindBy(xpath = "//div[@class='login']/input[@type = 'submit']")
    private WebElement loginButton;
    @FindBy(linkText = "Log Out")
    private WebElement logoutButton;
    @FindBy(linkText = "Register")
    private WebElement registerButton;
    @FindBy(xpath = "//div[@id='leftPanel']/p")
    public WebElement titleWelcome;

    public WebElement getWebElement(String element){
        switch (element){
            case "login" : return this.loginButton;
            case "register" : return this.registerButton;
            case "logout": return this.logoutButton;
        }
        return null;
    }
}
