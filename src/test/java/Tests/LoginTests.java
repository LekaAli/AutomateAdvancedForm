package Tests;

import Utils.ReadData;
import org.testng.annotations.Test;

public class LoginTests extends base {


    @Test
    public void clickLoginButton() throws InterruptedException {
        takesScreenshots.takesSnapShot(driver, "landing page");
        homePage.clickLoginButton();
    }

    @Test(priority = 1)
    public void enterUsernameTests() {
        loginPage.enterUsername(ReadData.username);
    }

    @Test(priority = 2)
    public void enterPassword() {
        loginPage.enterPassword(ReadData.password);
        takesScreenshots.takesSnapShot(driver, "login page");
    }

    @Test(priority = 3)
    public void clickLoginSubmitButton() throws InterruptedException {
        loginPage.clickLoginSubmitButton();
        Thread.sleep(2000);
        takesScreenshots.takesSnapShot(driver, "dashboard page");
    }

    @Test(priority = 4)
    public void verifyLoginSuccessTest() {
        landingPage.verifyLoginSuccess();
        takesScreenshots.takesSnapShot(driver, "Landing page");
    }

    @Test(priority = 5)
    public void clickLearnButtonTest() {
        landingPage.clickLearnButton();
        takesScreenshots.takesSnapShot(driver, "landing page - learn tab clicked");
    }

    @Test(priority = 6)
    public void clickLearningMaterialsButtonTest() {
        landingPage.clickLearningMaterialsButton();
        takesScreenshots.takesSnapShot(driver, "practice page");
    }

    @Test(priority = 7)
    public void verifyWebAutomationAdvanceLinkDisplayedTest() {
        practicePage.verifyWebAutomationAdvanceLinkDisplayed();
        takesScreenshots.takesSnapShot(driver, "practice page - after verify");
    }

    @Test(priority = 8)
    public void clickWebAutomationAdvanceLinkTest() {
        practicePage.clickWebAutomationAdvanceLink();
        takesScreenshots.takesSnapShot(driver, "inventory page");
    }

    @Test(priority = 9)
    public void verifyInvoicesToggleButtonDisplayedTest() {
        practicePage.verifyInvoicesToggleButtonDisplayed();
        takesScreenshots.takesSnapShot(driver, "inventory page - displayed");
    }

    @Test(priority = 10)
    public void selectDeviceTypeTest() {
        practicePage.selectDeviceType();
        takesScreenshots.takesSnapShot(driver, "inventory page - device selected");
    }

    @Test(priority = 11)
    public void selectBrandTest() {
        practicePage.selectBrand();
        takesScreenshots.takesSnapShot(driver, "inventory page - brand selected");
    }

    @Test(priority = 12)
    public void selectStorageTest() {
        practicePage.selectStorage();
        takesScreenshots.takesSnapShot(driver, "inventory page - device storage selected");
    }

    @Test(priority = 13)
    public void selectColorTest() {
        practicePage.selectColor();
        takesScreenshots.takesSnapShot(driver, "inventory page - color selected");
    }

    @Test(priority = 14)
    public void enterQuantityTest() {
        practicePage.enterQuantity();
        takesScreenshots.takesSnapShot(driver, "inventory page - quantity entered");
    }


    @Test(priority = 15)
    public void enterAddressTest() {
        practicePage.enterAddress();
        takesScreenshots.takesSnapShot(driver, "inventory page - address entered");
    }

    @Test(priority = 16)
    public void clickInventoryNextButtonTest() {
        practicePage.clickInventoryNextButton();
        takesScreenshots.takesSnapShot(driver, "inventory page - clicked inventory next button");
    }

    @Test(priority = 17)
    public void selectShippingExpressTest() {
        practicePage.selectShippingExpress();
        takesScreenshots.takesSnapShot(driver, "inventory page - express shipping selected");
    }

    @Test(priority = 18)
    public void selectWarrantyTest() {
        practicePage.selectWarranty();
        takesScreenshots.takesSnapShot(driver, "inventory page - warranty selected");
    }

    @Test(priority = 19)
    public void enterDiscountCodeTest() {
        practicePage.enterDiscountCode();
        takesScreenshots.takesSnapShot(driver, "inventory page - discount code entered");
    }

    @Test(priority = 20)
    public void clickApplyDiscountButtonTest() {
        practicePage.clickApplyDiscountButton();
    }

    @Test(priority = 21)
    public void clickPurchaseDeviceButtonTest() {
        practicePage.clickPurchaseDeviceButton();
        takesScreenshots.takesSnapShot(driver, "inventory page - clicked purchase device button");
    }

    @Test(priority = 22)
    public void clickViewHistoryButtonTest() {
        practicePage.clickViewHistoryButton();
        takesScreenshots.takesSnapShot(driver, "inventory page - viewed history");
    }

    @Test(priority = 23)
    public void clickViewInvoiceButtonTest() {
        practicePage.clickViewInvoiceButton();
        takesScreenshots.takesSnapShot(driver, "inventory page - viewed invoice");
    }



}