package base;

import constant.ConstantValue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class PredefinedActions {

    protected static WebDriver driver;
    static WebDriverWait wait;
    private static Actions actions;

    public static void start(String URL) {
        System.setProperty(ConstantValue.CHROMEDRIVERKEY, ConstantValue.CHROMEDRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        wait = new WebDriverWait(driver, ConstantValue.EXPLICITWAIT);
        actions = new Actions(driver);
    }

    public static String getPageTitle() {
        return driver.getTitle();
    }

    protected void clickOnElement(WebElement e, boolean isWaitRequired) {
        if (isWaitRequired) {
            wait.until(ExpectedConditions.elementToBeClickable(e));
        }
        e.click();
    }

    protected void clickOnLoginButton(WebElement e, boolean isWaitRequired) {
        if (isWaitRequired)
            wait.until(ExpectedConditions.elementToBeClickable(e));
        e.submit();
    }

    protected void enterText(WebElement e, String str) {
        e.sendKeys(str);
    }

    protected String getElementText(WebElement e, boolean isWaitRequired) {
        if (isWaitRequired) {
            waitForVisibilityOfElement(e);
        }

        String text = e.getText();
        if (text.equals(""))
            text = e.getAttribute("value");

        return text;
    }

    protected boolean isElementDisplayed(WebElement e, boolean isWaitRequired){
        if(waitForVisibilityOfElement(e)) {
            return true;
        }
        return false;
    }

    protected List<String> getListOfElementText(List<WebElement> list) {
        List<String> listOfElementText = new ArrayList<String>();
        for (WebElement e : list) {
            listOfElementText.add(e.getText());
        }
        return listOfElementText;
    }

    protected boolean waitForVisibilityOfElement(WebElement e) {
        try {
            wait.until(ExpectedConditions.visibilityOf(e));
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    protected void mouseHoverToElement(WebElement e, boolean isWaitRequired){
        if (isWaitRequired)
            waitForVisibilityOfElement(e);
        actions.moveToElement(e).build().perform();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public static void wrapUp() {
        driver.quit();
    }

}