package com.krafttech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/krafttech/stepDefinitions",
        dryRun = false,
        // dryRun testlerin taslaklarını almak için true yapılır
        // normalde testlerin koşturulabilmesi için false olması gerekir
        tags = "@login"

)
public class CukesRunner {
}
