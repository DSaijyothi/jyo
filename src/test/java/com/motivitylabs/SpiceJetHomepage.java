package com.motivitylabs;

import Actions.SeleniumActions;
import QA23Waits.SeleniumWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpiceJetHomepage
{

    private WebDriver driver;
    private SeleniumActions seleniumActions;


    public SpiceJetHomepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumActions = new SeleniumActions(driver);
        Actions act=new Actions(driver);

    }
    @FindBy(css="[data-testid='round-trip-radio-button']")
    private WebElement RoundTrip;

    @FindBy(css="[type='text']")
    private WebElement From;

    @FindBy(css="[type='text']")
    private WebElement To;

    By FromDate=By.cssSelector("[data-testid='to-testID-destination']>div");
    By DepartureDate=By.cssSelector("[data-testid='departure-date-dropdown-label-test-id']");
    By ReturnDate=By.cssSelector("[data-testid='return-date-dropdown-label-test-id']");

    @FindBy(xpath=(""))
    private WebElement dep;
}
