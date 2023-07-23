@B29G12-280
Feature: Home page main menu modules verification

	Background: User is already in the log in page
		#@B29G12-278
		Given the user is on the login page
		

	
	@B29G12-277
	Scenario Outline: Verify store and sales managers can see 8 expected module names: Dashboards, Fleet, Customers, Sales, Activities, Marketing, Reports & Segments, System in the main menu
		Given the user logged in as "<userType>"
		    When user hovers over the main menu
		    Then user sees the expectedModules are displayed
		
		    Examples:
		      | userType      |
		      | sales manager |
		      | store manager |	

	
	@B29G12-279
	Scenario: Verify drivers should see 4 expected module names: Fleet, Customers, Activities, System in the main menu
		Given the user logged in as "driver"
		    When the user hovers over the main menu
		    Then the user sees the expectedModules are displayed