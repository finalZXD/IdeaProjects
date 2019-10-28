package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features"},glue={"steps"},
            plugin = {"html:target/cucumber-html-report",
                    "json:target/cucumber.json",
                    "junit:target/cucumber-reports/cucumber.xml"},
            tags = {"@RegressionTest"})
public class Runner {
}
