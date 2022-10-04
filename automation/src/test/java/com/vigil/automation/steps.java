package com.vigil.automation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.Assert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
public class Steps {
   @Then("Select a record from the list")
   public void select_a_record_from_the_list() {
   }
   @Then("Click on edit and verify the fields")
   public void click_on_edit_and_verify_the_fields() {
   }
   @Then("Click on Mass NOA and enter debtor details and save")
   public void click_on_mass_noa_and_enter_debtor_details_and_save() {
   }
   @Then("Click on Quick NOA and enter debtor details and save")
   public void click_on_quick_noa_and_enter_debtor_details_and_save() {
    Assert.assertTrue(false);
   }
   @Then("Click on Release NOA and enter debtor details and save")
   public void click_on_release_noa_and_enter_debtor_details_and_save() {
      Assert.assertTrue(false);
   }

   @Given("user logged into Onboarding")
   public void user_logged_into_onboarding() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("Yoyo yo brother")
   public void yoyo_yo_brother() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Given("User is Starting to create a Product")
   public void user_is_starting_to_create_a_product() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @When("user creates a Deposit product with specfications and Clicks create")
   public void user_creates_a_deposit_product_with_specfications_and_clicks_create(
	   io.cucumber.datatable.DataTable dataTable) {
	  // Write code here that turns the phrase above into concrete actions
	  // For automatic transformation, change DataTable to one of
	  // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	  // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	  // Double, Byte, Short, Long, BigInteger or BigDecimal.
	  //
	  // For other transformations you can register a DataTableType.
   }

   @When("Fills the Details for the Individual Information")
   public void fills_the_details_for_the_individual_information() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("Product should be added in OnBoarding results Table")
   public void product_should_be_added_in_on_boarding_results_table() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("User should be able to Complete Verifications and Create account")
   public void user_should_be_able_to_complete_verifications_and_create_account() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @When("user sends request for get Product types")
   public void user_sends_request_for_get_product_types() {

   }

   @Then("type of Product should be Returned according to the Query Params productLine as "
       + "{string}  and custType as {string}")
   public void type_of_product_should_be_returned_according_to_the_query_params_product_line_as_and_cust_type_as(
	   String string, String string2) {

   }

   @Given("user logged into Survey")
   public void user_logged_into_survey() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("Yoyo yo Survey")
   public void yoyo_yo_survey() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("Product should be Survey in OnBoarding results Table")
   public void product_should_be_survey_in_on_boarding_results_table() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @When("user sends Survey Product types")
   public void user_sends_survey_product_types() {
	  // Write code here that turns the phrase above into concrete actions
   }

   @Then("user do dance")
   public void userDoDance() {
      Assert.assertTrue(false);
   }


   @Given("Setup Request Endpoint for {string}")
   public void setup_request_endpoint_for(String string, io.cucumber.datatable.DataTable dataTable) {


   }

   @Given("Setup Request Specification for {string} Request and base URI for {string}")
   public void setup_request_specification_for_request_and_base_uri_for(String string, String string2) {

   }
   @Given("user logged into Edge application")
   public void user_logged_into_edge_application() {

   }
   @When("User is logged in to Edge application and at HomePage")
   public void user_is_logged_in_to_edge_application_and_at_home_page() {

   }
   @Then("Click on AR menu and {string} and click on {string} sub menu")
   public void click_on_ar_menu_and_and_click_on_sub_menu(String string, String string2) {

   }
   @Then("verify all the option from NOA clients page")
   public void verify_all_the_option_from_noa_clients_page() {

   }

   @And("Users adds the Headers Parameters for {string}")
   public void usersAddsTheHeadersParametersFor(String arg0) {
   }

   @And("Load Test Data File {string}")
   public void loadTestDataFile(String arg0) {
   }

   @Given("User Loads data for Test Case {string} and test data {string}")
   public void userLoadsDataForTestCaseAndTestData(String arg0, String arg1) {
   }

   @And("User sends a {string} Request")
   public void userSendsARequest(String arg0) {
   }

   @Then("Status code and Line of Response should match {string} and {string}")
   public void statusCodeAndLineOfResponseShouldMatchAnd(String arg0, String arg1) {
   }

   @And("The Schema of Response JSON should match the Expected Schema from {string}")
   public void theSchemaOfResponseJSONShouldMatchTheExpectedSchemaFrom(String arg0) {
   }

   @Given("User changes the path param {string}")
   public void userChangesThePathParam(String arg0) {
   }

   @When("User changes the query param {string}")
   public void userChangesTheQueryParam(String arg0) {
   }

   @When("user changes the {string} header")
   public void userChangesTheHeader(String arg0) {
   }

   @And("I remove the query param {string}")
   public void iRemoveTheQueryParam(String arg0) {
   }

   @And("I validate the {string} value in response body is same as expected value {string}")
   public void iValidateThe$Card_numberValueInResponseBodyIsSameAsExpectedValue(String arg0) {
   }

   @Given("loed Application")
   public void user_logged_into_e_bank() {
   }


   @When("User is Logged in and All options are Displayed")
   public void userIsLoggedInAndAllOptionsAreDisplayed() {
   }

   @Then("Below Tabs should be available to the user")
   public void belowTabsShouldBeAvailableToTheUser() {
   }

   @Then("Below Accounting Tab should be Journal Entry Tab")
   public void belowAccountingTabShouldBeJournalEntryTab() {
   }

   @And("Below Journal Entry Tab Should be below Options")
   public void belowJournalEntryTabShouldBeBelowOptions() {
   }

   @When("User navigates to Access Groups")
   public void userNavigatesToAccessGroups() {
   }

   @Then("Access Groups Page should have below Options")
   public void accessGroupsPageShouldHaveBelowOptions() {
   }

   @When("User navigates to Acess Group and create a new Access Group")
   public void userNavigatesToAcessGroupAndCreateANewAccessGroup(DataTable dataTable) {
   Assert.assertTrue(false);
   }

   @Then("Access group should be created Successfully")
   public void accessGroupShouldBeCreatedSuccessfully() {
   }

   @And("user should be able to edit search download and remove actions Successfully")
   public void userShouldBeAbleToEditSearchDownloadAndRemoveActionsSuccessfully() {
   }

   @When("User navigates to Journal Batch")
   public void userNavigatesToJournalBatch() {
   }

   @Then("On Journal Batch screen search create edit remove addsearchcondtion and excel options "
       + "should be displayed")
   public void onJournalBatchScreenSearchCreateEditRemoveAddsearchcondtionAndExcelOptionsShouldBeDisplayed() {
   }

   @Then("Click on create button and Verify options from create new batch page")
   public void clickOnCreateButtonAndVerifyOptionsFromCreateNewBatchPage() {
   }

   @Then("Click on Add button to add template details")
   public void clickOnAddButtonToAddTemplateDetails() {
   }

   @Then("Enter Account number as {string} in to debit Account field")
   public void enterAccountNumberAsInToDebitAccountField(String arg0) {
   }

   @Then("Enter Selector as {string} in to debit selector field")
   public void enterSelectorAsInToDebitSelectorField(String arg0) {
   }

   @Then("Enter Amount as {string} in to debit amount field")
   public void enterAmountAsInToDebitAmountField(String arg0) {
   }

   @Then("Enter Description as {string} in to debit description field")
   public void enterDescriptionAsInToDebitDescriptionField(String arg0) {
   }

   @Then("Enter Account number as {string} in to credit Account field")
   public void enterAccountNumberAsInToCreditAccountField(String arg0) {
   }

   @Then("Enter Selector as {string} in to credit selector field")
   public void enterSelectorAsInToCreditSelectorField(String arg0) {
   }

   @Then("Enter Amount as {string} in to credit amount field")
   public void enterAmountAsInToCreditAmountField(String arg0) {
   }

   @Then("Enter Description as {string} in to credit description field")
   public void enterDescriptionAsInToCreditDescriptionField(String arg0) {
   }

   @Then("Click on Create template button")
   public void clickOnCreateTemplateButton() {
   }

   @Then("Enter {string} in to template name field")
   public void enterInToTemplateNameField(String arg0) {
   }

   @Then("Enter {string} in to description field")
   public void enterInToDescriptionField(String arg0) {
   }

   @Then("Click on OK button to create template")
   public void clickOnOKButtonToCreateTemplate() {
   }

   @Then("Click on submit button")
   public void clickOnSubmitButton() {
   }

   @Then("Select and edit record Enter new amount {string} values and click on submit button")
   public void selectAndEditRecordEnterNewAmountValuesAndClickOnSubmitButton(String arg0) {
   }

   @Then("Select template and click on remove and remove template")
   public void selectTemplateAndClickOnRemoveAndRemoveTemplate() {
   }

   @Then("Perform search and validate results with {string} user {string}")
   public void performSearchAndValidateResultsWithUser(String arg0, String arg1) {
   }

   @When("User navigates to Template Management")
   public void userNavigatesToTemplateManagement() {
   }

   @Then("On Template Management screen create edit remove Excel search and addsearchcondtion "
       + "options should be displayed")
   public void onTemplateManagementScreenCreateEditRemoveExcelSearchAndAddsearchcondtionOptionsShouldBeDisplayed() {
   }

   @Then("Click on create button to verify options from Journal template page")
   public void clickOnCreateButtonToVerifyOptionsFromJournalTemplatePage() {
   }

   @Then("Enter {string} in to description field in tamplate management page")
   public void enterInToDescriptionFieldInTamplateManagementPage(String arg0) {
   }

   @Then("Select and edit record Enter new description {string} values and click on submit button")
   public void selectAndEditRecordEnterNewDescriptionValuesAndClickOnSubmitButton(String arg0) {
   }

   @When("User navigates to Batch Transaction History")
   public void userNavigatesToBatchTransactionHistory() {
   }

   @Then("On Batch Transaction page bel should be displayed")
   public void onBatchTransactionPageBelShouldBeDisplayed() {
   }

   @Then("User should be able to Download Excel Data and perform search")
   public void userShouldBeAbleToDownloadExcelDataAndPerformSearch() {
   }

   @When("User Expands Maintenance Option")
   public void userExpandsMaintenanceOption() {
   }

   @Then("In Maintenance tab below options should be displayed")
   public void inMaintenanceTabBelowOptionsShouldBeDisplayed() {
   }

   @When("User Navigates to Interest Rates Page")
   public void userNavigatesToInterestRatesPage() {
   }

   @Then("Interest Rates Page should have below options")
   public void interestRatesPageShouldHaveBelowOptions() {
   }

   @When("User create a Interest with Active Status")
   public void userCreateAInterestWithActiveStatus() {
   }

   @Then("Active Status not allowed Warning should be Displayed")
   public void activeStatusNotAllowedWarningShouldBeDisplayed() {
   }

   @When("user changes Status to Pending")
   public void userChangesStatusToPending() {
   }

   @Then("Interest should be saved")
   public void interestShouldBeSaved() {
   }

   @When("user changes status to Active After Saving")
   public void userChangesStatusToActiveAfterSaving() {
   }

   @Then("Same user cannot change Status warning Should be Displayed")
   public void sameUserCannotChangeStatusWarningShouldBeDisplayed() {
   }

   @When("users update any Interest data")
   public void usersUpdateAnyInterestData() {
   }

   @Then("changes should be updated")
   public void changesShouldBeUpdated() {
   }

   @And("user should be able to seach for the Interest Rate")
   public void userShouldBeAbleToSeachForTheInterestRate() {
   }

   @When("user logsin with Other User and changes Status to Active")
   public void userLogsinWithOtherUserAndChangesStatusToActive() {
   }

   @Then("Product should be saved with Active Status")
   public void productShouldBeSavedWithActiveStatus() {
   }

   @When("User Expands Administration Tab")
   public void userExpandsAdministrationTab() {
   }

   @Then("Administration Tab should have below options")
   public void administrationTabShouldHaveBelowOptions() {
   }

   @When("User Navigates to Scheduled Tasks")
   public void userNavigatesToScheduledTasks() {
   }

   @Then("Scheduled tasks Page should have below options")
   public void scheduledTasksPageShouldHaveBelowOptions() {
   }

   @Then("Click on Create button and verify all options from page")
   public void clickOnCreateButtonAndVerifyAllOptionsFromPage() {
   }

   @Then("Fill all the data {string} and user {string} and corn {string} and des {string} create "
       + "schedule task")
   public void fillAllTheDataAndUserAndCornAndDesCreateScheduleTask(String arg0, String arg1,
       String arg2, String arg3) {
   }

   @Then("Click on edit and update {string} description field value")
   public void clickOnEditAndUpdateDescriptionFieldValue(String arg0) {
   }

   @Then("Perform search and validate results with {string} user {string} in schedule task page")
   public void performSearchAndValidateResultsWithUserInScheduleTaskPage(String arg0, String arg1) {
   }

   @Then("Verify execution hostory of created task")
   public void verifyExecutionHostoryOfCreatedTask() {
   }

   @When("User Navigates to Users Page")
   public void userNavigatesToUsersPage() {
   }

   @Then("Verify all the options from users page")
   public void verifyAllTheOptionsFromUsersPage() {
   }

   @Then("User Navigates to Server Log page")
   public void userNavigatesToServerLogPage() {
   }

   @Then("Verify all the options from Server Log Page")
   public void verifyAllTheOptionsFromServerLogPage() {
   }

   @Then("Toggle between the View and Options Fields")
   public void toggleBetweenTheViewAndOptionsFields() {
   }

   @Then("Go to Options and verify options from page")
   public void goToOptionsAndVerifyOptionsFromPage() {
   }

   @Then("Go to View and verify options from page")
   public void goToViewAndVerifyOptionsFromPage() {
   }

   @Then("Download log file by selecting fromat {string}")
   public void downloadLogFileBySelectingFromat(String arg0) {
   }

   @When("User Navigates to Reports page")
   public void userNavigatesToReportsPage() {
   }

   @When("User Navigates to report groups page")
   public void userNavigatesToReportGroupsPage() {
   }

   @When("User Navigates to runreports page")
   public void userNavigatesToRunreportsPage() {
   }

   @When("User Navigates to show charts page")
   public void userNavigatesToShowChartsPage() {
   }

   @When("User Navigates to show tables page")
   public void userNavigatesToShowTablesPage() {
   }

   @When("User Navigates to show pivot tables page")
   public void userNavigatesToShowPivotTablesPage() {
   }

   @Then("BPM Option should have below Options and User should be able to navigate to All "
       + "Suboptions page")
   public void bpmOptionShouldHaveBelowOptionsAndUserShouldBeAbleToNavigateToAllSuboptionsPage() {
   }

   @Given("user logged into EPrecision as {string} and {string}")
   public void userLoggedIntoEPrecisionAsAdminAndAdmin() {
   }

   @When("User is logged in to EPrecision and at HomePage")
   public void userIsLoggedInToEPrecisionAndAtHomePage() {
   }

   @Then("on Homepage below options should be available")
   public void onHomepageBelowOptionsShouldBeAvailable() {
   }

   @Given("User is Logged in to EPrecsions")
   public void userIsLoggedInToEPrecsions() {
   }

   @When("User navigates to process Errors")
   public void userNavigatesToProcessErrors() {
   }

   @Then("User should be able to see below  options")
   public void userShouldBeAbleToSeeBelowOptions() {
   }

   @When("User navigates to End of Day Jobs")
   public void userNavigatesToEndOfDayJobs() {
   }

   @Then("User should be able to see All End of Day Jobs options")
   public void userShouldBeAbleToSeeAllEndOfDayJobsOptions() {
   }

   @When("User navigates to End of Day Jobs and Clicks on All End of Day Jobs options")
   public void userNavigatesToEndOfDayJobsAndClicksOnAllEndOfDayJobsOptions() {
   }

   @Then("Relative Message should be displayed to the User")
   public void relativeMessageShouldBeDisplayedToTheUser() {
   }

   @When("User Expands the Precision Tab")
   public void userExpandsThePrecisionTab() {
   }

   @Then("Precision Tab should have below options")
   public void precisionTabShouldHaveBelowOptions() {
   }

   @When("User navigates to Precision")
   public void userNavigatesToPrecision() {
   }

   @Then("User should be able to see All Precision tab options")
   public void userShouldBeAbleToSeeAllPrecisionTabOptions() {
   }

   @When("user navigates to {string} option")
   public void userNavigatesToOption(String arg0) {
   }

   @Then("User should be able to see below  options on CIF Entity Page")
   public void userShouldBeAbleToSeeBelowOptionsOnCIFEntityPage() {
   }

   @Then("user should be able to create Edit  Remove and search for the CIF Entity")
   public void userShouldBeAbleToCreateEditRemoveAndSearchForTheCIFEntity() {
   }

   @When("user navigates to Ping options")
   public void userNavigatesToPingOptions() {
   }

   @And("user clicks on Ping Sonic button")
   public void userClicksOnPingSonicButton() {
   }

   @Then("System up Message Should be Displayed")
   public void systemUpMessageShouldBeDisplayed() {
   }

   @Then("Verify all the options from Account Entity page")
   public void verifyAllTheOptionsFromAccountEntityPage() {
   }

   @Then("Click on create button and Create account entity")
   public void clickOnCreateButtonAndCreateAccountEntity() {
   }

   @Then("Verify all the options from Sec Cust Entity page")
   public void verifyAllTheOptionsFromSecCustEntityPage() {
   }

   @Then("Verify all the options from Atm Entities page")
   public void verifyAllTheOptionsFromAtmEntitiesPage() {
   }

   @Then("Create Atm Entity from atm Entity editor")
   public void createAtmEntityFromAtmEntityEditor() {
   }

   @Then("Edit created Atm Entity and update")
   public void editCreatedAtmEntityAndUpdate() {
   }

   @Then("Remove Atm entity from the list of Atm Entities")
   public void removeAtmEntityFromTheListOfAtmEntities() {
   }

   @When("user expands Maintenance options List")
   public void userExpandsMaintenanceOptionsList() {
   }

   @Then("Verify all the options from maintenance sub options")
   public void verifyAllTheOptionsFromMaintenanceSubOptions() {
   }

   @Then("user Should be able to See Ping Options")
   public void userShouldBeAbleToSeePingOptions() {
   }

   @When("user clicks on Test Account Inquiry button")
   public void userClicksOnTestAccountInquiryButton() {
   }

   @Then("Sonic enquiry Message Should be Displayed")
   public void sonicEnquiryMessageShouldBeDisplayed() {
   }

   @When("user clicks on Test Accurate date button")
   public void userClicksOnTestAccurateDateButton() {
   }

   @Then("Test Accurate Message Should be Displayed")
   public void testAccurateMessageShouldBeDisplayed() {
   }

   @When("user clicks on Direct Query Precision button")
   public void userClicksOnDirectQueryPrecisionButton() {
   }

   @Then("Direct Query Precision Message Should be Displayed")
   public void directQueryPrecisionMessageShouldBeDisplayed() {
   }

   @When("user navigates to maintenance and sub option {string}")
   public void userNavigatesToMaintenanceAndSubOption(String arg0) {
   }

   @Then("Click on create and create new branch editor")
   public void clickOnCreateAndCreateNewBranchEditor() {
   }

   @Then("Click on edit and update branch editor")
   public void clickOnEditAndUpdateBranchEditor() {
   }

   @Then("Click on remove and remove the created branch")
   public void clickOnRemoveAndRemoveTheCreatedBranch() {
   }

   @Then("Perform search and validate results with {string} user {string} in Branch browser page")
   public void performSearchAndValidateResultsWithUserInBranchBrowserPage(String arg0,
       String arg1) {
   }

   @Given("loads users  data")
   public void loadsUsersData() {
   }

   @Given("User is on BasicInfo Page")
   public void userIsOnBasicInfoPage() {
   }

   @When("user create an application with Entity as")
   public void userCreateAnApplicationWithEntityAs(DataTable dataTable) {
   }

   @Then("Application Should be Displayed in OnBoarding After Submission")
   public void applicationShouldBeDisplayedInOnBoardingAfterSubmission() {
   }

   @When("user create an application with Entity as Sole PropReitor")
   public void userCreateAnApplicationWithEntityAsSolePropReitor() {
   }

   @When("user create an application with Entity as and Second Applicant Manually")
   public void userCreateAnApplicationWithEntityAsAndSecondApplicantManually() {
   }

   @When("user create an application with Entity as Sole Propreitor and Second Applicant Manually")
   public void userCreateAnApplicationWithEntityAsSolePropreitorAndSecondApplicantManually() {
   }

   @And("Fills the Details for the Legal Entity")
   public void fillsTheDetailsForTheLegalEntity(DataTable dataTable) {
   }

   @And("User should be able to Complete commercial Verifications and Create account")
   public void userShouldBeAbleToCompleteCommercialVerificationsAndCreateAccount() {
   }

   @And("User should be able to Complete consumer COD Verifications and Create account")
   public void userShouldBeAbleToCompleteConsumerCODVerificationsAndCreateAccount() {
   }

   @And("User should be able to Complete commercial COD Verifications and Create account")
   public void userShouldBeAbleToCompleteCommercialCODVerificationsAndCreateAccount() {
   }

   @And("User should be able to Complete commercial Savings Verifications and Create account")
   public void userShouldBeAbleToCompleteCommercialSavingsVerificationsAndCreateAccount() {
   }

   @When("user creates a Loan product with specifications and Clicks create")
   public void userCreatesALoanProductWithSpecificationsAndClicksCreate(DataTable table) {
   }

   @And("Fills the Details for the Loans Legal Entity")
   public void fillsTheDetailsForTheLoansLegalEntity() {
   }

   @Then("Entity details should be saved")
   public void entityDetailsShouldBeSaved() {
   }

   @When("User fills opportunity ,collateral and Equipment Info and starts Process")
   public void userFillsOpportunityCollateralAndEquipmentInfoAndStartsProcess() {
   }

   @Then("user should be able to Start the Process")
   public void userShouldBeAbleToStartTheProcess() {
   }

   @And("Complete the tasks generated for Small Ticket Loan")
   public void completeTheTasksGeneratedForSmallTicketLoan() {
   }

   @When("user completes the task generated for Large Ticket Loan")
   public void userCompletesTheTaskGeneratedForLargeTicketLoan() {
   }

   @When("user completes the task generated for ABL Loan")
   public void userCompletesTheTaskGeneratedForABLLoan() {
   }

   @And("Fills the Details for the Joint Applicant")
   public void fillsTheDetailsForTheJointApplicant() {
   }

   @And("User should be able to Complete Joint Applicant Verifications and Create account")
   public void userShouldBeAbleToCompleteJointApplicantVerificationsAndCreateAccount() {
   }

   @And("Fills the Details for the Joint Legal Entity")
   public void fillsTheDetailsForTheJointLegalEntity(DataTable table) {
   }

   @When("User fills opportunity ,collateral  and starts Process")
   public void userFillsOpportunityCollateralAndStartsProcess() {
   }

   @When("user completes the task generated for Participation Loan")
   public void userCompletesTheTaskGeneratedForParticipationLoan() {
   }

   @When("user completes the task generated for Rediscount Loan")
   public void userCompletesTheTaskGeneratedForRediscountLoan() {
   }

   @When("user completes the task generated for Small Ticket Factoring Loan")
   public void userCompletesTheTaskGeneratedForSmallTicketFactoringLoan() {
   }

   @When("user adds Indiviudal Info Starts the Loan Process")
   public void userAddsIndiviudalInfoStartsTheLoanProcess() {
   }

   @Then("user completes the task generated for Smart Loan")
   public void userCompletesTheTaskGeneratedForSmartLoan() {
   }

   @And("Fills Individual Info and starts the process")
   public void fillsIndividualInfoAndStartsTheProcess() {
   }

   @Then("User should be Able to Decline the Application from HomePage")
   public void userShouldBeAbleToDeclineTheApplicationFromHomePage() {
   }

   @Then("User should be Able to WithDraw the Application from HomePage")
   public void userShouldBeAbleToWithDrawTheApplicationFromHomePage() {
   }

   @When("user Starts process for Declined Application from HomePage")
   public void userStartsProcessForDeclinedApplicationFromHomePage() {
   }

   @Then("User should be able to complete the Deposit tasks")
   public void userShouldBeAbleToCompleteTheDepositTasks() {
   }

   @When("User navigates to Applications homepage")
   public void userNavigatesToApplicationsHomepage() {
   }

   @Then("User should be Able to WithDraw the Loan Application from HomePage")
   public void userShouldBeAbleToWithDrawTheLoanApplicationFromHomePage() {
   }

   @When("User Declines the Loan Application from HomePage")
   public void userDeclinesTheLoanApplicationFromHomePage() {
   }

   @Then("User should be able to get the Decline Review task generated for Small Ticket Loan")
   public void userShouldBeAbleToGetTheDeclineReviewTaskGeneratedForSmallTicketLoan() {
   }

   @When("User puts the Compile Credit Summary task in Hold State")
   public void userPutsTheCompileCreditSummaryTaskInHoldState() {
   }

   @Then("the State of Compile Credit Summary task should be in Hold")
   public void theStateOfCompileCreditSummaryTaskShouldBeInHold() {
   }

   @And("Complete compile Credit Summary task for the Small Ticket Equipment Loan")
   public void completeCompileCreditSummaryTaskForTheSmallTicketEquipmentLoan() {
   }

   @And("User should be able to Generate letter for the Equipment Loan product")
   public void userShouldBeAbleToGenerateLetterForTheEquipmentLoanProduct() {
   }

   @And("User should be able to Put the Generate letter Task On Hold for the Equipment Loan "
       + "product")
   public void userShouldBeAbleToPutTheGenerateLetterTaskOnHoldForTheEquipmentLoanProduct() {
   }

   @When("User tries to Complete Generate Leter task without Generating Letters")
   public void userTriesToCompleteGenerateLeterTaskWithoutGeneratingLetters() {
   }

   @Then("Error message Should be Displayed")
   public void errorMessageShouldBeDisplayed() {
   }

   @And("Validate Generate Button Function in Legal documents Task for Large Ticket Loan")
   public void validateGenerateButtonFunctionInLegalDocumentsTaskForLargeTicketLoan() {
   }

   @And("User should be able to put SME Funding Task on Hold for Large Ticket Loan")
   public void userShouldBeAbleToPutSMEFundingTaskOnHoldForLargeTicketLoan() {
   }

   @And("user completes the task generated for Large Ticket Factoring Loan")
   public void userCompletesTheTaskGeneratedForLargeTicketFactoringLoan() {
   }

   @And("user should be able to complete Check In Loan Package task for Large Ticket Factoring "
       + "Loan")
   public void userShouldBeAbleToCompleteCheckInLoanPackageTaskForLargeTicketFactoringLoan() {
   }

   @And("user should be able to complete AR Verification task for Large Ticket Factoring Loan")
   public void userShouldBeAbleToCompleteARVerificationTaskForLargeTicketFactoringLoan() {
   }

   @And("user should be able to put On Hold Debtor Credit Review task for Small Ticket Factoring "
       + "Loan")
   public void userShouldBeAbleToPutOnHoldDebtorCreditReviewTaskForSmallTicketFactoringLoan() {
   }

   @And("user should be able to Validate Request Providers Functionlaity in Scoring task for "
       + "Small Ticket Factoring Loan")
   public void userShouldBeAbleToValidateRequestProvidersFunctionlaityInScoringTaskForSmallTicketFactoringLoan() {
   }

   @And("user should be able to Decline  Scoring task for Small Ticket Factoring Loan")
   public void userShouldBeAbleToDeclineScoringTaskForSmallTicketFactoringLoan() {
   }

   @And("user should be able to complete Loan Setup task for Large Ticket Factoring Loan")
   public void userShouldBeAbleToCompleteLoanSetupTaskForLargeTicketFactoringLoan() {
   }

   @And("user should be able to Complete PreFunding Legal Review  task for Small Ticket Factoring"
       + " Loan")
   public void userShouldBeAbleToCompletePreFundingLegalReviewTaskForSmallTicketFactoringLoan() {
   }

   @And("user Should be able to put On Hold Assign Underwriter task generated for ABL Loan")
   public void userShouldBeAbleToPutOnHoldAssignUnderwriterTaskGeneratedForABLLoan() {
   }

   @And("user Should be able to put Check in Loan Package task generated on hold for ABL Loan")
   public void userShouldBeAbleToPutCheckInLoanPackageTaskGeneratedOnHoldForABLLoan() {
   }

   @And("user should be able to Validate Request Providers Functionlaity in Scoring task for ABL "
       + "Loan")
   public void userShouldBeAbleToValidateRequestProvidersFunctionlaityInScoringTaskForABLLoan() {
   }

   @And("user Should be able to put On Hold BackGround Searches UCC Filings task generated for "
       + "ABL Loan")
   public void userShouldBeAbleToPutOnHoldBackGroundSearchesUCCFilingsTaskGeneratedForABLLoan() {
   }

   @And("user Should be able to put On Hold {int} and Tax Guard Report task generated for ABL Loan")
   public void userShouldBeAbleToPutOnHoldAndTaxGuardReportTaskGeneratedForABLLoan(int arg0) {
   }

   @And("user Should be able to Decline Approve task generated for ABL Loan")
   public void userShouldBeAbleToDeclineApproveTaskGeneratedForABLLoan() {
   }

   @Then("User should be able to get the Decline Review task generated for ABL Loan")
   public void userShouldBeAbleToGetTheDeclineReviewTaskGeneratedForABLLoan() {
   }

   @Then("User should be able to get the Decline Review task generated for Smart Loan")
   public void userShouldBeAbleToGetTheDeclineReviewTaskGeneratedForSmartLoan() {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer Money market"
       + " Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerMoneyMarketProduct() {
   }

   @And("User should be able to able to Put on Hold Approve Precise ID Task for Consumer Money "
       + "market Product")
   public void userShouldBeAbleToAbleToPutOnHoldApprovePreciseIDTaskForConsumerMoneyMarketProduct() {
   }

   @And("User should be able to able to Put on Hold Application Verification Task for Consumer "
       + "Money market Product")
   public void userShouldBeAbleToAbleToPutOnHoldApplicationVerificationTaskForConsumerMoneyMarketProduct() {
   }

   @And("User should be able to able to Put on Hold Application Verification Task for Commercial "
       + "Money Market Product")
   public void userShouldBeAbleToAbleToPutOnHoldApplicationVerificationTaskForCommercialMoneyMarketProduct() {
   }

   @And("User should be able to able to Decline Decision Task for Commercial Money Market Product")
   public void userShouldBeAbleToAbleToDeclineDecisionTaskForCommercialMoneyMarketProduct() {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer {int} "
       + "Checking Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerCheckingProduct(
       int arg0) {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer TAB Chrome "
       + "Checking Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerTABChromeCheckingProduct() {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer High Yield "
       + "Checking Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerHighYieldCheckingProduct() {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Saver"
       + " Checking Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerKasasaSaverCheckingProduct() {
   }

   @And("User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Cash "
       + "Product")
   public void userShouldBeAbleToAbleToDeclineApprovePreciseIDTaskForConsumerKasasaCashProduct() {
   }

   @And("User should be able to Decline Decision task for Commercial Business Checking")
   public void userShouldBeAbleToDeclineDecisionTaskForCommercialBusinessChecking() {
   }

   @And("User should be able to Put On hold Decision task for Commercial Business Checking")
   public void userShouldBeAbleToPutOnHoldDecisionTaskForCommercialBusinessChecking() {
   }

   @When("User Puts Decision task on Manager Review for Commercial Business Checking")
   public void userPutsDecisionTaskOnManagerReviewForCommercialBusinessChecking() {
   }

   @Then("Manager Review Task should be generated and user should be able to complete it")
   public void managerReviewTaskShouldBeGeneratedAndUserShouldBeAbleToCompleteIt() {
   }

   @And("User should be able to Decline Decision task for Commercial Business Advantage Prepaid")
   public void userShouldBeAbleToDeclineDecisionTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @When("User Puts Decision task on Manager Review for Commercial Business Advantage Prepaid")
   public void userPutsDecisionTaskOnManagerReviewForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Decline Decision task for Consumer_{int} Month CD")
   public void userShouldBeAbleToDeclineDecisionTaskForConsumer_MonthCD(int arg0) {
   }

   @When("User Puts Decision task on Manager Review for Consumer_{int} Month CD")
   public void userPutsDecisionTaskOnManagerReviewForConsumer_MonthCD(int arg0) {
   }

   @And("User should be able to Decline Decision task for Commercial Business Savings")
   public void userShouldBeAbleToDeclineDecisionTaskForCommercialBusinessSavings() {
   }

   @When("User Puts Decision task on Manager Review for Commercial Business Savings")
   public void userPutsDecisionTaskOnManagerReviewForCommercialBusinessSavings() {
   }

   @And("user should be able to decline Approve One task for Small Ticket Factoring Loan")
   public void userShouldBeAbleToDeclineApproveOneTaskForSmallTicketFactoringLoan() {
   }

   @And("user should be able to decline Scoring task for Large Ticket Factoring Loan")
   public void userShouldBeAbleToDeclineScoringTaskForLargeTicketFactoringLoan() {
   }

   @And("user should be able to Deny Approve task for Large Ticket Factoring Loan")
   public void userShouldBeAbleToDenyApproveTaskForLargeTicketFactoringLoan() {
   }

   @When("user adds Indiviudal and CoBorrower Info Starts the Loan Process")
   public void userAddsIndiviudalAndCoBorrowerInfoStartsTheLoanProcess() {
   }

   @When("User fills opportunity ,Individual,CoBorrower,collateral")
   public void userFillsOpportunityIndividualCoBorrowerCollateral() {
   }

   @When("User fills opportunity ,CoBorrower,collateral and Equipment Info and starts Process")
   public void userFillsOpportunityCoBorrowerCollateralAndEquipmentInfoAndStartsProcess() {
   }

   @When("User Resubmits Precise ID Request for Applicant in Approve  Verification Task")
   public void userResubmitsPreciseIDRequestForApplicantInApproveVerificationTask() {
   }

   @Then("User should be able to reanswer KIQ question and complete the Task")
   public void userShouldBeAbleToReanswerKIQQuestionAndCompleteTheTask() {
   }

   @When("User Application Verification Task and Starts Approve Verification task")
   public void userApplicationVerificationTaskAndStartsApproveVerificationTask() {
   }

   @Then("User should be able to deny Approve Verification task and change Request Task Should be"
       + " Generated")
   public void userShouldBeAbleToDenyApproveVerificationTaskAndChangeRequestTaskShouldBeGenerated() {
   }

   @Then("User should be able to Put On hold Approve Verification task and change Request Task "
       + "Should be Generated")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskAndChangeRequestTaskShouldBeGenerated() {
   }

   @And("User should be able to  Put on Hold Decision task for Commercial Money Market Product")
   public void userShouldBeAbleToPutOnHoldDecisionTaskForCommercialMoneyMarketProduct() {
   }

   @When("User Puts Decision task on Manager Review for Commercial Money Market")
   public void userPutsDecisionTaskOnManagerReviewForCommercialMoneyMarket() {
   }

   @And("User should be able to  Put on Hold Customer Verification QA task for Commercial Money "
       + "Market Product")
   public void userShouldBeAbleToPutOnHoldCustomerVerificationQATaskForCommercialMoneyMarketProduct() {
   }

   @And("User should be able to  Put on Hold Application Verification task for Commercial "
       + "Business Checking")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForCommercialBusinessChecking() {
   }

   @And("User should be able to Put on Hold Customer Verification QA task for Commercial Business"
       + " Checking")
   public void userShouldBeAbleToPutOnHoldCustomerVerificationQATaskForCommercialBusinessChecking() {
   }

   @And("User should be able to Put on Hold CIF Account Creation task for Commercial Business "
       + "Checking")
   public void userShouldBeAbleToPutOnHoldCIFAccountCreationTaskForCommercialBusinessChecking() {
   }

   @And("User should be able to Put on Hold Send Welcome Email task for Commercial Business "
       + "Checking")
   public void userShouldBeAbleToPutOnHoldSendWelcomeEmailTaskForCommercialBusinessChecking() {
   }

   @And("User should be able to Put on Hold Application Verification task for Commercial Business"
       + " Advantage Prepaid")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Put on Customer Verification QA task for Commercial Business "
       + "Advantage Prepaid")
   public void userShouldBeAbleToPutOnCustomerVerificationQATaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Put on Decison task for Commercial Business Advantage Prepaid")
   public void userShouldBeAbleToPutOnDecisonTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Put on Hold CIF Account Creation task for Commercial Business "
       + "Advantage Prepaid")
   public void userShouldBeAbleToPutOnHoldCIFAccountCreationTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Put on Hold Send Welcome Email task for Commercial Business "
       + "Advantage Prepaid")
   public void userShouldBeAbleToPutOnHoldSendWelcomeEmailTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Decline Decision task for Commercial_{int} Month CD")
   public void userShouldBeAbleToDeclineDecisionTaskForCommercial_MonthCD(int arg0) {
   }

   @When("User Puts Decision task on Manager Review for Commercial_{int} Month CD")
   public void userPutsDecisionTaskOnManagerReviewForCommercial_MonthCD(int arg0) {
   }

   @And("User should be able to decline SME Approval task for Small Ticket Loan")
   public void userShouldBeAbleToDeclineSMEApprovalTaskForSmallTicketLoan() {
   }

   @When("user should be able to decline Scoring task for Large Ticket Loan")
   public void userShouldBeAbleToDeclineScoringTaskForLargeTicketLoan() {
   }

   @When("user should be able to decline Approve task for Large Ticket Loan")
   public void userShouldBeAbleToDeclineApproveTaskForLargeTicketLoan() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer {int} Checking Product")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerCheckingProduct(int arg0) {
   }

   @And("User should be able to Put On Hold Approve Verification task for Consumer {int} Checking"
       + " Product")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskForConsumerCheckingProduct(
       int arg0) {
   }

   @And("User should be able to Put On Hold DOA Welcome EMail task for Consumer {int} Checking "
       + "Product")
   public void userShouldBeAbleToPutOnHoldDOAWelcomeEMailTaskForConsumerCheckingProduct(int arg0) {
   }

   @And("User should be able to Put On Hold Application Verification task for Consumer {int} "
       + "Checking Product")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerCheckingProduct(
       int arg0) {
   }

   @And("User should be able to Deny Approve Verification task for Consumer TAB Chrome Checking")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerTABChromeChecking() {
   }

   @And("User should be able to Put on Hold Approve Verification task for Consumer TAB Chrome "
       + "Checking Product")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskForConsumerTABChromeCheckingProduct() {
   }

   @And("User should be able to Put On Hold Application Verification task for Consumer TAB Chrome"
       + " Checking Product")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerTABChromeCheckingProduct() {
   }

   @And("User should be able to Put On Hold Application Verification task for Consumer High Yield"
       + " Checking Product")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerHighYieldCheckingProduct() {
   }

   @And("User should be able to Put On Hold Approve Verification task for Consumer High Yield "
       + "Checking Product")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskForConsumerHighYieldCheckingProduct() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer Kasasa Cash")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerKasasaCash() {
   }

   @And("User should be able to Put on Hold Approve Verification task for Consumer Kasasa Cash")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskForConsumerKasasaCash() {
   }

   @And("User should be able to Put On Hold Application Verification task for Consumer Kasasa "
       + "Cash Product")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerKasasaCashProduct() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer Kasasa Saver Product")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerKasasaSaverProduct() {
   }

   @And("User should be able to Put On Hold Approve Verification task for Consumer Kasasa Saver "
       + "Product")
   public void userShouldBeAbleToPutOnHoldApproveVerificationTaskForConsumerKasasaSaverProduct() {
   }

   @And("User should be able to Put On Hold Application Verification task for Consumer Kasasa "
       + "Saver Product")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerKasasaSaverProduct() {
   }

   @And("User should be able to put on Hold CIF Account Creations task for Commercial Money Market")
   public void userShouldBeAbleToPutOnHoldCIFAccountCreationsTaskForCommercialMoneyMarket() {
   }

   @And("User should be able to put on Hold Send Welcome EMail task for Commercial Money Market")
   public void userShouldBeAbleToPutOnHoldSendWelcomeEMailTaskForCommercialMoneyMarket() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer High Yield Checking "
       + "Product")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerHighYieldCheckingProduct() {
   }

   @And("User should be able to put on Hold Decision task for Commercial Business Advantage "
       + "Prepaid")
   public void userShouldBeAbleToPutOnHoldDecisionTaskForCommercialBusinessAdvantagePrepaid() {
   }

   @And("User should be able to Decline Approve Verification task for Consumer High Yield Savings"
       + " Product")
   public void userShouldBeAbleToDeclineApproveVerificationTaskForConsumerHighYieldSavingsProduct() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer High Yield Savings "
       + "Product")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerHighYieldSavingsProduct() {
   }

   @And("User should be able to Decline Approve Verification task for Consumer Premium Savings "
       + "Product")
   public void userShouldBeAbleToDeclineApproveVerificationTaskForConsumerPremiumSavingsProduct() {
   }

   @And("User should be able to Deny Approve Verification task for Consumer Premium Savings "
       + "Product")
   public void userShouldBeAbleToDenyApproveVerificationTaskForConsumerPremiumSavingsProduct() {
   }

   @And("User should be able to Decline Approve task for Commercial Large Ticket Equipment Loan")
   public void userShouldBeAbleToDeclineApproveTaskForCommercialLargeTicketEquipmentLoan() {
   }

   @And("User should be able to Deny Approve task for Commercial Large Ticket Equipment Loan")
   public void userShouldBeAbleToDenyApproveTaskForCommercialLargeTicketEquipmentLoan() {
   }

   @And("User should be able to Decline Approve One task for Commercial Small Ticket Factoring "
       + "Loan")
   public void userShouldBeAbleToDeclineApproveOneTaskForCommercialSmallTicketFactoringLoan() {
   }

   @And("User should be able to Deny Approve One task for Commercial Small Ticket Factoring Loan")
   public void userShouldBeAbleToDenyApproveOneTaskForCommercialSmallTicketFactoringLoan() {
   }

   @And("Second User should be able to Deny Approve Two task for Commercial Small Ticket "
       + "Factoring Loan")
   public void secondUserShouldBeAbleToDenyApproveTwoTaskForCommercialSmallTicketFactoringLoan() {
   }

   @And("User should be able to put on hold Compile Credit Summary task for Large Ticket "
       + "Factoring Loan")
   public void userShouldBeAbleToPutOnHoldCompileCreditSummaryTaskForLargeTicketFactoringLoan() {
   }

   @And("User should be able to put on hold {int} and Tax Guard Report task for Large Ticket "
       + "Factoring Loan")
   public void userShouldBeAbleToPutOnHoldAndTaxGuardReportTaskForLargeTicketFactoringLoan(
       int arg0) {
   }

   @And("User should be able to put on hold TMS Discovery and Setup task for Large Ticket "
       + "Factoring Loan")
   public void userShouldBeAbleToPutOnHoldTMSDiscoveryAndSetupTaskForLargeTicketFactoringLoan() {
   }

   @And("User should be able to Decline Approve task for Large Ticket Factoring Loan")
   public void userShouldBeAbleToDeclineApproveTaskForLargeTicketFactoringLoan() {
   }

   @And("User should be able to put on hold Prefunding Legal Review task for Large Ticket "
       + "Factoring Loan")
   public void userShouldBeAbleToPutOnHoldPrefundingLegalReviewTaskForLargeTicketFactoringLoan() {
   }

   @And("User should be able to Request KIQ questions for Customer opening a savings Account")
   public void userShouldBeAbleToRequestKIQQuestionsForCustomerOpeningASavingsAccount() {
   }

   @And("User should be able to decline Compile Credit Summary task for Small Ticket Equipment")
   public void userShouldBeAbleToDeclineCompileCreditSummaryTaskForSmallTicketEquipment() {
   }

   @And("User should be able to Put on Hold Customer Verification QA task for Consumer {int} "
       + "Month CD")
   public void userShouldBeAbleToPutOnHoldCustomerVerificationQATaskForConsumerMonthCD(int arg0) {
   }

   @And("User should be able to Put on Hold Send Welcome Email task for Consumer {int} Month CD")
   public void userShouldBeAbleToPutOnHoldSendWelcomeEmailTaskForConsumerMonthCD(int arg0) {
   }

   @And("User should be able to Put on Hold Funding task for Consumer {int} Month CD")
   public void userShouldBeAbleToPutOnHoldFundingTaskForConsumerMonthCD(int arg0) {
   }

   @And("User should be able to Put On hold Application Verification task for Consumer Premium "
       + "Savings")
   public void userShouldBeAbleToPutOnHoldApplicationVerificationTaskForConsumerPremiumSavings() {
   }

   @And("User should be able to Put on Hold Customer verification Task for Commercial Business "
       + "Savings")
   public void userShouldBeAbleToPutOnHoldCustomerVerificationTaskForCommercialBusinessSavings() {
   }

   @And("User should be able to Put on Hold CIF Account Creation Task for Commercial Business "
       + "Savings")
   public void userShouldBeAbleToPutOnHoldCIFAccountCreationTaskForCommercialBusinessSavings() {
   }

   @And("User should be able to Put on Hold CIF Funding Task for Commercial Business Savings")
   public void userShouldBeAbleToPutOnHoldCIFFundingTaskForCommercialBusinessSavings() {
   }

   @And("User should be able to Put on Hold Standard Exception task for Commercial small ticket "
       + "equipment")
   public void userShouldBeAbleToPutOnHoldStandardExceptionTaskForCommercialSmallTicketEquipment() {
   }

   @And("User should be able to Put on Hold Equipment Checklist task for Commercial small ticket "
       + "equipment")
   public void userShouldBeAbleToPutOnHoldEquipmentChecklistTaskForCommercialSmallTicketEquipment() {
   }

   @And("Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket"
       + " Equipment")
   public void useShouldBeAbleToPutOnHoldCheckInLoanPackageTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Complie Credit Summary Task for Commercial Large "
       + "Ticket Equipment")
   public void useShouldBeAbleToPutOnHoldComplieCreditSummaryTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Collateral Valuation Task for Commercial Large Ticket "
       + "Equipment")
   public void useShouldBeAbleToPutOnHoldCollateralValuationTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Scoring Task for Commercial Large Ticket Equipment")
   public void useShouldBeAbleToPutOnHoldScoringTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Standard Exception Task for Commercial Large Ticket "
       + "Equipment")
   public void useShouldBeAbleToPutOnHoldStandardExceptionTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Send Approve Letter Task for Commercial Large Ticket "
       + "Equipment")
   public void useShouldBeAbleToPutOnHoldSendApproveLetterTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Equipment CheckList Task for Commercial Large Ticket "
       + "Equipment")
   public void useShouldBeAbleToPutOnHoldEquipmentCheckListTaskForCommercialLargeTicketEquipment() {
   }

   @And("Use should be able to put on hold Scoring Task for Commercial Small Ticket Factoring")
   public void useShouldBeAbleToPutOnHoldScoringTaskForCommercialSmallTicketFactoring() {
   }

   @And("Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket"
       + " Factoring Loan")
   public void useShouldBeAbleToPutOnHoldCheckInLoanPackageTaskForCommercialLargeTicketFactoringLoan() {
   }

   @Given("User Test Data is loaded")
   public void userTestDataIsLoaded() {
   }

   @Given("User is on DOA HomePage")
   public void userIsOnDOAHomePage() {
   }

   @When("User selects service type as {string}")
   public void userSelectsServiceTypeAsPersonal() {
   }

   @And("Product as {string},{string}")
   public void productAsCertificateOfDepositMonthCD(int arg0) {
   }

   @Then("On Clicking OpenNow User should be Navigated to Basic InformationPage")
   public void onClickingOpenNowUserShouldBeNavigatedToBasicInformationPage() {
   }

   @When("User fills all Basic Information and clicks Next")
   public void userFillsAllBasicInformationAndClicksNext() {
   }

   @Then("Certificate of Deposit Page should be displayed")
   public void certificateOfDepositPageShouldBeDisplayed() {
   }

   @When("User fills Details for COD Page and click Next")
   public void userFillsDetailsForCODPageAndClickNext() {
   }

   @Then("Agreements Page Should be loaded")
   public void agreementsPageShouldBeLoaded() {
   }

   @When("User Submits the Application")
   public void userSubmitsTheApplication() {
   }

   @Then("User should be able to Resume Application in Onboarding")
   public void userShouldBeAbleToResumeApplicationInOnboarding() {
   }

   @And("Complete the Consumer Deposit Task")
   public void completeTheConsumerDepositTask() {
   }

   @And("Complete the Consumer Checking Deposit Task")
   public void completeTheConsumerCheckingDepositTask() {
   }

   @And("Business Product as {string},{string}")
   public void businessProductAsCertificateOfDepositMonthCD(int arg0) {
   }

   @When("User fills all Legal Entity Information and clicks Next")
   public void userFillsAllLegalEntityInformationAndClicksNext() {
   }

   @And("Fills the Details for the Individual Information for SSN {string}")
   public void fillsTheDetailsForTheIndividualInformationForSSN(String arg0) {
   }

   @Then("Select applicant and click on edit button")
   public void selectApplicantAndClickOnEditButton() {
   }

   @Then("Pull resource and verify code {string} and description {string} from results")
   public void pullResourceAndVerifyCodeAndDescriptionFromResults(String arg0, String arg1) {
   }

   @And("Fills the Details for the Individual Information with ssn {string} for mobile {string}")
   public void fillsTheDetailsForTheIndividualInformationWithSsnForMobile(String arg0,
       String arg1) {
   }

   @Then("Pull resource and verify Fraud score as {string} for mobile number {string}")
   public void pullResourceAndVerifyFraudScoreAsForMobileNumber(String arg0, String arg1) {
   }

   @Then("Pull resource and verify Fraud score between {string} and {string} for mobile number "
       + "{string}")
   public void pullResourceAndVerifyFraudScoreBetweenAndForMobileNumber(String arg0, String arg1,
       String arg2) {
   }

   @Then("Pull resource and verify correlation score {string} and Phone risk {string}")
   public void pullResourceAndVerifyCorrelationScoreAndPhoneRisk(String arg0, String arg1) {
   }

   @And("Fills the Details for the Individual Information with ssn {string} for firstname "
       + "{string} and durname {string} and DOB {string}")
   public void fillsTheDetailsForTheIndividualInformationWithSsnForFirstnameAndDurnameAndDOB(
       String arg0, String arg1, String arg2, String arg3) {
   }

   @Then("Pull resource and verify Watch list code {string} and description {string} from results")
   public void pullResourceAndVerifyWatchListCodeAndDescriptionFromResults(String arg0,
       String arg1) {
   }

   @And("Fills the Details for the Individual Information with ssn {string} for email {string}")
   public void fillsTheDetailsForTheIndividualInformationWithSsnForEmail(String arg0, String arg1) {
   }

   @Then("Pull resource and verify email risk score {string} and correlation between {string} and"
       + " {string}")
   public void pullResourceAndVerifyEmailRiskScoreAndCorrelationBetweenAnd(String arg0, String arg1,
       String arg2) {
   }
}
