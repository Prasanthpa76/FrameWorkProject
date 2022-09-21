package org.testing;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BaseXlFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.baseclass.BasePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgOrder extends BaseXlFill {
	
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();

	}

	@AfterClass
	public void browserClose() {
		closeBrowser();

	}

	@Test(priority = -1,enabled=false)
	public void tc1() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(3, 0));
		fill(l.getTxtPass(), getData(3, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

	}

	@Test(priority = -3,invocationCount=2)
	public void tc3() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(2, 0));
		fill(l.getTxtPass(), getData(2, 3));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

	}
    @Parameters({"NAME","CITY"})
	@Test(priority = -2)
	public void tc2(@Optional("prasanth")String s1,@Optional("trichy")String s2) throws IOException, InterruptedException {
    	BasePojo l = new BasePojo();
		fill(l.getTxtUser(), s1);
		fill(l.getTxtPass(), s2);
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);

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
