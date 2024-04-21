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
    @FindBy(name = "payee.name")
    private WebElement payeeName;
    @FindBy(name = "payee.address.street")
    private WebElement payeeAddress;
    @FindBy(name = "payee.address.city")
    private WebElement payeeCity;
    @FindBy(name = "payee.address.state")
    private WebElement payeeState;
    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeZipCode;
    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhoneNumber;
    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccountNumber;
    @FindBy(name = "verifyAccount")
    private WebElement verifyAccount;
    @FindBy(name = "amount")
    private WebElement paymentAmount;
    @FindBy(xpath = "//*[@id='rightPanel']//input[@type='submit']")
    private WebElement paymentButton;
    @FindBy(xpath = "//div[@ng-show='showResult']/h1")
    private WebElement paymentTitle;
    @FindBy(id = "type")
    private WebElement accountTypeSelect;
    @FindBy(id = "fromAccountId")
    private WebElement accountSelect;
    @FindBy(xpath = "//div[@ng-if='showForm']//p[2]/b")
    public WebElement minBalanceMsg;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitBtn;
    @FindBy(id = "newAccountId")
    public WebElement newAccountId;
    @FindBy(xpath = "//div[@ng-if='showResult']/p")
    public WebElement newAccountConfirmMsg;
    @FindBy(id = "fromAccountId")
    private WebElement fromAccount;
    @FindBy(id = "toAccountId")
    private WebElement toAccount;
    @FindBy(id = "amount")
    private WebElement amount;
    @FindBy(xpath = "//h1[@class='title']")
    private WebElement title;
    @FindBy(xpath = "//*[@name='contact']//input[@type='submit']")
    private WebElement updateProfileButton;

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
            case "payeeName" : return this.payeeName;
            case "payeeAddress" : return this.payeeAddress;
            case "payeeCity" : return this.payeeCity;
            case "payeeState" : return this.payeeState;
            case "payeeZipCode" : return this.payeeZipCode;
            case "payeePhoneNumber" : return this.payeePhoneNumber;
            case "payeeAccountNumber" : return this.payeeAccountNumber;
            case "verifyAccountNumber" : return this.verifyAccount;
            case "paymentAmount" : return this.paymentAmount;
            case "Send Payment" : return this.paymentButton;
            case "Bill Payment Complete" : return this.paymentTitle;
            case "account type menu" : return this.accountTypeSelect;
            case "Open New Account" :
            case "transfer" : return this.submitBtn;
            case "account menu" : return this.accountSelect;
            case "from account menu" : return this.fromAccount;
            case "to account menu" : return this.toAccount;
            case "amount" : return this.amount;
            case "Transfer Complete!" : return this.title;
            case "Update Profile" : return this.updateProfileButton;
        }
        return null;
    }
}
