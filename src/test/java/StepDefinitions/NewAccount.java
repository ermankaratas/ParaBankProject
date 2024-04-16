package StepDefinitions;

import Pages.RightPanel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class NewAccount {
    RightPanel rightPanel = new RightPanel();

    @Then("user should be directed to the {string} page")
    public void userShouldBeDirectedToThePage(String url) {
        rightPanel.myVerifyContainsCurrentUrl(url);
    }

    @And("user selects the {string} type from the {string}")
    public void userSelectsTheTypeFromTheMenu(String accountType, String menu) {
        rightPanel.myHover(rightPanel.getWebElement(menu));
        rightPanel.mySelectMenu(rightPanel.getWebElement(menu), accountType);
    }

    @And("user should see the {string} message under selected account")
    public void userShouldSeeTheMessageUnderSelectedAccount(String message) {
        rightPanel.myVerifyContainsText(rightPanel.minBalanceMsg, message);

    }

    @And("user selects the {int} from the {string}")
    public void userSelectsTheFromTheMenu(int index, String menu) {
        rightPanel.myHover(rightPanel.getWebElement(menu));
        rightPanel.mySelectMenu(rightPanel.getWebElement(menu), index);
    }

    @Then("user confirms the opening new account")
    public void userConfirmsTheOpeningNewAccount() {
        rightPanel.myVerifyContainsText(rightPanel.newAccountConfirmMsg, "Congratulations");
    }

    @And("user should see the account number clickable")
    public void userShouldSeeTheAccountNumberClickable() {
        rightPanel.myClick(rightPanel.newAccountId);
    }
}
