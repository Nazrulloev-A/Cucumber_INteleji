package LoginPage;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage {

    public orderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    public WebElement firstName;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    public WebElement secondName;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteSelectedBtn;

    public void selectFirstRow(){
        firstName.click();
    }

    public void selectSecondRow(){
        secondName.click();
    }

    public void clickDeleteBtn(){
        deleteSelectedBtn.click();
    }
}
