@B29G12-283
Feature: Vehicles page car info icons verification

	Background: User is already in the log in page
		#@B29G12-278
		Given the user is on the login page
		

	
	@B29G12-282
	Scenario Outline: Store and sales managers users should see “view, edit, delete” when they hover the mouse over the 3 dots “…”
		Given the user logged in as "<userType>"
		    When user hovers over the Fleet option from the main menu
		    And the user clicks the Vehicles option from the dropdown menu
		    And the user hovers over the ... dots icon in the right side of the page across each car selection
		    Then user sees the view, edit, delete icons from the pop-up menu
		
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |	

	
	@B29G12-281
	Scenario: Driver users should see “view, edit, delete” when they hover the mouse over the 3 dots “…” 
		Given the user logged in as "driver"
		    When the user hovers over the Fleet option as first option from the main menu
		    And the user clicks the Vehicles option from the dropdown menu
		    And the user hovers over the ... dots icon in the right side of the page across each car selection
		    Then user sees the view, edit, delete icons from the pop-up menu