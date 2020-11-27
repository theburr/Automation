# Get to know our project

### Address of our web application

- https://protected-hamlet-40147.herokuapp.com

### Address of REST API documentation

- https://protected-hamlet-40147.herokuapp.com/swagger-ui.html#/

### Link to the project's Test Plan:

- [Test Plan](https://telerikacademy-my.sharepoint.com/:w:/p/aleksandar_mechkarov_a22_learn/EX_u99jabyxDmyjXvdyBfZUBplkv6T4ArtdH3h9Ri1v7Dg?e=3UsjK0)

- Test Report and Bug Report would be found at the 10.Deliverables section of the Test Plan!

# Project Guide

### 1.Repository must be cloned or downloaded

- Refer to  https://git-scm.com/docs/git-clone

### 2.Open and build project with a IDE for Java

- Build Project

### 3.Run AddRequiredFiles.bat file

- This file is found in the ..zionalphaqaproject/AutomatedTestsFramework/

 -- It creates a folder with the rquired files for the upload functions of the web app

 -- Used in order to avoid using absolute path of the files
as it varies on different machines

- The path of the created folder would be C:/ImageForHFSN you can delete this later

### 4.The Automated UI tests are grouped by categories

- RunCriticalPrioritySuite.bat file executes the critical test cases that are
most crucial for the successfull release of the web application

- RunHighPrioritySuite.bat file executes the category with high priority cases

- RunMediumPrioritySuite.bat file executes the least important test cases

- RunRegressionTests.bat file is scheduled to execute all the test if there are updates on the application

- RunJBehave.bat file for JBehave tests

### 5.REST API tests

   -- To use Postman import HealthyFoodSocialNetwork.postman_collection.json
   and HFSN.postman_environment.json


   -- To run the collection with newman and receive a report execute RunRestCollection.bat
   - Do not close the local server that has been initiated it is needed for storing data from DB as API can not provide it
