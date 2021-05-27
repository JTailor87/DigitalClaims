package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.driverFactory;
import Util.elementUtil;

public class claimsTrackingPage {
	private WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 20);
	private withdrawalClaimPage WithdrawalClaimPage = new withdrawalClaimPage(driverFactory.getDriver());
	private elementUtil util = new elementUtil(driverFactory.getDriver());
	
//1. By Locators:
	private By ClaimsTracking = By.xpath("//body/app-root[1]/div[1]/app-nav-ribbon[1]/div[1]/div[1]/button[10]/img[1]");
	private By ClaimNumber = By.xpath("//input[@id='claimnumber']");
	private By ClaimStatus = By.xpath("//select[@id='claimstatus']");
	private By Search = By.xpath("//button[contains(text(),'Search')]");
	private By VClaimNumber = By.xpath("//app-claims-tracking/div[1]/div[3]/table/tbody/tr/td[1]");
	
//2. Constructor of the page class:

	public claimsTrackingPage(WebDriver driver) {
		this.driver = driver;
	}

// 3. page actions: features(behavior) of the page the form of methods:
	public void ClickOnClaimsTracking() {
		//util.ScrolldownByPixel(-250);
		driver.findElement(ClaimsTracking).click();
	}
	
	public void EnterClaimsNumber(String cNo) {
		util.HardWait(2000);
		driver.findElement(ClaimNumber).sendKeys(cNo);
	}
	
	public void SlectClaimStatusSaved(String status) {
		WebElement cStatus = driver.findElement(ClaimStatus);
		util.AccessDropdownByVisibleText(cStatus, status);
	}
	
	public void ClickOnSearch() {
		driver.findElement(Search).click();
		util.HardWait(4000);
		util.ScrolldownByPixel(200);
	}
	
	public String ValidateSavedClaimNumber() {
		String SavedClaimNumber = driver.findElement(VClaimNumber).getText();
		System.out.println("Claim number from search result: "+SavedClaimNumber);
		return SavedClaimNumber;
	}
}
