package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

import javax.net.ssl.HostnameVerifier;

public class HomePage extends Utility {
By serviceButton = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");
By benefitsLink = By.xpath("//a[contains(text(),'Benefits')]");
By mainMenuAerialLabel = By.xpath("//nav[@class='nav nav--primary']");


public void clickOnServicesButton(){ clickOnElement(serviceButton);}
public void clickonbenefitsLink(){ clickOnElement(benefitsLink);}
public void mouseHoverOnBenefitsAndClick(){ mouseHoverToElementAndClick(mainMenuAerialLabel);}

}
