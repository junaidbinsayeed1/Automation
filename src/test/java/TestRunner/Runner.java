package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = "C:\\Users\\Junaid Bin Sayeed\\git\\My Repo\\Framework\\src\\main\\resources\\Features\\Automation Exercise\\Products.feature",
			glue = {"StepDefination"},
			dryRun = false,
			monochrome = true,
			plugin = {"pretty","html:target/reports"}
		)

public class Runner
{

}
