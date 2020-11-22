Meta:
@LogIN

Narrative:
As a user
I want to log in Healthy Food Social Network
So that I can read latest posts

Scenario: LogIn scenario in social network
Given Click homeButton element
When Wait for navigation.SignIn, 5 seconds
When Click navigation.SignIn element
And Type icokostow@abv.bg in username.Field field
And Type telerikAlphaQA22$ in password.Field field
And Click confirmActionsButton element
And Click latestPostButton element
And Wait for post.TypeTitle, 10 seconds
Then Assert that post.DeleteAssertion present

Given Click logout.Button element
When Wait for logInHomeButton, 5 seconds
Then Click logInHomeButton element
