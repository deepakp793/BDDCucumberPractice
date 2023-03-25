package pages;

import base.PredefinedActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstLoginPage extends PredefinedActions {

    private static FirstLoginPage firstLoginPage;

    @FindBy(css="div[class='panel header'] button[tabindex='-1']")
    private WebElement dropDownElement;

    @FindBy(xpath = "//div[@class='panel header']//a[text()='My Account']")
    private WebElement myAccountElement;

    @FindBy(xpath="//a[@role='menuitem']//span[text()='Men']")
    private WebElement dropdown;

    @FindBy(xpath="//nav[@class='navigation']//li[3]//span[text()='Tops']")
    private WebElement menTops;

    @FindBy(id="ui-id-21")
    private WebElement tees;

    private FirstLoginPage(){

    }

    public static FirstLoginPage getObject(){
        if(firstLoginPage==null)
            firstLoginPage = new FirstLoginPage();
        PageFactory.initElements(driver,firstLoginPage);
        return firstLoginPage;
    }

    public void clickOnDropDown(){
        clickOnElement(dropDownElement,true);
    }

    public void clickOnMyAccount(){
        clickOnElement(myAccountElement,false);
    }

    public void hoverOnMenMenu(){
        mouseHoverToElement(dropdown,true);
    }

    public void hoverToTopMenu(){
        mouseHoverToElement(menTops,false);

    }

    public void clickOnTees(){
        clickOnElement(tees,false);
    }

}
