package net.upgenix.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.upgenix.pages.BasePage;
import net.upgenix.pages.DashboardPage;
import net.upgenix.pages.InventoryPage;
import net.upgenix.pages.TransfersPage;
import net.upgenix.utilities.BrowserUtils;
import net.upgenix.utilities.Driver;
import net.upgenix.utilities.ModuleConstants;
import net.upgenix.utilities.SubmenuConstants;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTransferDefs extends BasePage {

    DashboardPage dashboardPage = new DashboardPage();
    InventoryPage inventoryPage = new InventoryPage();
    TransfersPage transfersPage = new TransfersPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @Given("I click on {string} module")
    public void i_click_on_module(String module) {
        switch (module.toLowerCase()){
            case ModuleConstants.INVENTORY:
                wait.until(ExpectedConditions.elementToBeClickable(inventory_mdl));
                dashboardPage.inventory_mdl.click();
                break;
        }
    }

    @When("I click on {string} submenu")
    public void i_click_on_submenu(String submenu) {
        switch (submenu.toLowerCase()){
            case SubmenuConstants.TRANSFERS:
                inventoryPage.transfers_submenu.click();
                break;
        }
    }

    @When("I click on {string} button")
    public void i_click_on_button(String button) {
        switch (button.toLowerCase()){
            case "create":
                wait.until(ExpectedConditions.elementToBeClickable(inventoryPage.create_btn));
                inventoryPage.create_btn.click();
                break;
        }
    }


    @When("I enter random Partner")
    public void i_enter_random_Partner() {
        wait.until(ExpectedConditions.elementToBeClickable(transfersPage.partner_fld));
        transfersPage.partner_fld.click();

        String randomPartner = BrowserUtils.getRandomConpanyName();
        transfersPage.partner_fld.sendKeys(BrowserUtils.getRandomConpanyName());

        transfersPage.sourceDocument_fld.click();

        wait.until(ExpectedConditions.elementToBeClickable(transfersPage.create_btn));
        transfersPage.create_btn.click();

        transfersPage.sourceDocument_fld.sendKeys(BrowserUtils.getRandomString());

        transfersPage.addAnItem_lnk.click();

        wait.until(ExpectedConditions.visibilityOf(transfersPage.product_fld));
        transfersPage.product_fld.sendKeys(BrowserUtils.getRandomProduct());

        wait.until(ExpectedConditions.elementToBeClickable(transfersPage.create_dd));
        transfersPage.create_dd.click();

       transfersPage.additional_info.click();

        transfersPage.operation_type_fld.sendKeys("new operation");

        wait.until(ExpectedConditions.elementToBeClickable(transfersPage.return_option));
        transfersPage.return_option.click();

        transfersPage.note.click();
        transfersPage.note_fld.sendKeys("B15");

        transfersPage.save_transfer_btn.click();










    }



}
