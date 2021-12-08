package fileDownload;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownload {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setup() {
		
		//Create new directory with random name
		folder=new File(UUID.randomUUID().toString());
		folder.mkdirs();
		
	}

	@Test
	public void downloadFile() throws InterruptedException {
		//Disable popup and change default directory path
		Map<String, Object> prefs=new HashMap<>();
		prefs.put("profile.default_content_settings", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		//Set experimental options through ChromeOptions with above preferences
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		//DesireCapabilities with chromeoptions capabilities
//		DesiredCapabilities ds= DesiredCapabilities.chrome();
//		ds.setCapability(ChromeOptions.CAPABILITY, options);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Devtools\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver(ds);
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//*[@id='content']/div/a[1]")).click();
		
		Thread.sleep(5000);
		//Folder is not empty
		File[] listofFiles=folder.listFiles();
		Assert.assertTrue(listofFiles.length>0);
		
		//File is not empty
		for (File file: listofFiles) {
			Assert.assertTrue(file.length()>0);
		}
		
	}
	
	@AfterTest 
	public void tearDown() {
		//Delete all files from the folder
		for (File file:folder.listFiles()) {
			file.delete();
		}
		//Delete folder
		folder.delete();
	}
}
