package Runer;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/amrullonazrulloev/Desktop/Cucumber/src/test/resources/Features",
        glue="StepDefinition",
        monochrome = true,
        publish = true,
        plugin ={"pretty","html:target/HtmlReports"},
        tags = ""
        //dryRun = true

)

public class Runner {
}
