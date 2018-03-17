package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.switchToFrame();
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@Test(priority=1)
	public void verifyContactsLabelTest() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(),"contact label is missing on the page");
	}
	
	@Test(priority=2)
	public void verifyselectSingleContactsByNameTest() {
		contactsPage.selectContactsByName("abc abcc");
	}
	
	@Test(priority=3)
	public void verifyselectMultipleContactsByNameTest() {
		contactsPage.selectContactsByName("abc abcc");
		contactsPage.selectContactsByName("Test Testabc");
	}
	
	
	
	
	//we will use Data Driven Approach
	
//	@DataProvider
//	public void getTestData() {
//		
//	}
	
	
	@Test(priority=4)
	public void validateCreateNewContact(){
		homePage.clickOnNewContactlink();
		contactsPage.createNewContact("Mr.", "Tom", "Peter", "Google");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
