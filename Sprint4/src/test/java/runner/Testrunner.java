package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@CucumberOptions(features="src/test/resources/Feature/Appstore.feature",glue= {"stepDefinition"},tags= {"@Playstore"},
 plugin= {"pretty",
		 "html:TestReports/Playstore/htmlreport",
		  "junit:TestReports/junit-report/Playstorecucumber.xml",
		  "json:TestReports/json-report/Playstorecucumber.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:TestReports/cucumber-reports/report.html"})*/
/*@CucumberOptions(features="src/test/resources/Feature/Appstore.feature",glue= {"stepDefinition"},tags={"@Appstore"},
plugin= {"pretty","html:TestReports1/Appstore/htmlreport",
		  "junit:TestReports1/junit-report/Appstorecucumber.xml",
		  "json:TestReports1/json-report/Appstorecucumber.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:TestReports1/cucumber-reports/report.html"})*/
/*@CucumberOptions(features="src/test/resources/Feature/Payment.feature",glue= {"stepDefinition"},
plugin= {"pretty","html:TestReports2/Payment/htmlreport",
		  "junit:TestReports2/junit-report/Paymentcucumber.xml",
		  "json:TestReports2/json-report/Paymentcucumber.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:TestReports2/cucumber-reports/report.html"})*/
@CucumberOptions(features="src/test/resources/Feature/Defect.feature",glue= {"stepDefinition"},
plugin= {"pretty",
		 "html:TestReports4/Defect/htmlreport",
		  "junit:TestReports4/junit-report/Defectcucumber.xml",
		  "json:TestReports4/json-report/Defectcucumber.json",
		  "com.cucumber.listener.ExtentCucumberFormatter:TestReports4/cucumber-reports/report.html"})
public class Testrunner extends AbstractTestNGCucumberTests{

}
