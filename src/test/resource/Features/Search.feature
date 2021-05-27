Feature: Save and Submit the claims with tracking


  @SmokeTest
Scenario: Search by DOB test


Given User is already on login page
And user enter "alexforbes\HybridActom"
And user enters "Password@01"
And user clicks login button
And user clicks on claims
And user selects Withdrawal
Then user search by "1990-01-01"
Then user clicks search button


  @SmokeTest
Scenario Outline: 


Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
And user clicks on claims
And user selects Withdrawal
Then user search by Product Name"<Product Name>"
Then user clicks search button

Examples: 
         | username | password |    Product Name     |
         | alexforbes\WHCountryClub | Password@01| WHC |
         | alexforbes\AFRFProv2 | Password@01| Capitec  |
         | alexforbes\HybridABB | Password@01| ABB  |
         | alexforbes\HybridActom | Password@01| ACTOM  |
         | alexforbes\NonHBSmollan | Password@01| Smollan  |
         | alexforbes\HybridMTN | Password@01| MTN  |

         
@SmokeTest
Scenario Outline: Search Surname

Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
  And user clicks on claims
  And user selects Withdrawal
Then user searches by Surname"<Surname>"
Then user clicks search button

Examples: 
         | username | password |  Surname   |
         | alexforbes\AFRFProv3 | Password@01|  Smith    |
         | alexforbes\AFRFPen1  | Password@01|  Lekoloane |



@SmokeTest
Scenario Outline: Name

Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
  And user clicks on claims
  And user selects Withdrawal
  Then user search by Product Name"<Product Name>"
Then user clicks search button

Examples: 
         | username | password |  Product Name   |
         | alexforbes\AFRFPen2 | Password@01|  Eaton   |
         | alexforbes\AFRFPen3 | Password@01|  Truworths |
         
         
         
@SmokeTest
Scenario Outline: SAID

Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
  And user clicks on claims
  And user selects Withdrawal
  Then user search by Product Name"<Product Name>"
Then user clicks search button

Examples: 
         | username         | password |      Product Name      |
         | alexforbes\AccessPen1 | Password@01|  Accounting  |
         | alexforbes\SwakopmundHotel | Password@01|  ZAFLCOUNT  |
         | alexforbes\Sasol | Password@01|  Sasol  |
         | alexforbes\Retail | Password@01|  Retail  |
         
         
         
 @SmokeTest
Scenario Outline: 


Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
   And user clicks on claims
   And user selects Withdrawal
And user Selects Active Membership
   Then user search by Product Name"<Product Name>"
Then user clicks search button

Examples: 
         | username | password |    Product Name     |
         | alexforbes\AccessProv1 | Password@01| Capitec |
         | alexforbes\CorePen  | Password@01| AIDC |
         
         


     

@SmokeTest
Scenario Outline: Search for Product Name 


Given User is already on login page
And user enter "<username>"
And user enters "<password>"
And user clicks login button
  And user clicks on claims
  And user selects Withdrawal
#Then user search by "<DOB>"
Then user search by Product Name"<Product Name>"
Then user clicks search button

Examples: 
         | username            | password |    DOB       |         Product Name   |
         | alexforbes\CoreProv | Password@01| 1995-01-02 |   Abagold Limited      |
         | alexforbes\HybridABB | Password@01| 1980-01-01 |     ABB     |



  @Test
  Scenario: Save the claim with tracking

  Given User is already on login page
  And user enter username "alexforbes\NonHBSmollan"
  And user enters password "Password@01"
  And user clicks login button
  And user clicks on Retirement, Death ans Withdrwal claims
#  And user selects Withdrawal
  Then user search by Product Name "Smollan"
  Then user clicks search button
  Then user clicks dropdown to display 250 records
  Then user selects member for withdrawal
  Then user complete the Employment Details
  Then user complete the Membership Details
  Then user complete the Physical Address in the Membership Details
  Then user select postal address same as above in the Membership Details
  Then user complete the Withrawal Details
  Then user complete the Payment Details
  Then user validates the Payment Details
  Then user complete the Transfer Details
  Then user complete the User Details
  Then user click on Save the claim
  Then save the saved claim refence number
  Then user close the saved claim popup
  Then user click on claims tracking
  Then user enter the saved claim number
  Then user select the claim status "Saved"
  Then user click on search
  Then user validate the saved claim number with search results
  
   @Test
  Scenario: Submit the claim with tracking

  Given User is already on login page
  And user enter username "alexforbes\NonHBSmollan"
  And user enters password "Password@01"
  And user clicks login button
  And user clicks on Retirement, Death ans Withdrwal claims
#  And user selects Withdrawal
  Then user search by Product Name "Smollan"
  Then user clicks search button
  Then user clicks dropdown to display 250 records
  Then user selects member for withdrawal
  Then user complete the Employment Details
  Then user complete the Membership Details
  Then user complete the Physical Address in the Membership Details
  Then user select postal address same as above in the Membership Details
  Then user complete the Withrawal Details
  Then user complete the Payment Details
  Then user validates the Payment Details
  Then user complete the Transfer Details
  Then user complete the User Details
  Then user click on Submit the claim
  Then user read the Declaration and accept it
  Then user proceed the claim
  Then save the submitted claim refence number
  Then user close claim submission popup
  Then user click on claims tracking
  Then user enter the submitted claim number
  Then user select the claim status "Submitted"
  Then user click on search
  Then user validate the submitted claim number with search results