
Feature: Company

  Scenario: Company view
    Given user should be on About page     
    When user click on Company 
    Then user should be able to view Comapany List
    When user click on About Us
    Then user should be on About Us page
    When user click on Our Team
    Then user should be on Our Team page
    When user click on Careers
    Then user should be on Careers page
    When user click on Security
    Then user should be on Security page
    When user click on News
    Then user should be on News page
    When user click on Partner
    Then user should be on Partner page
    Then user closes the Browser