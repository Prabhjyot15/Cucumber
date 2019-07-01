package testrunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty" ,"html:Folder_Name" ,
        "json:Folder_Name/cucumber.json" ,
        "junit:Folder_Name/cucumber.xml"},features="resources/features",tags= {"@tag1"},glue= {"stepDefinitions"})
public class Runner {

}
