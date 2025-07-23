Feature:Login Feature

Scenario:User Should be Able to Sign In Successfully
	Given I am on shopping site
	When I enter username
	And I enter password
	And I click on Sign in
    Then I should be on accounts page
    

        