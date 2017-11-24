@Feature_login
Feature: Login

 Background:
    Given I go to URL "https://www.d3dsecurity.co.uk"

  @login1
  Scenario: validating the Login button
    When I click Login button
    Given I enter login as "test1@yahoo.com"
    And I enter password as "Testing1"
   When I click Log in button
    Then I should see My Account button
    And I should see Log Out button
#@login_invalid
#     Scenario: validating the Login button with invalid data
#    When I click Login button
#    Given I enter login as "test1@oo.com"
#    And I enter password as "tes"
#   When I click Log in button
#   Then I should see error message as "Wrong Credentials"
#@about_us
#  Scenario: checking Why D3D button
#    Then I should see "Why D3D" header
#    When I click Why D3D header
#    Then I should see "About Us" header with some text




