package StepDefinitions;

import Pages.RightPanel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MoneyTransfer {
    RightPanel rightPanel = new RightPanel();
    @And("user enters {string} to the {string} field")
    public void userEntersToTheField(String amount, String boxElement) {
        rightPanel.myHover(rightPanel.getWebElement(boxElement));
        rightPanel.mySendKeys(rightPanel.getWebElement(boxElement), amount);
    }

    @Then("user confirms the transaction with the message {string} on the title")
    public void userConfirmsTheTransactionWithTheMessageOnTheTitle(String title) {
        rightPanel.myVerifyEqualsText(rightPanel.getWebElement(title), title);
    }
}
