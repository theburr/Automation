Meta:
@LikePost

Narrative:
As a user
I want to read posts in Healthy Food Social Network
So that I can like them

Scenario: Like post scenario in Healthy Food Social Network
Given Click homeButton element
When Wait for navigation.SignIn, 5 seconds
And Click navigation.SignIn element
And Type icokostow@abv.bg in username.Field field
And Type telerikAlphaQA22$ in password.Field field
And Click confirmActionsButton element
And Click latestPostButton element
And Wait for post.SearchField, 3 seconds
And Type motorcycle in post.SearchField field
And Wait for postSearchButton, 3 seconds
And Click postSearchButton element
And Wait for post.TitleForEdit, 7 seconds
And Click post.TitleForEdit element
And Wait for post.LikeButton, 7 seconds
And Click post.LikeButton element
Then Assert that post.DislikeButton present

Given Click post.DislikeButton element
When Click logout.Button element
When Wait for logInHomeButton, 5 seconds
Then Click logInHomeButton element
