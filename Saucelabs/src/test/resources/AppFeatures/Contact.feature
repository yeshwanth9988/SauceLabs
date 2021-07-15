
Feature: Contact

  Scenario: Contact view
    Given user should be on About page 
    When user click on Contact 
    Then user should be able to view Contact List
    When user click on Contact Sales
    Then user should be on Contact Sales page
    When user click on General Inquiries
    Then user should be on General Inquiries page
    When user click on Contact Support
    Then user should be on Contact Support
    When user click on Sauce Community
    Then user should be on Sauce Community
    Then user closes the Browser

