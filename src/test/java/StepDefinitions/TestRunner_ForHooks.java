
package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/hook_test.feature", glue={"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports/htmlreport.html",
          "json:target/JsonReport/JsonReport.json",
            "junit:target/JUnitReport/junitreport.xml"},
tags="@hooks")
public class TestRunner_ForHooks {

}
