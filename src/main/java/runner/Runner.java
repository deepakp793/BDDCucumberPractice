package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=".\\src\\test\\java\\featureFiles\\",
        glue ="steps",
        publish = true
        //tags ="@sit"
        //dryRun =true

)

public class Runner {


}
