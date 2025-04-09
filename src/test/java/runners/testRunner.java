package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features" , glue = {"stepDefination"},
				tags = "@book",
		plugin = {"pretty",
				"html:target/reports/Htmlreport.html",
				"usage:target/reports/Usagereport",
				"json:target/reports/Jsonreport.json",
				"rerun:target/failedScenarios.txt"
				},
//		dryRun = true,
		monochrome = true
		)
public class testRunner extends AbstractTestNGCucumberTests {

}
