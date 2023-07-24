@B29G12-243 @VyTrack
Feature: Verify that user can/can't view columns on the Vehicle models page

	
	 @VyTrack
	Scenario: The store manager  sees 10 columns on the Vehicle Model page.
		Given Store manager is logged in as Store manager and on home page
		When Store manager click on Fleet
		And Store manager click on Vehicles Model
		Then Store manager sees  moduls


	
	 @VyTrack
	Scenario: The sales manager should see 10 columns on the Vehicle Model page.
		Given Sales manager is logged in as Store manager and on home page
		When Sales manager click on Fleet
		And Sales manager click on Vehicles Model
		 Then Sales manager sees moduls




	 @VyTrack
	Scenario: Drivers should not able to access the Vehicle Model page

			Given User is logged in as Driver and on home page
			When Driver click on Fleet
			And Driver click on Vehicles Model
			Then Driver sees a message You do not have permission to perform this action.