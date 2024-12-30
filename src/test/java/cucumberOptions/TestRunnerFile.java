package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue= {"stepDefinitions"}, monochrome = true, 
tags="@RegressionTest", 
plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestRunnerFile extends AbstractTestNGCucumberTests {
/*
 * tags="@RegressionTest or @SanityTest"
 * tags="@RegressionTest and @SanityTest"
 * tags="@RegressionTest"
 * tags="not @RegressionTest"
 * tags="@RegressionTest and (@GenericUserTest or @MortgageUserTest)"
 * dryRun=true -If this is set to true then whenever we will execute our tests or say run our test runner file 
 * then it will only check if all steps in feature file are linked to stepDefinitions or not and will not actually 
 * run code of all steps.
 * 
 * https://github.com/selenium-cucumber/selenium-cucumber-java-maven-example
 * https://github.com/mubbashir/appium-java-cucumber-gradle
 */

	
}
