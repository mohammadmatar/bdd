$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Login with facebook using invalid credentials",
  "description": "Description: The purpose of this feature to test Login with facebook using invalid credentials",
  "id": "login-with-facebook-using-invalid-credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with facebook using invalid credentials",
  "description": "",
  "id": "login-with-facebook-using-invalid-credentials;login-with-facebook-using-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Facebook Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to Login Section",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Message displayed Login Failed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestFacebook.user_is_on_Facebook_Home_Page()"
});
formatter.result({
  "duration": 3508234559,
  "status": "passed"
});
formatter.match({
  "location": "TestFacebook.user_Navigate_to_Login_Section()"
});
formatter.result({
  "duration": 73214888,
  "status": "passed"
});
formatter.match({
  "location": "TestFacebook.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 151907268,
  "status": "passed"
});
formatter.match({
  "location": "TestFacebook.user_Click_on_Login_Button()"
});
formatter.result({
  "duration": 1129119908,
  "status": "passed"
});
formatter.match({
  "location": "TestFacebook.message_displayed_Login_Failed()"
});
formatter.result({
  "duration": 1189759691,
  "status": "passed"
});
formatter.uri("google.feature");
formatter.feature({
  "line": 1,
  "name": "Search using google.com",
  "description": "Description: Search for Selenium word using google.com",
  "id": "search-using-google.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search for Selenium word using google.com",
  "description": "",
  "id": "search-using-google.com;search-for-selenium-word-using-google.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Google Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Click on Search bar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Selenium word",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click on Google Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Search Results displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestGoogle.user_is_on_Google_Home_Page()"
});
formatter.result({
  "duration": 3502737740,
  "status": "passed"
});
formatter.match({
  "location": "TestGoogle.user_Click_on_Search_bar()"
});
formatter.result({
  "duration": 57405891,
  "status": "passed"
});
formatter.match({
  "location": "TestGoogle.user_enters_Selenium_word()"
});
formatter.result({
  "duration": 89341313,
  "status": "passed"
});
formatter.match({
  "location": "TestGoogle.user_Click_on_Google_Search_Button()"
});
formatter.result({
  "duration": 915944700,
  "status": "passed"
});
formatter.match({
  "location": "TestGoogle.search_Results_displayed()"
});
formatter.result({
  "duration": 1241784534,
  "status": "passed"
});
});