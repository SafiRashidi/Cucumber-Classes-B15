package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                glue = "StepDefinitions",
                dryRun = false,
                tags = "@smoke2",
                plugin = {"pretty"}
)
// dry run =true-> it will check which step of your feature file does not have glue code
public class SmokeRunner {
}


// tags option will execute the tagged testcase as mentioned in your runner class