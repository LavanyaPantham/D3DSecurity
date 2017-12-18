#@easyjet
#Feature: Easyjet.com
#
#
#  @casestudy1_scenario
#  Scenario: verifying sign in button
#    Given I Go to the Url "https://www.easyjet.com"
#    When I close the Cookies button
#    When I click Sign in button
#    Then I should see header as "Sign In"
#    Given I enter Email address as "testd3d@yahoo.com"
#    And I enter the password as "Testing1"
#    When I submit Sign in button
#    Then I should see the URL as "https://www.easyjet.com/EN/secure/MyEasyJet.mvc/AllBookings"
#
#
#  @casestudy2_datatable
#  Scenario: Verifying the Register button
#    Given I navigate to "https://www.easyjet.com/en/register"
#    Then I should see page header as "Member registration"
#    And I should see the header as "Your easyJet.com log in"
#    Given I enter My details as below:
#      | My email address is | Confirm your email address | Your password | Confirm your password |
#      | lavanyaravikanth@gmail.com   | lavanyaravikanth@gmail.com          | Testing@123         | Testing@123                 |
#    Then I see account details as "Your account details"
#    When I select "Mr" from dropdown list
#    Given I enter the account details as follows:
#      | First Name | Surname(s) | Address | Town/city | Postcode/zip | Mobile Telephone |
#      | Cherry     | Pandu      | 17      | Kakinada  | 533003       | 09848156630      |
#    And I select the country as "India"
#    And I select country code as "India(+91)"
#    When I click on I don't have a mobile phone
#    And I select the Alternative country telephone as "India(+91)"
#    Given I enter mobile number as "90452191922"
#    Then I should see the Heading as "I am most interested in flights departing from:"
#    Given I select the departing flights as below:
#      | Departing_Airports |
#      | BFS                |
#      | GLA                |
#      | GVA                |
#    When I select the check box
#    And I click Register now button
#    Then I should see current url as "https://www.easyjet.com/EN/secure/UpdateAccount.mvc/EditAccount"
#
#
#
