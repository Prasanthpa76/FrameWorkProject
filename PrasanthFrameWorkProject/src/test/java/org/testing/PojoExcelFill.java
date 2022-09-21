package org.testing;

import java.io.IOException;

import org.baseclass.BasePojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoExcelFill extends BasePojo {

	public static void main(String[] args) throws IOException {
		launchChrome();
		WinMax();
		loadUrl("https://www.etsy.com/");
		printTitle();
		printCurrentUrl();

		WebElement loginpage = driver
				.findElement(By.xpath("//*[@id=\"gnav-header-inner\"]/div[4]/nav/ul/li[1]/button"));
		btnClick(loginpage);

		BasePojo l = new BasePojo();
		fill(l.getTxtUser(), getData(1, 0));

		WebElement t = l.getTxtPass();
		fill(t, getData(1, 3));

		WebElement btn = l.getBtnLogin();
		btnClick(btn);

	}

}
