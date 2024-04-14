package StepDefinitions;

import Pages.RightPanel;
import io.cucumber.java.en.And;

public class Payment {
    RightPanel rightPanel = new RightPanel();

    @And("user should see the {string} title")
    public void userShouldSeeTheTitle(String title) {
        rightPanel.myVerifyEqualsText(rightPanel.getWebElement(title), title);
    }
}
