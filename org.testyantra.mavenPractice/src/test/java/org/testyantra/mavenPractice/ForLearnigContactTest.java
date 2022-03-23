package org.testyantra.mavenPractice;

import org.testng.annotations.Test;

public class ForLearnigContactTest{
	
	@Test(groups={"create","functionalTesting"})
	public void createContactUsingLastName() {
		System.out.println("contact creation successful");
		
	}
	
	@Test(groups={"edit","integrationTesting","smokeTesting"})
	public void editContact() {
		System.out.println("edit contact succesfully");
	}
	
	@Test(groups={"delete","functionalTesting","integrationTesting"})
	public void deleteContact() {
		System.out.println("delete contact successfull");
	}
	
	
}
