package StepDefinitions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		monochrome = true, /* display the console output in proper readable format */
		features = {"src/test/resource/Features/Search.feature"},
		glue = {"StepDefinitions"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:target/Reports/test-output-thread/"},
		//dryRun = true, /* Run only when need to check all the step defination steps are created */
		tags = "@Test1"
				)

public class ParallelRun extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider (parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
