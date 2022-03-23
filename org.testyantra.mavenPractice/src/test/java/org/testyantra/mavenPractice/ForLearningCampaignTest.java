package org.testyantra.mavenPractice;

import org.testng.annotations.Test;

public class ForLearningCampaignTest{

	
	@Test(groups={"create","functionalTesting","smokeTesting"}) 
	public void createcampaignUsingcampaignName() {
		System.out.println("campaign creation successful");
	}
	
	@Test(groups={"edit","integrationTesting"})
	public void editcampaign() {
		System.out.println("edit campaign succesfully");
	}
	
	@Test(groups={"delete","integrationTesting"})
	public void deletecampaign() {
		System.out.println("delete campaign successfull");
	}
	
	@Test(groups={"search","functionalTesting","integrationTesting"})
	public void searchcampaign() {
		System.out.println("search campaign successfull");
	}

}
