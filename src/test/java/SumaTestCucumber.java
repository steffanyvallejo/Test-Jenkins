import static org.junit.Assert.assertEquals;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, strict = true, features = "src/test/resources", glue 
= "cucumber",monochrome = true)
public class SumaTestCucumber {
	
}
