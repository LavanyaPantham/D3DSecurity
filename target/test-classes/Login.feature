@login
Feature: Login

  Background:
    Given I Go To URL "https://www.d3dsecurity.co.uk"
@login_valid
  Scenario: verifying the login button with valid data
    When I Click Login button
    Given I enter Username/Email as "test1@yahoo.com"
    And I enter Password as "Testing1"
    When I Submit Log in button
    Then I Should see My Account Button
    And I Should see Log Out Button

