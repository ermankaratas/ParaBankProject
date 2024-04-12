package StepDefinitions;

import Pages.LeftPanel;
import Pages.RightPanel;
import Utilities.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Login {
    LeftPanel leftPanel = new LeftPanel();
    RightPanel rightPanel = new RightPanel();

    @And("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        leftPanel.mySendKeys(leftPanel.username, ConfigReader.getProperty("username"));
        leftPanel.mySendKeys(leftPanel.password, ConfigReader.getProperty("password"));
    }

    @Then("user confirms the successful login")
    public void userConfirmsTheSuccessfulLogin() {
        leftPanel.myVerifyContainsText(leftPanel.titleWelcome, "Welcome");
    }

    @And("user enters invalid {string} and {string}")
    public void userEntersInvalidAnd(String username, String password) {
        leftPanel.mySendKeys(leftPanel.username, username);
        leftPanel.mySendKeys(leftPanel.password, password);
    }

    @Then("user should see the {string} error message")
    public void userShouldSeeTheErrorMessage(String errorText) {
        rightPanel.myVerifyContainsText(rightPanel.errorMessage, errorText);
    }
}
