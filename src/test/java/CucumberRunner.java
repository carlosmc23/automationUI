import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"}
        /*format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}*/
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}