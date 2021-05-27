package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.testng.Assert;

import Factory.driverFactory;
import Pages.claimsTrackingPage;
import Pages.homePage;
import Pages.loginPage;
import Pages.withdrawalClaimPage;
import Util.elementUtil;
import io.cucumber.java.en.And;

public class submitClaimStepDef {
	private elementUtil util = new elementUtil(driverFactory.getDriver());
	private loginPage LoginPage = new loginPage(driverFactory.getDriver());
	private homePage HomePage = new homePage(driverFactory.getDriver());
	private withdrawalClaimPage WithdrawalClaimPage = new withdrawalClaimPage(driverFactory.getDriver());
	private claimsTrackingPage ClaimsTrackingPage = new claimsTrackingPage(driverFactory.getDriver());
	private String submittedClaimNo;
	
@Given("User is already on login page")
public void user_is_already_on_login_page() {
	LoginPage.OpenApplicationUrl();
}

@And("user enter username {string}")
public void user_enter_username(String username) {
	LoginPage.EnterUsernameandPassword(username);
}

@And("user enters password {string}")
public void user_enters_password(String password) {
	LoginPage.EnterPassword(password);
}

@And("user clicks login button")
public void user_clicks_login_button() {
	LoginPage.ClickOnLoginButton();
}

@Given("user clicks on Retirement, Death ans Withdrwal claims")
public void user_clicks_on_retirement_death_ans_withdrwal_claims() {
	HomePage.ClickOnClaims();
}

@And("user selects Withdrawal")
public void user_selects_withdrawal() {
	HomePage.SelectWithdrawal();
}

@Then("user search by Product Name {string}")
public void user_search_by_product_name(String productName) {
	HomePage.SearchByProductName(productName);
}

@Then("user clicks search button")
public void user_clicks_search_button() {
	HomePage.ClickOnSearch();
}

@Then("user clicks dropdown to display {int} records")
public void user_clicks_dropdown_to_display_records(Integer int1) {
	HomePage.ClickOnItemsPerPageDropDown();
	HomePage.SelectMaximiumNoOfRecords();
}

@Then("user selects member for withdrawal")
public void user_selects_member_for_withdrawal() {
	HomePage.SelectRadomRecord();
}

@Then("user complete the Employment Details")
public void user_complete_the_employment_details() {
	WithdrawalClaimPage.EnterNameOfEmployerUnderEmploymentDetails("Alexander Forbes");
}

@Then("user complete the Membership Details")
public void user_complete_the_membership_details() {
	WithdrawalClaimPage.ClickMembershipDetails();
	WithdrawalClaimPage.EnterInitialsUnderMembershipDetails("ABC");
	WithdrawalClaimPage.EnterMiddleNameUnderMembershipDetails("XYZ");
	int number1 = 724569632;
	WithdrawalClaimPage.EnterCellNoUnderMembershipDetails(number1);
	int number2 = 114579812;
	WithdrawalClaimPage.EnterPhoneNoUnderMembershipDetails(number2);
	WithdrawalClaimPage.EnterEmailAddressUnderMembershipDetails("abc.xyz@gmail.com");
	WithdrawalClaimPage.SelectCountryOfResidence("South Africa");
	//int number3 = 194474185;
	//WithdrawalClaimPage.ValidateIncomeTaxNumber(number3);
}

@Then("user complete the Physical Address in the Membership Details")
public void user_complete_the_physical_address_in_the_membership_details() {
	util.ScrolldownByPixel(500);
	int num1 = 50;
	WithdrawalClaimPage.EnterUnitNumber(num1);
	WithdrawalClaimPage.EnterComplexName("Alpine Heath");
	int num2 = 119;
	WithdrawalClaimPage.EnterStreetNumber(num2);
	WithdrawalClaimPage.EnterStreetOrFarmName("Alpine Heath Resort");
	WithdrawalClaimPage.EnterSuburbName("Northern Drakensberg");
	WithdrawalClaimPage.EnterCityOrTownName("Drakensberg");
	int num3 = 3354;
	WithdrawalClaimPage.EnterPostalCode(num3);
	WithdrawalClaimPage.EnterCountry("South Africa");
}

@Then("user select postal address same as above in the Membership Details")
public void user_select_postal_address_same_as_above_in_the_membership_details() {
	WithdrawalClaimPage.SelectPostalAddressSameAsAbove();
}

@Then("user complete the Withrawal Details")
public void user_complete_the_withrawal_details() {
	WithdrawalClaimPage.ValidateTypeOfWithdrawalDetails();
	WithdrawalClaimPage.ValidatePaymentInstructions();
	int num1 = 50000;
	WithdrawalClaimPage.EnterAmountToBeWithdrawn(num1);
	WithdrawalClaimPage.ChangeIndebtedness();
	int num2 = 10000;
	WithdrawalClaimPage.EnterIndebtednessAmount(num2);
}

@Then("user complete the Payment Details")
public void user_complete_the_payment_details() {
	WithdrawalClaimPage.ClickOnPaymentDetails();
	WithdrawalClaimPage.EnterAccountHolderName("Mo Jhtem");
	WithdrawalClaimPage.EnterNameOfTheBank("ABSA");
	try {
		Thread.sleep(700);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	int num1 = 910;
	int num2 = 34;
	int num3 = 80091;
	WithdrawalClaimPage.EnterAccountNumber(num1);
	WithdrawalClaimPage.EnterAccountNumber(num2);
	WithdrawalClaimPage.EnterAccountNumber(num3);
	int num4 = 632005;
	WithdrawalClaimPage.EnterBranchCode(num4);
	WithdrawalClaimPage.SelectTypeOfAccount();
}

@Then("user validates the Payment Details")
public void user_validates_the_payment_details() {
	Assert.assertEquals(WithdrawalClaimPage.ValidatesPaymentDetails(), "Bank details have been successfully validated.", "Validation message is not matching");
	WithdrawalClaimPage.CloseThePaymentDetailsValidationMessage();
}

@Then("user complete the Transfer Details")
public void user_complete_the_transfer_details() {
	WithdrawalClaimPage.ClickOnTransferDetails();
	WithdrawalClaimPage.EnterNewFundName("COVID-19");
	WithdrawalClaimPage.EnterFinancialAdviserName("Sonia Rodrigues");
	int number1 = 724569632;
	WithdrawalClaimPage.EnterCellNoUnderTransferDetails(number1);
	int number2 = 114579812;
	WithdrawalClaimPage.EnterPhoneNoUnderTransferDetails(number2);
	WithdrawalClaimPage.EnterEmailAddressUnderTransferDetails("jigar.7195@gmail.com");
}


@Then("user complete the User Details")
public void user_complete_the_user_details() {
	WithdrawalClaimPage.ClickOnUserDetails();
	int number1 = 114579812;
	WithdrawalClaimPage.EnterPhoneNoUnderUserDetails(number1);
}

@Then("user click on Submit the claim")
public void user_click_on_submit_the_claim() {
	WithdrawalClaimPage.UserClickOnSubmit();
}

@Then("user read the Declaration and accept it")
public void user_read_the_declaration_and_accept_it() {
	Assert.assertEquals(WithdrawalClaimPage.ValidateTheDisclaimer(), true, "Declaration is not displayed");
	WithdrawalClaimPage.AcceptTheDisclaimer();
}

@Then("user proceed the claim")
public void user_proceed_the_claim() {
	WithdrawalClaimPage.ProceedTheClaim();
}

@Then("save the submitted claim refence number")
public void save_the_submitted_claim_refence_number() {
	submittedClaimNo = WithdrawalClaimPage.GetSubmitedClaimRefNumber();
}

@Then("user close claim submission popup")
public void user_close_claim_submission_popup() {
	WithdrawalClaimPage.CloseClaimSubmissionPopUp();
}

@Then("user enter the submitted claim number")
public void user_enter_the_submitted_claim_number() {
	ClaimsTrackingPage.EnterClaimsNumber(submittedClaimNo);
}

@Then("user validate the submitted claim number with search results")
public void user_validate_the_submitted_claim_number_with_search_results() {
	Assert.assertEquals(ClaimsTrackingPage.ValidateSavedClaimNumber(), submittedClaimNo, "Submitted Claim Numbers are not matching");
}
}
