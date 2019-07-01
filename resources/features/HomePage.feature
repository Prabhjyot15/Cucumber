
@tag
Feature: Check Google Homepage
  I want to find if the buttons are working properly
  @tag1
  Scenario Outline: Google Homepage check
    Given i open Google Chrome browser
    When I open FaceBook homepage
    Then Enter the <username> and <password>
    And quit 
  




    Examples: 
      | username  | password | status  |
      | prabhjyotkaur61@yahoo.in |     prabhjyot@15 | success |
      
