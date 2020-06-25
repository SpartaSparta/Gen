package net.upgenix.pages;

import net.upgenix.utilities.CommonMethods;
import net.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage implements CommonMethods {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (tagName = "title")
    public WebElement base_page_title;

    @FindBy (linkText = "Discuss")
    public WebElement discuss_mdl;

    @FindBy (linkText = "Calendar")
    public WebElement calendar_mdl;

    @FindBy (linkText = "Notes")
    public WebElement notes_mdl;

    @FindBy (linkText = "Contacts")
    public WebElement contacts_mdl;

    @FindBy (linkText = "Website")
    public WebElement website_mdl;

    @FindBy (linkText = "Inventory")
    public WebElement inventory_mdl;

    @FindBy (linkText = "Manufacturing")
    public WebElement manufacturing_mdl;

    @FindBy (linkText = "Repairs")
    public WebElement repairs_mdl;

    @FindBy (linkText = "Invoicing")
    public WebElement invoicing_mdl;

    @FindBy (linkText = "Timesheets")
    public WebElement timesheets_mdl;

    @FindBy (linkText = "Employees")
    public WebElement employees_mdl;

    @FindBy (linkText = "Leaves")
    public WebElement leaves_mdl;

    @FindBy (linkText = "Expenses")
    public WebElement expenses_mdl;

    @FindBy (linkText = "Lunch")
    public WebElement lunch_mdl;

    @FindBy (linkText = "Maintenance")
    public WebElement maintenance_mdl;

    @FindBy (linkText = "Dashboard")
    public WebElement dashboard_mdl;





    /*
    public void changeMenu(String menu1, String menu2) {
        String menu1xpath = "//span[contains(text(), '"+menu1+"')][@class='title title-level-1']";
        WebElement menu1Element = Driver.getDriver().findElement(By.xpath(menu1xpath));

        String menu2xpath = "//span[.='"+menu2.trim()+"'][@class='title title-level-2']";
        WebElement menu2Element = Driver.getDriver().findElement(By.xpath(menu2xpath));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.elementToBeClickable(menu1Element));
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //wait.until(ExpectedConditions.elementToBeClickable(menu1Element));
        wait.until(ExpectedConditions.visibilityOf(menu1Element));
        menu1Element.click();
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.elementToBeClickable(menu2Element));
        menu2Element.click();
    }
     */

}
