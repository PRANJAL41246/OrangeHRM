Feature: Validation of Login scenario

  #Author:Pranjal
  @smoke
  Scenario: Login the valid credential
    Given Open the browser
    When Enter valid username "username" and Password "password"
    Then execute sucessfully.
