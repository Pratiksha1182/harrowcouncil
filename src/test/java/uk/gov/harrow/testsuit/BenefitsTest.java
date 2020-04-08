package uk.gov.harrow.testsuit;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.BenefitsPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.MainMenuPage;
import uk.gov.harrow.testbase.TestBase;

public class BenefitsTest extends TestBase {
HomePage homePage = new HomePage();
BenefitsPage benefitsPage = new BenefitsPage();
MainMenuPage mainMenuPage = new MainMenuPage();


 @Test
public void verifyUserIsAbleToNavigateToBenefitsPage(){
     homePage.clickOnServicesButton();
     mainMenuPage.mouseHoverOnBenefitsAndClick();
     benefitsPage.clickOnApplyForHousingBenefitLink();
     benefitsPage.clickOnEntitlementCalcBtn();
     benefitsPage.clickOnStartBtn();
     benefitsPage.clickOnMortgageOrOwnedOutright();
     benefitsPage.enterPostCodeInPostCodeField();
     benefitsPage.clickOnNextBtn();

 }

}
