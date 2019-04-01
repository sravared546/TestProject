package Runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features1/deals.feature",glue="Runner",dryRun=false)
public class TestRunner {
	
}
