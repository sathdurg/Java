package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

WebDriver driver; 
	
	public void invokeBrower()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\Installation\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.get("https://www.google.com");
			driver.get("http://leaftaps.com/opentaps/control/main");
			/*
			 * driver.findElement(By.id("Username")).sendKeys("democsr");
			 * driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			 * driver.findElement(By.className("decorativeSubmit")).click();
			 * driver.findElement(By.linkText("CRM/SFA")).click();
			 */
			gserch();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void gserch() throws InterruptedException
	{
		try {
			driver.findElement(By.id("username")).sendKeys("democsr");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.xpath("//*[text()=\"Create Order\"]//preceding::li[22]")).click();
//			List<WebElement> findElements=driver.findElements(By.xpath("//*[text()=\"Create Order\"]//preceding::li[22]"));
			
			/*
			 * for (WebElement sat: findElements) { Dimension a=sat.getSize();
			 * System.out.println(a); System.out.println(sat); } //
			 * driver.findElement(By.xpath(
			 * "/html/body/div[6]/div/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]/span//preceding::a[1]"
			 * )).click();
			 */			/*
			 * driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
			 * Thread.sleep(20000); 
			 * driver.findElement(By.xpath(
			 * "/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
			 */
//			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		Sample obj1 = new Sample();
		obj1.invokeBrower();
//		obj1.gserch();
	}

}
