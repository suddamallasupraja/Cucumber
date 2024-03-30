package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//Features"},
				glue="stepDefinitions",
				//features="@target/rerun.txt",
				plugin= {"pretty","html:reports/myreport.html","json:reports/myreport.json","rerun:target/rerun.txt"},
				monochrome=true, //to remove junk data in console window
				dryRun=false,//to execute the functionality in browser otherwise jus it will check the feature file have corresponding method or not
				tags="@without"
				
				
		)

public class TestRunner 
{

}
