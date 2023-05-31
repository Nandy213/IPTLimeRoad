package Com_Runner;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dinesh\\eclipse-workspace\\Lime_RoadProject\\src\\test\\java\\LimeFeature\\FeatureFile.feature",
glue = "com_StepDefinition",
monochrome = true, 
dryRun = false,
strict = true, 
plugin = {"pretty",
		"html:Reports/limeroad.html","json:Reports/limeroad.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Lime_RunnerClass {
	public static void setup() {
			
	}
	

	
}
