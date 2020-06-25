package net.upgenix.pages;

import net.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {

    public InventoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[contains(text(), 'Create')]")
    public WebElement create_btn;

    @FindBy (linkText = "Transfers")
    public WebElement transfers_submenu;
}
