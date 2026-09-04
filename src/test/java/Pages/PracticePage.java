package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.latest.browser.model.WindowID;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PracticePage {
    WebDriver driver;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceLink;

    @FindBy(id = "invoices-toggle-btn")
    WebElement invoicesToggleButton;

    @FindBy(id = "deviceType")
    WebElement deviceTypeSelect;

    @FindBy(id = "brand")
    WebElement brandSelect;

    @FindBy(xpath = "//input[@id='storage-128GB']")
    WebElement storageRadioButton;

    @FindBy(id = "color")
    WebElement colorSelect;

    @FindBy(id = "quantity")
    WebElement quantityField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "inventory-next-btn")
    WebElement inventoryNextButton;

    @FindBy(xpath = "//input[@id='shipping-express']")
    WebElement shippingExpressRadioButton;

    @FindBy(xpath = "//input[@id='warranty-1yr']")
    WebElement warrantyRadioButton;

    @FindBy(id="discount-code")
    WebElement discountCodeField;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton;

    @FindBy(id = "purchase-device-btn")
    WebElement purchaseDeviceButton;

    @FindBy(id = "view-history-btn")
    WebElement viewHistoryButton;

    @FindBy(xpath = "(//button[contains(@id, 'view-invoice-INV-')])[1]")
    WebElement viewInvoiceButton;


    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyWebAutomationAdvanceLinkDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(webAutomationAdvanceLink));
        webAutomationAdvanceLink.isDisplayed();
    }

    public void clickWebAutomationAdvanceLink() {
        webAutomationAdvanceLink.click();
    }

    public void verifyInvoicesToggleButtonDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(invoicesToggleButton));
        invoicesToggleButton.isDisplayed();
    }

    public void selectDeviceType(){
        Select deviceType = new Select(deviceTypeSelect);
        deviceType.selectByValue("phone");
    }

    public void selectBrand(){
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(brandSelect));
        Select brand = new Select(brandSelect);
        brand.selectByValue("apple");
    }

    public void selectStorage(){
        storageRadioButton.click();
    }

    public void selectColor(){
        Select color = new Select(colorSelect);
        color.selectByValue("blue");
    }

    public void enterQuantity(){
        quantityField.sendKeys("2");
    }

    public void enterAddress(){
        addressField.sendKeys("23 Test Street");
    }

    public void clickInventoryNextButton(){
        inventoryNextButton.click();
    }

    public void selectShippingExpress(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(shippingExpressRadioButton));
        shippingExpressRadioButton.click();
    }

    public void selectWarranty(){
        warrantyRadioButton.click();
    }

    public void enterDiscountCode(){
        discountCodeField.sendKeys("SAVE10");
    }

    public void clickApplyDiscountButton(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(applyDiscountButton));
        applyDiscountButton.click();
    }

    public void clickPurchaseDeviceButton(){
        purchaseDeviceButton.click();
    }

    public void clickViewHistoryButton(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(viewHistoryButton));
        viewHistoryButton.click();
    }

    public void clickViewInvoiceButton(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(viewInvoiceButton));
        viewInvoiceButton.click();
    }
}

