package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, /* display the console output in proper readable format */
		features = {"src/test/resource/Features/Search.feature"},
		glue = {"StepDefinitions", "ApplicationHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:target/Reports/test-output-thread/"},
		//dryRun = false /* Run only when need to check all the step defination steps are created */
		tags = "@Test1"
				)

public class myTestRunner {

}
