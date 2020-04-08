package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class BenefitsPage extends Utility {
    //By mainMenuAerialLabel = By.xpath("//nav[@class='nav nav--primary']");
    By applyForHousingBenefitLink = By.xpath("//h2[contains(text(),'Apply for Housing Benefit')]");
    By entitlementCalculatorButton = By.xpath("//a[@class='button']");
    By startButton = By.id("StartCalculationBtn");
    By mortgageOrOwnedOutright = By.xpath("//div[contains(@class,'wrap-box housing-messages func-crop-buttons multiple-items-wrap')]//label[contains(@class,'ClaimForm.Web.Helpers.CFRadioButtonRenderedOption.4 jcf-label-active')]");
    By dropDownMenuYear = By.xpath("//span[contains(@class,'jcf-select jcf-unselectable jcf-select-short jcf-select-func-ddlanswer jcf-drop-active jcf-drop-flipped')]");
    By postCodeField = By.id("Postcode");
    By nextButton = By.id("nextButton");

    //public void mouseHoverOnBenefits(){ mouseHoverToElementAndClick(mainMenuAerialLabel);}

    public void clickOnApplyForHousingBenefitLink(){ clickOnElement(applyForHousingBenefitLink); }

    public void clickOnEntitlementCalcBtn(){ clickOnElement(entitlementCalculatorButton); }

    public void clickOnStartBtn(){ clickOnElement(startButton); }

    public void clickOnMortgageOrOwnedOutright(){ clickOnElement(mortgageOrOwnedOutright); }

    public void enterPostCodeInPostCodeField(){ sendTextToElement(postCodeField,"HA0 2SJ"); }

    public void clickOnNextBtn(){ clickOnElement(nextButton); }
}

