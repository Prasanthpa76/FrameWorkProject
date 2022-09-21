package org.testing;

import java.io.IOException;
import java.util.Date;

import org.baseclass.BasePojo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JunitOrder extends BasePojo {

	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();

	}

	@AfterClass
	public static void browserClose() {
		closeBrowser();

	}

	@Before
	public void startTime() throws InterruptedException {
		loadUrl("https://www.etsy.com/");
		WebElement loginpage = driver
				.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
		btnClick(loginpage);
		Thread.sleep(3000);
		Date d = new Date();
		System.out.println(d);

	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}

	// vallid suername and invalid password
	@Test
	public void tc1() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(1, 0));
		fill(l.getTxtPass(), getData(1, 3));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

	// invalid username valide password
	@Test
	public void tc3() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(2, 0));
		fill(l.getTxtPass(), getData(2, 3));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

	// invalide username invalide password
	@Ignore
	@Test
	public void tc2() throws IOException, InterruptedException {
		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(3, 0));
		fill(l.getTxtPass(), getData(3, 3));
		btnClick(getBtnLogin());
		Thread.sleep(2000);

	}

}
