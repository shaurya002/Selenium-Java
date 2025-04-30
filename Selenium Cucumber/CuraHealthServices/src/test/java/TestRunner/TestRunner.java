package TestRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue= {"StepDefinitions"}, tags="@tagOne or @tagTwo or @tagThree or @tagFour")
public class TestRunner extends AbstractTestNGCucumberTests{

}
