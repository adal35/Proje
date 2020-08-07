$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Home_Page.feature");
formatter.feature({
  "name": "A description",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Home Page Google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Impl.Home_page_impl.user_navigates_to_Google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for something",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Impl.Home_page_impl.user_searches_for_something()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies that",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Impl.Home_page_impl.verifies_that()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});