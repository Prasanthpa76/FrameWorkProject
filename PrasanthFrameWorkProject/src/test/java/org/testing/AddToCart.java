package org.testing;

import java.awt.AWTException;
import java.io.IOException;

import org.baseclass.BaseXlFill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToCart extends BaseXlFill {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		launchChrome();
		WinMax();
		loadUrl("https://www.etsy.com/");
		printTitle();
		printCurrentUrl();

		WebElement searchbox = driver.findElement(By.id("global-enhancements-search-query"));
		String u = getData(6, 0);
		System.out.println(u);
		fill(searchbox, u);

		WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\"gnav-search\"]/div/div[1]/button[2]"));
		btnClick(searchbtn);

		WebElement prd = driver.findElement(By.xpath("(//div[@class='height-placeholder'])[1]"));
		btnClick(prd);

		windowsHandling();

		WebElement selectcolour = driver.findElement(By.id("variation-selector-0"));
		btnClick(selectcolour);
		down();
		down();
		enter();

		sleep();

		WebElement selectsize = driver.findElement(By.id("variation-selector-1"));
		btnClick(selectsize);
		down();
		enter();

		sleep();

		WebElement selectcount = driver.findElement(By.id("listing-page-quantity-select"));
		btnClick(selectcount);
		down();
		enter();

		sleep();

		WebElement addtobasket = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnClick(addtobasket);

	}

}
