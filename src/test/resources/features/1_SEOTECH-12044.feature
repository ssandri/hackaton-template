@REQ_SEOTECH-12044
Feature: [QA] [Workshop Material] US Author


	@TEST_SEOTECH-12457
	Scenario: the user should be able to create an author 
		Scenario Outline: As a Librarian, the user should be able to create an author 
		When the librarian add an author with name "<Name>" 
		Then the author should be created on the account of librarian 
		Examples: 
		|Name| 
		|Kanishk| 
		|Alex| 
		|Diego|



	@TEST_SEOTECH-12458
	Scenario: the user should be able to get list of authors created by me
	Scenario: As a Librarian, the user should be able to get list of authors created by me
		When the librarian wants to view the list of authors added by him
		Then the librarian should get all the authors on his name