@tagOne
Feature: Reaching the CURA Health Services Homepage
  I want to launch the browser and reach cura health webpage

  @tag1
  Scenario: CURA Health Homepage
    Given Browser launching
    And user is on Homepage
    When I click on make appointment
    Then user is navigated to login page
