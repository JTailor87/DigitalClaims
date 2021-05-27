Feature:Claim

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