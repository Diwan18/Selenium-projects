package runner;

import baseClass.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue = "steps",monochrome=true,publish=true)
public class Login extends BaseClass {

}
