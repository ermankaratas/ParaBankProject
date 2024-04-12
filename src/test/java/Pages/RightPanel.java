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
    @FindBy(xpath = "//div[@id='rightPanel']/p")
    public WebElement confirmMessage;
    @FindBy(xpath = "//p[@class='error']")
    public WebElement errorMessage;

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
            case "username" : return this.registerUsername;
            case "password" : return this.registerPassword;
            case "confirmPassword" : return this.repeatedPassword;
            case "register" : return this.registerButton;
        }
        return null;
    }


}
