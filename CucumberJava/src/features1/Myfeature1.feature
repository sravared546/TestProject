Feature: Scenario Outline

@RegressionTest
Scenario: Login functionality for a social networking site.

Given user navigates to Facebook

When I enter Username as sravan and Password as reddy

Then login should be unsuccessful

@SmokeTest
Scenario: Login functionality for a social networking site.

Given user navigates to Facebook

When I enter Username as sravan and Password as reddy

Then login should be unsuccessful
