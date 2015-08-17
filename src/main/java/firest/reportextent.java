package firest;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.LogStatus;

	public class reportextent {
		 private ExtentReports extent = ExtentReports.get( reportextent.class);
		 WebDriver driver;
		    @BeforeClass
		    public void beforeClass() {
		        extent.init("D:\\TestNGExample.html", true);
		        extent.startTest("My First Test", "Sample description");
		        driver=new FirefoxDriver();
		        driver.manage().window().maximize();
		        extent.log(LogStatus.INFO,"Browser is up " );
		    }
		    
		    @Test
		    public void testOne() {
		       driver.get("http://www.google.com");
		        extent.log(LogStatus.INFO, "Details");
		        String ss=driver.getTitle();
		        extent.log(LogStatus.INFO, "Details");
		        Assert.assertTrue(ss.contains("Google"));
		        extent.log(LogStatus.PASS,"condition passed");
		        extent.attachScreenshot("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.JPEG");
		        
		    }
		    
		   
		    
		    @AfterTest
		    public void afterTest() {
		        extent.endTest();
		    }

	}

	

