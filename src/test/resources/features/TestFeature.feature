Feature: Visit a page and click on a link

@test
  Scenario Outline: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When Signin with "<username>" , "<password>"
    And navigate to weather page and search for newcastle weather

  Examples:
    |username|password|
    |srilu.koppolu@gmail.com|srilu@123|


