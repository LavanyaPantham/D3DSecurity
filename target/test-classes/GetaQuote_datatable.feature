@datatable
Feature: Get a Free Quote

  Background:
    Given I go to URL "https://www.d3dsecurity.co.uk"
    When I click on Products tab in the menu
#    Then I should see "Get a Free Quote" form on left side of the page
#    And I should see list of products under "Products" header on the right side of the page

  Scenario: Verifying "Get a Free Quote" in Products tab using Data table with valid data
    Given I enter the details of user in Get a Free Quote box as follows:
      | First_Name* | Last_Name | Your_Email      | Your_Phone_Number* | Subject      | Message                                  |
      | Lavanya     | Pantham   | test1@yahoo.com | 07586809        | Need a Quote | I would like to get a free quote on CCTV |
    When I click the SEND MESSAGE button
    Then I should see a "Thank you" Header
    And I should see message as "Thanks For Inquiry, We will Contact you Soon !!"
    And I should see url as "https://www.d3dsecurity.co.uk/thank-you/"
    And I should see "Get a Free Quote" form on left side of the page