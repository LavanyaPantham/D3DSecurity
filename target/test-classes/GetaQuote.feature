@quote
Feature: Get a Free Quote

  Background:
    Given I go to URL "https://www.d3dsecurity.co.uk"
    When I click on Products tab in the menu
    Then I should see "Get a Free Quote" form on left side of the page
    And I should see list of products under "Products" header on the right side of the page

  @valid_data
  Scenario: Verifying "Get a Free Quote" in Products tab using Data table with valid data
    Given I enter the First name of user "Lavanya"
    And I enter last name as "Pantham"
    And I enter email id as "test1@yahoo.com"
    And I enter phone number as "0720402481"
    And I enter Subject as "Need a Quote"
    And I enter Message as "I would like to get a free quote on CCTV"
    When I click the SEND MESSAGE button
    Then I should see a "Thank you" Header
    And I should see message as "Thanks For Inquiry, We will Contact you Soon !!"
    And I should see url as "https://www.d3dsecurity.co.uk/thank-you/"
    And I should see "Get a Free Quote" form on left side of the page
    And I should see blank First name field
    And I should see blank Last name field
    And I should see blank email id field
    And I should see blank phone number field
    And I should see blank Subject field
    And I should see blank Message field
    And I should see blank captcha field
    And I should see SEND MESSAGE button

#  @invalid_data
#  Scenario Outline: Verifying "Get a Free Quote" in Products tab using Data table with invalid data
#    Given I enter the mandatory first name field as "<First_Name>"
#    And I enter last name as "Pantham"
#    And I enter email id as "test1@yahoo.com"
#    And I enter the mandatory phone number field as "<Your_Ph_No>"
#    And I enter Subject as "Need a Quote"
#    And I enter Message as "I would like to get a free quote on CCTV"
#    When I click the SEND MESSAGE button
#    Then I should see a prompted message as "<prompt_message>"
#    And I should see Error Message as "<error_message>"
#
#    Examples:
#      | First_Name | Your_Ph_No  | prompt_message                     | error_message                                                              |
#      | LL         |             | PLEASE FILL IN THE REQUIRED FIELD. | Validation errors occurred. Please confirm the fields and submit it again. |
#      |            | 07568339092 | PLEASE FILL IN THE REQUIRED FIELD. | Validation errors occurred. Please confirm the fields and submit it again. |
#      | LL         | 07040503313 | YOUR ENTERED CODE IS INCORRECT.    | Validation errors occurred. Please confirm the fields and submit it again. |
