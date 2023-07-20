package com.Castor_Sprint2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/Castor_Sprint2/step_definitions",
        dryRun = false,
        tags = "@US179_TeoDor",

        publish = true //generating a report with public link
)
public class CukesRunner {}


