Meta:
@EditProfile

Narrative:
As a user
I want to log in Healthy Food Social Network
So that I can edit my profile

Scenario: User can edin his profile in Healthy Food Social Network
Given Click homeButton element
When Wait for navigation.SignIn, 5 seconds
And Click navigation.SignIn element
And Type icokostow@abv.bg in username.Field field
And Type telerikAlphaQA22$ in password.Field field
And Click confirmActionsButton element
And Wait for profile.Button, 3 seconds
And Click profile.Button element
And Wait for userEditButton, 2 seconds
And Click userEditButton element
And Type Ka in user.FirstNameField field
And Click confirmActionsButton element
Then Assert that userEditButton present

Given Click logout.Button element
When Wait for logInHomeButton, 5 seconds
Then Click logInHomeButton element