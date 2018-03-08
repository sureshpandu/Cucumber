package runcukes;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="features/naukri.feature",
glue ={"stepDefinitionFiles"},
plugin = {"html:target/cucumber-reports"})
public class Naukrilogin extends AbstractTestNGCucumberTests {

}
