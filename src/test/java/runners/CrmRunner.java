package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/taggedFeatures" , glue = {"stepDefination"},
				tags = "@Regression or @Sanity or @Smoke",
//		plugin = {"pretty",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"html:target/reports/Htmlreport.html",
//				"usage:target/reports/Usagereport",
//				"json:target/reports/Jsonreport.json",
//				"rerun:target/failedScenarios.txt"
//				},
//		dryRun = true,
		monochrome = true
		)

public class CrmRunner extends AbstractTestNGCucumberTests {

}
