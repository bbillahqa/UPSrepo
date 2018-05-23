package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Features"}
,glue={"StepDefinitations"},
plugin = {"pretty","html:target/cucumber-htmlreport"})

public class TestRunner {

}
