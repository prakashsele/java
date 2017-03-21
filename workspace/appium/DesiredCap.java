package com.apm;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class DesiredCap {

	@Test
	public void test() throws MalformedURLException {
		  //Write the app name of apk file which we have in our system.
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");

		cap.setCapability(MobileCapabilityType.APP, "");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElementById("enter the id name from app").click();
		int s= driver.findElements(By.className("Enter the class name from the app")).size();
		//there are 4 boxes i.e size in the app
		System.out.println(s);
		List<WebElement>a=driver.findElements(By.className("enter the class name"));
		a.get(0).sendKeys("Appium"); // firstname printing
		a.get(1).sendKeys("browser");// lastname printing
		a.get(2).sendKeys("Appium@gmail.com"); // email id printing
		a.get(3).sendKeys("password");  // password printing
		driver.findElementById("Enter the Id from the app").click();
		
	}

}
