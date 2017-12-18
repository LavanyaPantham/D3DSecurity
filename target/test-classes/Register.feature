@register
Feature: Register

  Background:
    Given I Go To URL "https://www.d3dsecurity.co.uk"

  @case1-v-v-v
  Scenario: Register as a New User
    When I click Register button
    Given I enter Email ID as "test11@yahoo.com"
    And I enter New Password as "Test11"
    And I enter Confirm Password as "Test11"
    When I submit Register button
    Then I should see My Account button
    And I should see Log Out button

  @case2-blank
  Scenario: Registering with blank data
    When I click Register button
    Given I enter blank Email ID as " "
    And I enter blank New Password as " "
    And I enter blank Confirm Password as " "
    When I submit Register button
    Then I should see the error message as "Username is not valid"

  @case3-v-v-iv
  Scenario: Registering with unidentical passwords
    When I click Register button
    Given I enter new Email ID as "test11@yahoo.com"
    And I enter the Password as "Test11"
    And I re-enter confirm Password as "test2"
    When I submit Register button
    Then I should see an error message as "Passwords must be identical and filled"

  @case4-v-v-b
  Scenario: Registering with unidentical and blank passwords
    When I click Register button
    Given I enter new Email ID as "test11@yahoo.com"
    And I enter the Password as "Test11"
    And I enter blank Confirm Password as " "
    When I submit Register button
    Then I should see an error message as "Passwords must be identical and filled"

  @case5-v-b-v
  Scenario: Registering with valid and blank passwords
    When I click Register button
    Given I enter Email ID as "test11@yahoo.com"
    And I enter blank New Password as " "
    And I enter Confirm Password as "Test8"
    When I submit Register button
    Then I should see an error message as "Passwords must be identical and filled"

  @case6-b-v-v
  Scenario: Registering with unidentical passwords
    When I click Register button
    Given I enter blank Email ID as " "
    And I enter New Password as "Test11"
    And I enter Confirm Password as "Test11"
    When I submit Register button
    Then I should see the error message as "Username is not valid"
    
