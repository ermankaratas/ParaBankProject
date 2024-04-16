package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPanel {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        myScrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        myScrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public void myScrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public String myJsGetText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        return (String) (js.executeScript("arguments[0].textContent;", element));
    }

    public void myVerifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().contains(value));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myVerifyEqualsText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().equalsIgnoreCase(value));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public static int myRandomGenerator(int number) {
        return (int) (Math.random() * number);
    }

    public void myHover(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    public void mySelectMenu(WebElement element, int index) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void mySelectMenu(WebElement element, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void myVerifyContainsCurrentUrl(String url) {
        String currentUrl = GWD.getDriver().getCurrentUrl();
        wait.until(ExpectedConditions.urlContains(url));
        Assert.assertTrue(currentUrl.contains(url));
    }
}
