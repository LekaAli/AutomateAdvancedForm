package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='My Learning']")
    WebElement myLearningTab;

    @FindBy(xpath = "//span[text()='Learn']")
    WebElement myLearnTab;

    @FindBy(xpath = "//span[normalize-space()='Learning Materials']")
    WebElement myLearningMaterialsTab;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(myLearningTab));
        myLearningTab.isDisplayed();
    }

    public void clickLearnButton(){
        myLearnTab.click();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(myLearningMaterialsTab));
    }

    public void clickLearningMaterialsButton(){
        myLearningMaterialsTab.click();
    }



}
