$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Appstore.feature");
formatter.feature({
  "line": 1,
  "name": "Download App From PlayStore and AppStore",
  "description": "",
  "id": "download-app-from-playstore-and-appstore",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "User able to Download the App from Appstore",
  "description": "",
  "id": "download-app-from-playstore-and-appstore;user-able-to-download-the-app-from-appstore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Appstore"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User on the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User clicks on the Appstore icon and New window should be open, User will download the app from Appstore",
  "keyword": "Then "
});
formatter.match({
  "location": "AppstoreSD.user_on_the_Home_Page()"
});
formatter.result({
  "duration": 44962540000,
  "status": "passed"
});
formatter.match({
  "location": "AppstoreSD.user_clicks_on_the_Appstore_icon_and_New_window_should_be_open_User_will_download_the_app_from_Appstore()"
});
formatter.result({
  "duration": 30758330900,
  "status": "passed"
});
});