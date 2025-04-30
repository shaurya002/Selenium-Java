@tagTwo
Feature: Logging into Cura Health Services
  I want to log into site using various valid Credentials

  @tag2
  Scenario: Logging to the site
    Given user is at Login page
    When user enters username
    When user enters password
    When user clicks login
    Then user is navigated to appointment site




  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
