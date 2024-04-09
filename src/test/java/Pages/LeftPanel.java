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
    private WebElement username;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(xpath = "//div[@class='login']/input[@type = 'submit']")
    private WebElement loginButton;
    @FindBy(linkText = "Register")
    private WebElement registerButton;

    public WebElement getWebElement(String element){
        switch (element){
            case "username" : return this.username;
            case "password" : return this.password;
            case "loginButton" : return this.loginButton;
            case "registerButton" : return this.registerButton;
        }
        return null;
    }
}
