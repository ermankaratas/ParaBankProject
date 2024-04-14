package StepDefinitions;

import Pages.LeftPanel;
import Pages.RightPanel;
import Utilities.ConfigReader;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Register {
    LeftPanel leftPanel = new LeftPanel();
    RightPanel rightPanel = new RightPanel();

    @Given("User navigate to the Parabank Website")
    public void userNavigateToTheParabankWebsite() {
        GWD.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("user clicks the {string} button")
    public void userClicksTheButton(String buttonName) {
        leftPanel.myClick(leftPanel.getWebElement(buttonName));
    }

    @Then("user fills the {string} Form")
    public void userFillsTheForm(String formName, DataTable formDatas) {
        List<List<String>> formData = formDatas.asLists(String.class);

        for (int i = 0; i < formData.size(); i++) {
            WebElement webElement = rightPanel.getWebElement(formData.get(i).get(0));
            rightPanel.mySendKeys(webElement, formData.get(i).get(1));
        }
    }

    @And("user clicks the {string} button on the main content")
    public void userClicksTheButtonOnTheMainContent(String buttonName) {
        rightPanel.myClick(rightPanel.getWebElement(buttonName));
    }

    @And("user should see the {string} message")
    public void userShouldSeeTheMessage(String confirmText) {
        rightPanel.myVerifyContainsText(rightPanel.confirmMessage, confirmText);
    }
}
