package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightPanel extends ParentPanel{
    public RightPanel() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(id = "customer.firstName")
    private WebElement firstName;
    @FindBy(id = "customer.lastName")
    private WebElement lastName;
    @FindBy(id = "customer.address.street")
    private WebElement address;
    @FindBy(id = "customer.address.city")
    private WebElement city;
    @FindBy(id = "customer.address.state")
    private WebElement state;
    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber")
    private WebElement phoneNumber;
    @FindBy(id = "customer.ssn")
    private WebElement ssn;
    @FindBy(id = "customer.username")
    private WebElement registerUsername;
    @FindBy(id = "customer.password")
    private WebElement registerPassword;
    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPassword;
    @FindBy(xpath = "//*[@id='customerForm']//input[@type='submit']")
    private WebElement registerButton;

    public WebElement getWebElement(String element){
        switch (element){
            case "firstName" : return this.firstName;
            case "lastName" : return this.lastName;
            case "address" : return this.address;
            case "city" : return this.city;
            case "state" : return this.state;
            case "zipCode" : return this.zipCode;
            case "phoneNumber" : return this.phoneNumber;
            case "ssn" : return this.ssn;
            case "registerUsername" : return this.registerUsername;
            case "registerPassword" : return this.registerPassword;
            case "repeatedPassword" : return this.repeatedPassword;
            case "registerButton" : return this.registerButton;
        }
        return null;
    }


}
