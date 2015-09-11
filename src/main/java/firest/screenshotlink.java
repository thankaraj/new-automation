package firest;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class screenshotlink {

	WebDriver driver;

	@Test	
	public void man() throws IOException, InterruptedException{ 
		
	 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");


	List <WebElement>list=driver.findElements(By.tagName("a"));
	String []s=new String[list.size()];
	int ss=list.size();
	System.out.println(ss);
	int i=0;
	for( WebElement link:list){
		
		s[i]=link.getText();
		i++;
	}
	for(String sd:s){
		driver.findElement(By.partialLinkText(sd)).click();
		
		Thread.sleep(1000);
		screen(sd );
		driver.navigate().back();
	}}
		



	public void screen(String s) throws IOException{
		System.out.println(s);


		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	   FileUtils.copyFile(scrFile, new File("D:\\screenshotlink\\"+s+".png"));
	}}



