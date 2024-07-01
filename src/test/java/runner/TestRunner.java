package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/",
        tags = "@regression",
        plugin = {
                "json:target/cucumber-report.json",
                "pretty",
                "html:target/cucumber-html-report.html",
                "junit:target/cucumber-junit-report/Cucumber.xml",},
        glue = {"stepDefinition"})
public class TestRunner {
}
