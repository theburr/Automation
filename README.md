
# Get to know our project

### Address of our web application

- https://protected-hamlet-40147.herokuapp.com

## Link to the followed Test Plan:

-https://telerikacademy-my.sharepoint.com/:w:/p/hristo_kostov_a22_learn/EaM6uFWY1RFBh4mWb-Y8sEsBrgeQiacApRgq-QFFFoZW_A?e=ZtjY1T

#### *Test Report and Bug Report would be found at the end of this file!

# Project Guide

### 1.Repository must be cloned or downloaded

- Refer to  https://git-scm.com/docs/git-clone

## 2.Open and build project with a IDE for Java

-Build Project

### 3.Run AddRequiredFiles.bat file

-This file is found in the ../AutomatedTestsFramework/

-It creates a folder with the rquired files for the upload functions of the web app

- Used in order to avoid using absolute path of the files
as it varies on different machines.

-The path of the created folder would be C:/ImageForHFSN you can delete this later

### 4.The Automated UI tests are grouped by categories

-Priority-1.bat file executes the critical test cases that are
most crucial for the successfull release of the web application

-Priority-2.bat file executes the category with high priority cases

-Priority-3.bat file executes the least important test cases

-RegressionTests.bat file is scheduled to execute all the test

### 5.REST API tests

   -To use Postman import HealthyFoodSocialNetwork.postman_collection.json
   and HFSN.postman_environment.json

   -To run the collection with newman and receive a report
   execute RunRestCollection.bat
   --in the bat

### 6.Reports

