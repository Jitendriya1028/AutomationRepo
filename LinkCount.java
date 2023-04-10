package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
	System.out.println(	driver.findElements(By.tagName("a")).size());
	 WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columndriver.findElements(By.tagName("a")).size());
	
	// click on each link in the column and check if the pages are opening-
	for(int i =1;i<columndriver.findElements(By.tagName("a")).size();i++) {
		String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
		Thread.sleep(2000);
		
	}
	
	//Get title of all the open tab 
	
	 Set<String> titleOfTab = driver.getWindowHandles();
	Iterator<String> it = titleOfTab.iterator();
	
	while(it.hasNext()) {
		
		driver.switchTo().window(it.next());
		System.out.print(driver.getTitle());
	}

	}

}
