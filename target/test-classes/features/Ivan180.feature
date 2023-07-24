@B29G12-242 @VyTrack
Feature: Default

	 @VyTrack #@B29G12-236
	Scenario: Truck Driver is able to see messages 
		Given User is logged in as Driver and on home page
			When User click on Learn how to use space
			Then User sees How To Use Pinbar
			Then User sees help message

	
	 @VyTrack #@B29G12-237
	Scenario: Store manager is able to see messages 
		Given User is logged in as Store manager and on home page
			When Store manager click on Learn how to use space
			Then Store manager How To Use Pinbar
			Then Store manager sees help message



	
	 @VyTrack #@B29G12-238
	Scenario: Sales manager is able to see messages
		Given User is logged in as Sales manager and on home page
			When Sales manager click on Learn how to use space
			Then Sales manager sees How To Use Pinbar
			Then Sales manager sees help message

	
	@VyTrack #@B29G12-239
	Scenario: Driver is able to see an image
		Given User is logged in as Driver and on home page
			When User click on Learn how to use space
			Then Driver sees an image
		
			#Additional information about the image
			#Image URL : https://qa.intabella.com/bundles/oronavigation/images/pinbar-location.jpg	

	
	@VyTrack #@B29G12-240
	Scenario: Store manager is able to see an image
		Given User is logged in as Store manager and on home page
			When User click on Learn how to use space
			Then Store manager sees an image
		
			#Additional information about the image
			#Image URL : https://qa.intabella.com/bundles/oronavigation/images/pinbar-location.jpg


	@VyTrack #@B29G12-241
	Scenario: Sales manager is able to see an image
		Given User is logged in as Sales manager and on home page
			When User click on Learn how to use space
			Then Sales manager sees an image
		
			#Additional information about the image
			#Image URL : https://qa.intabella.com/bundles/oronavigation/images/pinbar-location.jpg