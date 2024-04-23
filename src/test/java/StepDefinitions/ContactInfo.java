package StepDefinitions;

import Pages.RightPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ContactInfo {
    RightPanel rightPanel = new RightPanel();

    @Then("user updates the Form")
    public void userUpdatesTheForm(DataTable formDatas) {
        rightPanel.myWait(2);
        List<List<String>> formData = formDatas.asLists(String.class);

        for (int i = 0; i < formData.size(); i++) {
            WebElement webElement = rightPanel.getWebElement(formData.get(i).get(0));
            rightPanel.mySendKeys(webElement, formData.get(i).get(1));
        }
    }

    @Then("user confirms the form information is updated")
    public void userConfirmsTheFormInformationIsUpdated(DataTable formDatas) {
        rightPanel.myWait(2);
        List<List<String>> formData = formDatas.asLists(String.class);

        for (int i = 0; i < formData.size(); i++) {
            WebElement webElement = rightPanel.getWebElement(formData.get(i).get(0));
            rightPanel.myVerifyEqualsTextToAttribute(webElement, formData.get(i).get(1));
        }
    }
}
