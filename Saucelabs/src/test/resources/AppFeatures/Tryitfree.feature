
Feature: Try it free 

  Scenario: Try it free page
      Given user should be on About page 
			When user clicks on Try it free 
			Then user should be on Try it free page
	    And user can use Gmail sign up for sign in
	    And user can also use GitHub sign up for sign in
	    And user can also use Email sign up for sign in
	    Then user should be on sauce labs free trial Page
	    Then user closes the Browser
	    Examples: 
  
        | Gmail sign up button  |   | GitHub sign up       |   | Email sign up         |                              
        | sauce labs free trail |   |sauce labs free trail |   | sauce labs free trail |
        