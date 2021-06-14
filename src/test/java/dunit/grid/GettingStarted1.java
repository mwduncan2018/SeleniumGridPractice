package dunit.grid;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GettingStarted1 {
	@Test
	public void alphaTest() throws Exception {
		String url = "http://172.29.210.59:4444/wd/hub";
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.LINUX);
		WebDriver driver = new RemoteWebDriver(new URL(url), dc);
		driver.get("https://www.ultimateguitar.com");
		System.out.println("..." + driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();				
	}
}
