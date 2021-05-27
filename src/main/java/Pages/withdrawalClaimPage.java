package Pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.driverFactory;
import Util.elementUtil;

public class withdrawalClaimPage {
	private WebDriver driver;
	private WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(), 20);
	private elementUtil util = new elementUtil(driverFactory.getDriver());

// 1. By Locators: OR
	
	private By NameOfEmployer = By.xpath("//input[@id='nameOfEmployer']");
	private By MembershipDetails = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[2]/div[1]/h2[1]/button[1]/h1[1]");
	private By Initials = By.xpath("//input[@id='initials']");
	private By MiddleName = By.xpath("//input[@id='middleName']");
	private By CellNo = By.xpath("//input[@id='cellNo']");
	private By PhoneNo = By.xpath("//input[@id='phoneNo']");
	private By EmailAddress = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[2]/div[2]/app-member-details[1]/div[1]/form[1]/div[2]/div[3]/input[1]");
	private By CountryOfResidenceDropDown = By.xpath("//select[@id='countryOfResidence']");
	private By TaxEdit = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[2]/div[2]/app-member-details[1]/div[1]/form[1]/div[2]/div[8]/span[1]/img[1]");
	private By TaxReferenceNumber = By.xpath("//input[@id='taxReferenceNumber']");
	private By OutsideSpace = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[2]/div[2]/app-member-details[1]/div[1]/form[1]");
	private By UnitNo = By.xpath("//input[@id='unitNo']");
	private By ComplexName = By.xpath("//input[@id='complex']");
	private By StreetNo = By.xpath("//input[@id='streetNo']");
	private By FarmName = By.xpath("//input[@id='streetName']");
	private By Suburb = By.xpath("//input[@id='suburb']");
	private By City = By.xpath("//input[@id='city']");
	private By PostalCode = By.xpath("//input[@id='addressPostalCode']");
	private By Country = By.xpath("//select[@id='country']");
	private By PostalAddress = By.xpath("//label[contains(text(),'Same as above')]");
	private By WithdrawalDetails = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[1]/h2[1]/button[1]/h1[1]");
	private By Resignation = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]/span[1]");
	private By Dismissal = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[2]/div[1]/div[2]/label[1]/span[1]");
	private By NonQualifyingRetrenchment = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[2]/div[1]/div[3]/label[1]/span[1]");
	private By QualifyingRetrenchment = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[2]/div[1]/div[4]/label[1]/span[1]");
	private By QualifyingRetrenchmentText = By.xpath("//div[contains(text(),'In order to select \"Qualifying Retrenchment\", the ')]");
	private By KeepYourSavingsWhereTheyAre = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[3]/div[1]/span[1]/label[1]/span[1]");
	private By FullTransfer = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[3]/div[1]/span[2]/label[1]/span[1]");
	private By PartTransfer = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[3]/div[1]/span[3]/label[1]/span[1]");
	private By WithdrawAllMySavings = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[3]/div[1]/span[4]/label[1]/span[1]");
	private By NoPayment = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[3]/div[1]/span[5]/label[1]/span[1]");
	private By AmountToBeWithdrawn = By.xpath("//input[@id='partialWithdrwalAmount']");
	private By No = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]");
	private By Yes = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[3]/div[2]/app-institutional-withdrawal-details[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]");
	private By Indebtedness = By.xpath("//input[@id='indebtednessAmount']");
	private By PaymentDetails = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[4]/div[1]/h2[1]/button[1]/h1[1]");
	private By AccHolderName = By.xpath("//input[@id='accountHolderName']");
	private By NameOfBank = By.xpath("//input[@id='nameOfBank']");
	private By AccNo = By.xpath("//input[@id='accountNumber']");
	private By BranchCode = By.xpath("//input[@id='branchCode']");
	private By Cheque = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[4]/div[2]/app-institutional-payment-details[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[2]/label[1]/span[2]");
	private By Validate = By.xpath("//button[contains(text(),'Validate')]");
	private By ValidateMsg = By.xpath("//p[contains(text(),'Bank details have been successfully validated.')]");
	private By ValidateMsgClose = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[4]/div[2]/app-institutional-payment-details[1]/app-notification[1]/div[1]/div[1]/div[1]/button[1]");
	private By TransferDetails = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[5]/div[1]/h2[1]/button[1]/h1[1]");
	private By NewFundName = By.xpath("//input[@id='newFundName']");
	private By FinancialAdviserName = By.xpath("//input[@id='financialAdvisor']");
	private By PhoneNumber = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[5]/div[2]/app-transfer-details[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
	private By CellNumber = By.xpath("//input[@id='cellNumber']");
	private By EmailAddress1 = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[5]/div[2]/app-transfer-details[1]/div[1]/form[1]/div[1]/div[5]/input[1]");
	private By UserDetails = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[6]/div[1]/h2[1]/button[1]/h1[1]");
	private By UserPhNo = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/div[1]/div[2]/div[6]/div[2]/app-user-details[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]");
	private By Save = By.xpath("//button[contains(text(),'Save')]");
	private By Submit = By.xpath("//button[contains(text(),'Submit')]");
	private By SaveRef = By.xpath("//p[contains(text(),'You have successfully saved your claim REF:')]");
	private By ClaimSavedClose = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/app-notification[1]/div[1]/div[1]/div[1]/button[1]");
	private By Declaration = By.xpath("//h1[contains(text(),'It is hereby confirmed that:')]");
	private By AcceptDeclaration = By.xpath("//label[contains(text(),\"I have read and accepted the Employer's Declaratio\")]");
	private By Proceed = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/app-user-declaration[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[7]/button[1]");
	private By SubmitRef = By.xpath("//p[contains(text(),'You have successfully submitted your claim REF:')]");
	private By ClaimSubmitedClose = By.xpath("//body/app-root[1]/app-institutional-claim-form[1]/app-notification[1]/div[1]/div[1]/div[1]/button[1]");

//2. Constructor of the page class:

	public withdrawalClaimPage(WebDriver driver) {
		this.driver = driver;
	}

// 3. page actions: features(behavior) of the page the form of methods:
	
	public void EnterNameOfEmployerUnderEmploymentDetails(String name) {
		util.ScrolldownByPixel(200);
		driver.findElement(NameOfEmployer).sendKeys(name);
	}
	
	public void ClickMembershipDetails() {
		driver.findElement(MembershipDetails).click();
	}
	
	public void EnterInitialsUnderMembershipDetails(String initials) {
		driver.findElement(Initials).sendKeys(initials);
	}
	
	public void EnterMiddleNameUnderMembershipDetails(String middleName) {
		driver.findElement(MiddleName).sendKeys(middleName);
	}
	
	public void EnterCellNoUnderMembershipDetails(int cellNum) {
		if (driver.findElement(CellNo).getText().isBlank() == true) {
			driver.findElement(CellNo).sendKeys(StringUtils.leftPad(Integer.toString(cellNum), 10, '0'));
		} else {
			System.out.println("Leave Cell Number as it is");
		}
		/*
		 * driver.findElement(CellNo).clear();
		 * driver.findElement(CellNo).sendKeys(StringUtils.leftPad(Integer.toString(
		 * cellNum), 10, '0'));
		 */
		/* StringUtils.leftPad(Integer.toString(phoneNum), 10, '0'); */
	}
	
	public void EnterPhoneNoUnderMembershipDetails(int phoneNum) {
		if (driver.findElement(PhoneNo).getText().isBlank() == true) {
			driver.findElement(PhoneNo).sendKeys(StringUtils.leftPad(Integer.toString(phoneNum), 10, '0'));
		} else {
			System.out.println("Leave Phone Number as it is");
		}
		/*
		 * driver.findElement(PhoneNo).clear();
		 * driver.findElement(PhoneNo).sendKeys(StringUtils.leftPad(Integer.toString(
		 * phoneNum), 10, '0'));
		 */
		/* StringUtils.leftPad(Integer.toString(phoneNum), 10, '0'); */
	}
	
	public void EnterEmailAddressUnderMembershipDetails(String emailAdd) {
		if (driver.findElement(EmailAddress).getText().isBlank() == true) {
			driver.findElement(EmailAddress).sendKeys(emailAdd);
		} else {
			System.out.println("Leave Email Address as it is");
		}
	}
	
	public void SelectCountryOfResidence(String country) {
		WebElement ResidenceCountry = driver.findElement(CountryOfResidenceDropDown);
		util.AccessDropdownByVisibleText(ResidenceCountry, country);
	}
	
	public void ValidateIncomeTaxNumber(int taxNum) {
		driver.findElement(TaxEdit).click();
		util.HardWait(1000);
		driver.findElement(TaxReferenceNumber).click();
		util.HardWait(1000);
		if (driver.findElement(TaxReferenceNumber).getText().isBlank() == true) {
			util.HardWait(1000);
			System.out.println("Tax Reference Number: "+driver.findElement(TaxReferenceNumber).getText());
			driver.findElement(TaxReferenceNumber).clear();
			driver.findElement(TaxReferenceNumber).sendKeys(StringUtils.leftPad(Integer.toString(taxNum), 10, '0'));
		} else {
			driver.findElement(OutsideSpace).click();
			System.out.println("Leave Tax Reference Number as it is");
		}
	}
	
	public void EnterUnitNumber(int unitNo) {
		if (driver.findElement(UnitNo).getText().isBlank() == true) {
			driver.findElement(UnitNo).sendKeys((Integer.toString(unitNo)));
		} else {
			System.out.println("Leave Unit Number as it is");
		}
	}
	
	public void EnterComplexName(String complexName) {
		if (driver.findElement(ComplexName).getText().isBlank() == true) {
			driver.findElement(ComplexName).sendKeys(complexName);
		} else {
			System.out.println("Leave Complex Name as it is");
		}
	}
	
	public void EnterStreetNumber(int streetNo) {
		if (driver.findElement(StreetNo).getText().isBlank() == true) {
			driver.findElement(StreetNo).sendKeys((Integer.toString(streetNo)));
		} else {
			System.out.println("Leave Street Number as it is");
		}
	}
	
	public void EnterStreetOrFarmName(String farmName) {
		if (driver.findElement(FarmName).getText().isBlank() == true) {
			driver.findElement(FarmName).sendKeys(farmName);
		} else {
			System.out.println("Leave Street or Farm Name as it is");
		}
	}
	
	public void EnterSuburbName(String suburbName) {
		if (driver.findElement(Suburb).getText().isBlank() == true) {
			driver.findElement(Suburb).sendKeys(suburbName);
		} else {
			System.out.println("Leave suburb Name as it is");
		}
	}
	
	public void EnterCityOrTownName(String cityName) {
		if (driver.findElement(City).getText().isBlank() == true) {
			driver.findElement(City).sendKeys(cityName);
		} else {
			System.out.println("Leave City Name as it is");
		}
	}
	
	public void EnterPostalCode(int pCode) {
		if (driver.findElement(PostalCode).getText().isBlank() == true) {
			driver.findElement(PostalCode).sendKeys((Integer.toString(pCode)));
		} else {
			System.out.println("Leave Postal Code as it is");
		}
	}
	
	public void EnterCountry(String country) {
		WebElement ResidenceCountry = driver.findElement(Country);
		util.AccessDropdownByVisibleText(ResidenceCountry, country);
	}
	
	public void SelectPostalAddressSameAsAbove() {
		driver.findElement(PostalAddress).click();
	}
	
	public void ValidateTypeOfWithdrawalDetails() {
		driver.findElement(WithdrawalDetails).click();
		util.ScrolldownByPixel(-265);
		util.HardWait(1000);
		driver.findElement(Resignation).click();
		util.HardWait(500);
		driver.findElement(Dismissal).click();
		util.HardWait(500);
		driver.findElement(NonQualifyingRetrenchment).click();
		util.HardWait(500);
		driver.findElement(QualifyingRetrenchment).click();
		util.HardWait(500);
		driver.findElement(Resignation).click();
	}
	
	public void ValidatePaymentInstructions() {
		driver.findElement(KeepYourSavingsWhereTheyAre).click();
		util.HardWait(500);
		driver.findElement(FullTransfer).click();
		util.HardWait(500);
		driver.findElement(PartTransfer).click();
		util.HardWait(500);
		driver.findElement(WithdrawAllMySavings).click();
		util.HardWait(500);
		driver.findElement(NoPayment).click();
		util.HardWait(500);
		driver.findElement(PartTransfer).click();
		util.HardWait(500);
	}
	
	public void EnterAmountToBeWithdrawn(int amount) {
		driver.findElement(AmountToBeWithdrawn).sendKeys(Integer.toString(amount));
	}
	
	public void ChangeIndebtedness() {
		driver.findElement(No).click();
		util.HardWait(500);
		driver.findElement(Yes).click();
		util.HardWait(500);
	}
	
	public void EnterIndebtednessAmount(int amount) {
		driver.findElement(Indebtedness).sendKeys(Integer.toString(amount));
	}
	
	public void ClickOnPaymentDetails() {
		driver.findElement(PaymentDetails).click();
		util.ScrolldownByPixel(-250);
	}
	
	public void EnterAccountHolderName(String accName) {
		if (driver.findElement(AccHolderName).getText().isBlank() == true) {
			driver.findElement(AccHolderName).sendKeys(accName);
		} else {
			System.out.println("Leave AccHolder Name as it is");
		}
	}
	
	public void EnterNameOfTheBank(String bankName) {
		util.HardWait(700);
		if (driver.findElement(NameOfBank).getText().isBlank() == true) {
			driver.findElement(NameOfBank).sendKeys(bankName);
		} else {
			System.out.println("Leave Name Of Bank as it is");
		}
	}
	
	public void EnterAccountNumber(long accNo) {
		if (driver.findElement(AccNo).getText().isBlank() == true) {
			driver.findElement(AccNo).sendKeys(Long.toString(accNo));
		} else {
			System.out.println("Leave account number as it is");
		}
	}
	
	public void EnterBranchCode(int branchCode) {
		util.HardWait(700);
		if (driver.findElement(BranchCode).getText().isBlank() == true) {
			driver.findElement(BranchCode).sendKeys(Integer.toString(branchCode));
		} else {
			System.out.println("Leave Name Of Bank as it is");
		}
	}
	
	public void SelectTypeOfAccount() {
		driver.findElement(Cheque).click();
	}
	
	public String ValidatesPaymentDetails() {
		driver.findElement(Validate).click();
		util.HardWait(9000);
		String msg = driver.findElement(ValidateMsg).getText();
		return msg;
	}
	
	public void CloseThePaymentDetailsValidationMessage() {
		driver.findElement(ValidateMsgClose).click();
	}
	
	public void ClickOnTransferDetails() {
		util.HardWait(1000);
		driver.findElement(TransferDetails).click();
	}
	
	public void EnterNewFundName(String fundName) {
			driver.findElement(NewFundName).sendKeys(fundName);
	}
	
	public void EnterFinancialAdviserName(String adviserName) {
		driver.findElement(FinancialAdviserName).sendKeys(adviserName);
	}
	
	public void EnterPhoneNoUnderTransferDetails(int phoneNum) {
			driver.findElement(PhoneNumber).sendKeys(StringUtils.leftPad(Integer.toString(phoneNum), 10, '0'));
	}
	
	public void EnterCellNoUnderTransferDetails(int cellNum) {
		driver.findElement(CellNumber).sendKeys(StringUtils.leftPad(Integer.toString(cellNum), 10, '0'));
	}
	
	public void EnterEmailAddressUnderTransferDetails(String email) {
		driver.findElement(EmailAddress1).sendKeys(email);
	}
	
	public void ClickOnUserDetails() {
		util.HardWait(1000);
		driver.findElement(UserDetails).click();
	}
	
	public void EnterPhoneNoUnderUserDetails(int phoneNum) {
		driver.findElement(UserPhNo).sendKeys(StringUtils.leftPad(Integer.toString(phoneNum), 10, '0'));
	}
	
	public void UserClickOnSave() {
		driver.findElement(Save).click();
	}
	
	public void UserClickOnSubmit() {
		driver.findElement(Submit).click();
	}
	
	public String GetSavedClaimRefNumber() {
		String msg = driver.findElement(SaveRef).getText();
		System.out.println("Size: "+msg.length());
		String myStr = Character. toString(msg.charAt(44)) 
					 + Character. toString(msg.charAt(45))
					 + Character. toString(msg.charAt(46))
					 + Character. toString(msg.charAt(47))
					 + Character. toString(msg.charAt(48))
					 + Character. toString(msg.charAt(49))
					 + Character. toString(msg.charAt(50));
		System.out.println("Ref No: "+myStr);
		
		return myStr;

		/*
		 * if (msg.length() > 8) { String lastEightDigits = msg.substring(msg.length() -
		 * 8); System.out.println(lastEightDigits); String refNo =
		 * lastEightDigits.substring(0, 7);
		 * System.out.println("Saved Claim Reference Number: "+refNo);
		 * SavedClaimReferenceNumber = refNo; } else { String lastEightDigits = msg;
		 * System.out.println(lastEightDigits); }
		 */
	}
	
	public void CloseSavedClaimPopUp() {
		util.HardWait(1000);
		driver.findElement(ClaimSavedClose).click();
	}
	
	public boolean ValidateTheDisclaimer() {
		util.HardWait(1000);
		return driver.findElement(Declaration).isDisplayed();
	}
	
	public void AcceptTheDisclaimer() {
		driver.findElement(AcceptDeclaration).click();
	}
	
	public void ProceedTheClaim() {
		util.HardWait(500);
		driver.findElement(Proceed).click();
	}
	
	public String GetSubmitedClaimRefNumber() {
		String msg = driver.findElement(SubmitRef).getText();
		System.out.println("Size: "+msg.length());
		String myStr = Character. toString(msg.charAt(48)) 
					 + Character. toString(msg.charAt(49))
					 + Character. toString(msg.charAt(50))
					 + Character. toString(msg.charAt(51))
					 + Character. toString(msg.charAt(52))
					 + Character. toString(msg.charAt(53))
					 + Character. toString(msg.charAt(54));
		System.out.println("Ref No: "+myStr);
		
		return myStr;

		/*
		 * if (msg.length() > 8) { String lastEightDigits = msg.substring(msg.length() -
		 * 8); System.out.println(lastEightDigits); String refNo =
		 * lastEightDigits.substring(0, 7);
		 * System.out.println("Saved Claim Reference Number: "+refNo);
		 * SavedClaimReferenceNumber = refNo; } else { String lastEightDigits = msg;
		 * System.out.println(lastEightDigits); }
		 */
	}
	
	public void CloseClaimSubmissionPopUp() {
		util.HardWait(1000);
		driver.findElement(ClaimSubmitedClose).click();
	}
}
