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
  "name": "User click on cards",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters the card data",
  "keyword": "Then "
});
formatter.match({
  "location": "DefectSD.user_in_the_Home_page()"
});
formatter.result({
  "duration": 71290039200,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_Cart_button()"
});
formatter.result({
  "duration": 30045051500,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_Pay_button()"
});
formatter.result({
  "duration": 32000002400,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.payment_Page_is_be_visible()"
});
formatter.result({
  "duration": 8024636600,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_click_on_cards()"
});
formatter.result({
  "duration": 3146424000,
  "status": "passed"
});
formatter.match({
  "location": "DefectSD.user_enters_the_card_data()"
});
formatter.result({
  "duration": 13836161100,
  "error_message": "java.lang.AssertionError: expected:\u003cfalse\u003e but was:\u003ctrue\u003e\r\n\tat org.junit.Assert.fail(Assert.java:89)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:835)\r\n\tat org.junit.Assert.assertEquals(Assert.java:120)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinition.DefectSD.user_enters_the_card_data(DefectSD.java:85)\r\n\tat ✽.Then User enters the card data(src/test/resources/Feature/Defect.feature:9)\r\n",
  "status": "failed"
});
});