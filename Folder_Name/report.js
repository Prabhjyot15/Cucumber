$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 3,
  "name": "Check Google Homepage",
  "description": "I want to find if the buttons are working properly",
  "id": "check-google-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Google Homepage check",
  "description": "",
  "id": "check-google-homepage;google-homepage-check",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i open Google Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I open FaceBook homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "quit",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "check-google-homepage;google-homepage-check;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ],
      "line": 17,
      "id": "check-google-homepage;google-homepage-check;;1"
    },
    {
      "cells": [
        "prabhjyotkaur61@yahoo.in",
        "prabhjyot@15",
        "success"
      ],
      "line": 18,
      "id": "check-google-homepage;google-homepage-check;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Google Homepage check",
  "description": "",
  "id": "check-google-homepage;google-homepage-check;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "i open Google Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I open FaceBook homepage",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Enter the prabhjyotkaur61@yahoo.in and prabhjyot@15",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "quit",
  "keyword": "And "
});
formatter.match({
  "location": "Def.i_open_Google_Chrome_browser()"
});
