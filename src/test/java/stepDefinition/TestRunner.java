package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\Eclipse_workspace\\FREECRM-BDD\\src\\test\\resources\\Features\\Deals.feature",
		glue="stepDefinition",
		monochrome=true,
		plugin= {"pretty","html:target/HTMLReports.html",
						  "json:target/JsonReport/report.json"}
		)
public class TestRunner {

}
