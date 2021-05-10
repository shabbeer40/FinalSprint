$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Defect.feature");
formatter.feature({
  "line": 1,
  "name": "Defect Test",
  "description": "",
  "id": "defect-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Payment",
  "description": "",
  "id": "defect-test;payment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User in the Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Pay button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Payment Page is be visible",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on UPI",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Different Options in UPI should visible",
  "keyword": "Then "
});
formatter.match({
  "location": "DefectSD.user_in_the_Home_page()"
});
formatter.result({
  "duration": 49494925800,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_Cart_button()"
});
formatter.result({
  "duration": 28130821200,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_Pay_button()"
});
formatter.result({
  "duration": 33381792300,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.payment_Page_is_be_visible()"
});
formatter.result({
  "duration": 8033395500,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_UPI()"
});
formatter.result({
  "duration": 10168831300,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.different_Options_in_UPI_should_visible()"
});
formatter.result({
  "duration": 5206519800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[contains(text(),\u0027Phonepe UPI\u0027)]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-IUDNIR4\u0027, ip: \u0027192.168.43.165\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:51686}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c046d64bfac9a89163b522251dac5c88\n*** Element info: {Using\u003dxpath, value\u003d//span[contains(text(),\u0027Phonepe UPI\u0027)]}\r\n\tat jdk.internal.reflect.GeneratedConstructorAccessor12.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.DefectSD.different_Options_in_UPI_should_visible(DefectSD.java:74)\r\n\tat ✽.Then Different Options in UPI should visible(src/test/resources/Feature/Defect.feature:9)\r\n",
  "status": "failed"
});
});