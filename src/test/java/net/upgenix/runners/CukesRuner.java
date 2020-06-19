package net.upgenix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        glue = "net/upgenix/step_definitions",
        strict = true,
        dryRun = false,
        tags = "@smoke"
)
public class CukesRuner {
}