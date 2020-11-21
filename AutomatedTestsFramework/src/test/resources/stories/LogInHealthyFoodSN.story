Meta:
@LogIN

Narrative:
As a user
I want to log in Healthy Food Social Network
So that I can rad latest posts

Scenario: LogIn scenario in social network
Given Click homeButton element
When Click navigation.SignIn element
And Type icokostow@abv.bg in username.Field field
And Type telerikAlphaQA22$ in password.Field field
And Click confirmActionsButton element
And Click latestPostButton element
Then Assert that post.TypeTitle present
