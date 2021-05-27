$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/jhetamm/eclipse-workspace/AFOBDD/src/main/java/Features/Search.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Free CRM login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks Login",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enter \"BN012345\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters \"Secret001#\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user search by DOB",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchStepDef.user_already_login_page()"
});
formatter.result({
  "duration": 15632344800,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.User_clicks_Login()"
});
formatter.result({
  "duration": 101757400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BN012345",
      "offset": 12
    }
  ],
  "location": "SearchStepDef.username(String)"
});
formatter.result({
  "duration": 79372400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Secret001#",
      "offset": 13
    }
  ],
  "location": "SearchStepDef.user_enters_password(String)"
});
formatter.result({
  "duration": 68940700,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.user_clicks_login_button()"
});
formatter.result({
  "duration": 3135261400,
  "status": "passed"
});
formatter.match({
  "location": "SearchStepDef.user_search_by_DOB()"
});
formatter.result({
  "duration": 3372092200,
  "status": "passed"
});
});