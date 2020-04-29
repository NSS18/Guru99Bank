$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/Features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should not be able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "name": "I enter invalid \"\u003cUserID\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserID",
        "Password"
      ]
    },
    {
      "cells": [
        "abc",
        "123"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Guru99Bank.MyStepdefs.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should not be able to login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalidLogin"
    }
  ]
});
formatter.step({
  "name": "I enter invalid \"abc\" and \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Guru99Bank.MyStepdefs.i_enter_invalid_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Guru99Bank.MyStepdefs.i_should_see_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});