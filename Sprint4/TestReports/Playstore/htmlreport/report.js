$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Appstore.feature");
formatter.feature({
  "line": 1,
  "name": "Download App From PlayStore and AppStore",
  "description": "",
  "id": "download-app-from-playstore-and-appstore",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User able to download the app from Playstore",
  "description": "",
  "id": "download-app-from-playstore-and-appstore;user-able-to-download-the-app-from-playstore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Playstore"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User on the Mcdonalds Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the Playstore icon and New window should be open, User will download the app from Playstore",
  "keyword": "Then "
});
formatter.match({
  "location": "PlaystoreSD.user_logs_into_his_account()"
});
formatter.result({
  "duration": 40951559300,
  "status": "passed"
});
formatter.match({
  "location": "PlaystoreSD.user_clicks_on_the_Playstore_icon()"
});
formatter.result({
  "duration": 32252377900,
  "status": "passed"
});
});