package org.testyantra.mavenPractice;

import org.testng.annotations.Test;


public class ForLearningProductTest{

	@Test(groups={"create","functionalTesting"})
	public void createproductUsingProductName() {
		System.out.println("product creation successful");
	}
	
	@Test(groups={"edit","integrationTesting"})
	public void editProduct() {
		System.out.println("edit product succesfully");
	}
	
	@Test(groups={"delete","integrationTesting","smokeTesting"})
	public void deleteProduct() {
		System.out.println("delete product successfull");
	}
	
	@Test(groups={"search","functionalTesting","integrationTesting"})
	public void searchProduct() {
		System.out.println("search product successfull");
	}

	
	
}
