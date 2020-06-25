package net.upgenix.pages;

import net.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransfersPage extends BasePage{

    public TransfersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "o_field_input_395")
    public WebElement partner_fld;

    @FindBy (id = "o_field_input_400")
    public WebElement sourceDocument_fld;

    @FindBy (xpath = "//span[contains(text(), 'Create')]")
    public WebElement create_btn;

    @FindBy (xpath = "//div[@class='table-responsive']/table/tbody/tr/td/a")
    public WebElement addAnItem_lnk;

    @FindBy (xpath = "//div[@class='table-responsive']/table//span[@class='o_dropdown_button']")
    public WebElement dp;

    @FindBy (xpath = "//ul[@id='ui-id-104']//li[@class='ui-menu-item ui-state-focus']")
    public WebElement options_dp;

    @FindBy (xpath = "//div[@class='table-responsive']/table//input[@class='o_input ui-autocomplete-input']")
    public WebElement product_fld;

    @FindBy (partialLinkText = "Create \"")
    public  WebElement create_dd;

    @FindBy (linkText = "Note")
    public WebElement note;

    @FindBy (linkText = "Additional Info")
    public WebElement additional_info;

    @FindBy (xpath = "//textarea[starts-with(@id, 'o_field_input_')]")
    public WebElement note_fld;

    @FindBy (xpath = "//button[contains(text(), 'Save')]")
    public WebElement save_transfer_btn;

    @FindBy (xpath = "//div[@name='picking_type_id']/div/input")
    public WebElement operation_type_fld;

    @FindBy (linkText = "YourCompany: New Operation")
    public WebElement return_option;


}
