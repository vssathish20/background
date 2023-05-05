package org.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",features = "src/main/java/org/example/feature.feature",glue="org.example",tags="@phone")

public class runner {
    //one feature file can have only one background file
    //background runs before each scenario,where hooks runs before and after of each scenario
    //hooks have multiple hooks
    //hooks(before,after) have high priority so if we add hooks(before) in this file hooks will first exectute then only background;
    //Background is same as hooks but before condition or precondition only applied not for after condtion
    //background should be mentioned b4 the 1st scenario
}
