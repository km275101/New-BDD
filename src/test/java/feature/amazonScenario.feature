Feature: amazon scenario complete PF

Scenario: amazon testing
Given users open login page

# below statement provides data from feature file in form of double quotes
#which can be captured by using the regular expression \"([^\"]*)\"
When user enters "km275101" and "kame9454"
And click submit button
Then user sees the login page 


Scenario Outline: product search to validate
Given users is in login page validate "<username>" and "<password>" Scenario Outline
	


Scenario: product search
Given users is in login page to search product

When user enters productName
|productName|
|bra|
|panty|
|womens innerwear|
|black bra|
And click search icon
Then user sees the PLP


Examples:
| username | password |
| kammy1   | pass1 |
| kammy2   | pass2 |
