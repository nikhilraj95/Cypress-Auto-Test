package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Campaign.feature"},
		
		glue = {"steps","hooks"},
		
		plugin = {"pretty"},
		
	
		
		tags =  "@Campaigns"  //or indicates both the tags or else one-off them atleast. "@sanity or @functional"
										//and indicates that we don't have both sanity and functional-
		//"@sanity or @functional" 							//at a time in feature file scenario (all are independent)  "@sanity and @functional"
		//not (@sanity or @functional)
		
		
		)





public class CampaignRunner extends AbstractTestNGCucumberTests{

}
