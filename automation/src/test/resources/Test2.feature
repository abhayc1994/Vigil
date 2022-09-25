@PolymerDeposits @Web @Regression
Feature: Polymer Deposits


  Background: Load User Data
    Given User Test Data is loaded

  @Smoke @Tc_001
  Scenario: Tc_001
    Given User is on DOA HomePage
    When User selects service type as 'Personal'
    And Product as 'Certificate of Deposit','3 Month CD'
    Then On Clicking OpenNow User should be Navigated to Basic InformationPage
    When User fills all Basic Information and clicks Next
      | incomeRange | politicallyExposedPerson | businessOrCommercialPurpose |
      | $100,000+   | No                       | No                          |
    Then Certificate of Deposit Page should be displayed
    When User fills Details for COD Page and click Next
      | frequency | method       |
      | Monthly   | Posted to CD |
    Then Agreements Page Should be loaded
    When User Submits the Application
    Then User should be able to Resume Application in Onboarding
    And Complete the Consumer Deposit Task

  @Deposit @Products
  Scenario Outline: Products
    When user sends request for get Products
    Then type of Product should be Returned according to the Query Params custType as '<custType>'

    Examples:
      | custType   |
      | Commercial |
      | Consumer   |