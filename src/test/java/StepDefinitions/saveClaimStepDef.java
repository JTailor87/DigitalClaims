package StepDefinitions;

import io.cucumber.java.en.Then;

import org.testng.Assert;

import Factory.driverFactory;
import Pages.claimsTrackingPage;
import Pages.withdrawalClaimPage;

public class saveClaimStepDef {
	private withdrawalClaimPage WithdrawalClaimPage = new withdrawalClaimPage(driverFactory.getDriver());
	private claimsTrackingPage ClaimsTrackingPage = new claimsTrackingPage(driverFactory.getDriver());
	private String savedClaimNo;
	private String submitedClaimNo;
	
@Then("user click on Save the claim")
public void user_click_on_save_the_claim() {
	WithdrawalClaimPage.UserClickOnSave();
}

@Then("save the saved claim refence number")
public void save_the_saved_claim_refence_number() {
	savedClaimNo = WithdrawalClaimPage.GetSavedClaimRefNumber();
}

@Then("user close the saved claim popup")
public void user_close_the_saved_claim_popup() {
	WithdrawalClaimPage.CloseSavedClaimPopUp();
}

@Then("user click on claims tracking")
public void user_click_on_claims_tracking() {
	ClaimsTrackingPage.ClickOnClaimsTracking();
}

@Then("user enter the saved claim number")
public void user_enter_the_saved_claim_number() {
	ClaimsTrackingPage.EnterClaimsNumber(savedClaimNo);
}

@Then("user select the claim status {string}")
public void user_select_the_claim_status(String status) {
	ClaimsTrackingPage.SlectClaimStatusSaved(status);
}

@Then("user click on search")
public void user_click_on_search() {
	ClaimsTrackingPage.ClickOnSearch();
}

@Then("user validate the saved claim number with search results")
public void user_validate_the_saved_claim_number_with_search_results() {
	Assert.assertEquals(ClaimsTrackingPage.ValidateSavedClaimNumber(), savedClaimNo, "Saved Claim Numbers are not matching");
}
}
