package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features" , glue = {"stepDefination"},
				tags = "@tag3",
		plugin = {"pretty",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"html:target/reports/Htmlreport.html",
//				"usage:target/reports/Usagereport",
//				"json:target/reports/Jsonreport.json",
//				"rerun:target/failedScenarios.txt"
				},
		dryRun = true,
		monochrome = true
		)
public class testRunner extends AbstractTestNGCucumberTests {

	
	@DataProvider(parallel=true)
	public Object[][] Scenarios(){
		return super.scenarios();
	}
}
