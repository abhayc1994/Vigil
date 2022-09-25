@OnBoarding @Web @Regression
Feature: Onboarding sa


  Background: User Has Logged into OnBoarding With Valid Credentials
    Given user logged into Onboarding

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0001
  Scenario Outline: REG_ONBRD_1225_TC_0001
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account
    @Regres
    Examples:
      | productLine | custType   |
      | DEPOSIT     | Commercial |
      | LOAN        | Commercial |
      | LOAN        | Consumer   |
      | DEPOSIT     | Consumer   |

  @OnBoardingApi @Regression
  Scenario Outline: Product Types s
    When user sends request for get Product types
    Then type of Product should be Returned according to the Query Params productLine as '<productLine>'  and custType as '<custType>'
    @Regres
    Examples:
      | productLine | custType   |
      | DEPOSIT     | Commercial |
      | LOAN        | Commercial |
      | LOAN        | Consumer   |
      | DEPOSIT     | Consumer   |
