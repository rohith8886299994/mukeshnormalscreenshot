package mukeshScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MukeshScreenClass 
{
	
	@Test
	public void captureScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.facebook.com");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8886299994");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshot/facebool.png"));
	
	driver.quit();
	
	
	}

}
