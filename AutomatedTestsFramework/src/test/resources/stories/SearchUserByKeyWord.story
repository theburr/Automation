Meta:
@SearchUser

Narrative:
As a user
I want to log in Healthy Food Social Network
So that I can search my friends who have registration yet

Scenario: Search user scenario in social network
Given Click navigation.HomeBtn element
When Wait for navigation.SignIn, 5 seconds
And Click navigation.SignIn element
And Type icokostow@abv.bg in username.Field field
And Type telerikAlphaQA22$ in password.Field field
And Click confirmActionsButton element
And Wait for navigation.Users, 3 seconds
And Click navigation.Users element
And Type Toniupdated in post.SearchField field
And Wait for postSearchButton, 2 seconds
And Click postSearchButton element
And Wait for myFriend, 3 seconds
And Click myFriend element
Then Assert that confirmActionsButton present

Given Click logout.Button element
When Wait for logInHomeButton, 5 seconds
Then Click logInHomeButton element