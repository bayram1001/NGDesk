package com.NGDesk.tests.login;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import com.NGDesk.pages.HomePage;
import com.NGDesk.pages.LoginPage;
import com.NGDesk.pages.SingleTicketPage;
import com.NGDesk.pages.TicketPage;
import com.NGDesk.tests.TestBase;
import com.NGDesk.utilities.ConfigurationReader;

public class TicketsPageTests extends TestBase {

	TicketPage ticketPage = new TicketPage();
	SingleTicketPage singleTicketPage = new SingleTicketPage();
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();


	@Test(groups= {"smoke"})
	public void ticketTest() {
		homePage.loginButton.click();
		homePage.subdomainBox.sendKeys(ConfigurationReader.getProperty("subdomain"));
		homePage.goLoginButton.click();
		loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
		loginPage.loginButton.click();
		String actualUserName = ticketPage.usernameOnTicketPage.getText();
		String expectedUserName = "zhumabaf";
		assertEquals(actualUserName, expectedUserName);
		ticketPage.randomTicket.click();
		
	}	



	public void respondingToATicketPublicly() {
		driver.get(ConfigurationReader.getProperty("loginDirectPageUrl"));
		loginPage.username.sendKeys(ConfigurationReader.getProperty("usernamea"));
		loginPage.password.sendKeys(ConfigurationReader.getProperty("passworda"));
		loginPage.loginButton.click();
		
	}
		

		
		
		
		
		
		
		
}
