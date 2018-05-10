package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ADMIN\\eclipse-workspace2\\careEmpowerProject\\Feature"
		,glue={"stepDefenition"},tags={"@Test"}
		)
 
public class CucumberTestRunner {
 
}