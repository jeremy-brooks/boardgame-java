package com.game;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jbrooks on 29/09/2015.
 */

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:/target/cucumber"})
public class RunTests {
}
