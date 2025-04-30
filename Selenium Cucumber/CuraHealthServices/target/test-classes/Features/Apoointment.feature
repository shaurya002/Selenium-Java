@tagThree
Feature: Making Appointment
  I want to make appointment on Appointment Page

  @tag3
  Scenario: Making Appointment through filling valid details
    Given user is at Appointment Page
    When user selects facility
    When user chooses for readmission
    When user chooses healthcare program
    When user enters the date
    When user enters the comment
    When user clicks on booking
    Then user is navigated to Confirmation Page

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
