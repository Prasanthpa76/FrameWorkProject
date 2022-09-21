package org.testing;

import java.io.IOException;

import org.baseclass.BaseXlFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelFill extends BaseXlFill {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		WinMax();
		loadUrl("https://www.etsy.com/");
		printTitle();
		printCurrentUrl();

		WebElement loginpage = driver
				.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
		btnClick(loginpage);

		Thread.sleep(3000);

		WebElement user = driver.findElement(By.id("join_neu_email_field"));
		String u = getData(1, 0);
		System.out.println(u);
		fill(user, u);

		WebElement pass = driver.findElement(By.id("join_neu_password_field"));
		String p = getData(1, 3);
		System.out.println(p);
		fill(pass, p);

		WebElement btn = driver.findElement(By.name("submit_attempt"));
		btnClick(btn);
	}

}
