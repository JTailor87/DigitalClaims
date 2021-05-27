package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.driverFactory;
import Util.elementUtil;

public class homePage {
	private WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 20);
	private elementUtil util = new elementUtil(driverFactory.getDriver());

// 1. By Locators: OR
	private By Claims = By.xpath("//body/app-root[1]/app-institutional-dashboard[1]/div[1]/div[2]/div[1]/mat-card[1]/mat-card-actions[1]/button[1]");
	private By Withdrawal = By.xpath("//mat-tab-body/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/button[1]");
	private By FundName = By.xpath("//input[@id='productName']");
	private By Search = By.xpath("//button[contains(text(),'Search')]");
	private By ItemsPerPageDropDown = By.xpath("//body/app-root[1]/app-search[1]/div[1]/app-search-results-table[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]");
	private By MaxNoOfRecord = By.xpath("//span[contains(text(),'250')]");
	private By WithdrawalCheck = By.xpath("//body/app-root[1]/app-search[1]/div[1]/app-search-results-table[1]/app-withdrawal-type[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/span[1]");
	private By Select = By.xpath("//button[contains(text(),'Select')]");
	private By DuplicateClaim = By.xpath("//span[contains(text(),'Duplicate claim')]");
	private By ClaimNotAllowed = By.xpath("//span[contains(text(),'What type of claim would you like to process?')]");
	private By Close = By.xpath("//button[contains(text(),'Close')]");
	private By Cancle = By.xpath("//button[contains(text(),'Cancel')]");

//2. Constructor of the page class:

	public homePage(WebDriver driver) {
		this.driver = driver;
	}

// 3. page actions: features(behavior) of the page the form of methods:
	
	public void ClickOnClaims() {
		util.ScrolldownByPixel(200);
		driver.findElement(Claims).click();
	}
	
	public void SelectWithdrawal() {
		util.ScrolldownByPixel(500);
		driver.findElement(Withdrawal).click();
	}
	
	public void SearchByProductName(String ProductName) {
		util.ScrolldownByPixel(800);
		util.HardWait(2000);
		driver.findElement(FundName).sendKeys(ProductName);
	}
	
	public void ClickOnSearch() {
		util.HardWait(500);
		driver.findElement(Search).click();
		util.HardWait(13000);
		//util.ScrolldownByPixel(1000);
	}
	
	public void ClickOnItemsPerPageDropDown() {
		util.ScrolldownByPixel(1000);
		driver.findElement(ItemsPerPageDropDown).click();
	}
	
	public void SelectMaximiumNoOfRecords() {
		util.HardWait(500);
		driver.findElement(MaxNoOfRecord).click();
		util.HardWait(10000);
	}
	
	public void SelectRadomRecord() {
		int totalRecord = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println("Total Record: "+totalRecord);
		System.out.println("Random Number: "+util.SelectRadomNumberWithinSpecificRange(1, totalRecord));
		driver.findElement(By.xpath("//tbody/tr["+util.SelectRadomNumberWithinSpecificRange(1, totalRecord)+"]")).click();
		try {
			driver.findElement(WithdrawalCheck).click();
			System.out.println("No duplicate claim displayed");
			driver.findElement(Select).click();
		} catch (Exception e) {
			for (int i=1; i<=100; i++) {
				System.out.println(i+" try to find member who has no exiting claim");
				driver.findElement(ClaimNotAllowed).isDisplayed();
				driver.findElement(Cancle).click();
				driver.findElement(By.xpath("//tbody/tr[" + util.SelectRadomNumberWithinSpecificRange(1, totalRecord) + "]")).click();
				if (driver.findElement(ClaimNotAllowed).isDisplayed() == true) {
					break;	
				}
			}
			driver.findElement(WithdrawalCheck).click();
			driver.findElement(Select).click();
			/*
			 * driver.findElement(DuplicateClaim).isDisplayed();
			 * driver.findElement(Close).click();
			 */
			e.printStackTrace();
		}
	}
}
