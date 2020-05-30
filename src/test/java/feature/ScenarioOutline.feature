Feature: amazon scenario complete PF

Scenario: Test new scenario
Given Test "test" test


Scenario Outline: product search to validate
Given users is in login page validate "<username>" and "<password>" Scenario Outline
	



Examples:
| username | password | data |
| kammy1   | pass1 | data1 |
| kammy2   | pass2 | data2 |
