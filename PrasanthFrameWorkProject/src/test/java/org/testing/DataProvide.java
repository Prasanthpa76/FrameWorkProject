package org.testing;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojo;
import org.baseclass.BaseXlFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide extends BaseXlFill {
	
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();

	}

	@AfterClass
	public void browserClose() {
		closeBrowser();

	}

	@Test(priority = -1, enabled = true, dataProvider = "login")
	public void tc1(String s1, String s2) throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), s1);
		fill(l.getTxtPass(), s2);
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

	}

	@DataProvider(name = "login")
	private Object[][] loginDataProvider() throws IOException {
		return new Object[][] {
			{getData(1, 0),getData(1, 3)},
			{getData(2, 0),getData(2, 3)},
			{getData(3, 0),getData(3, 3)},
			{getData(4, 0),getData(4, 3)}};
			
	}

	@BeforeMethod
	public void startTime() throws InterruptedException {
		loadUrl("https://www.etsy.com/");
		WebElement loginpage = driver
				.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
		btnClick(loginpage);
		Thread.sleep(3000);
		Date d = new Date();
		System.out.println(d);

	}

	@AfterMethod
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}


}
