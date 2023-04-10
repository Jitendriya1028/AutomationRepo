package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOfWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://the-internet.herokuapp.com");
				driver.findElement(By.linkText("Multiple Windows")).click();
				driver.findElement(By.cssSelector("a[href*='windows']")).click();
				Set<String> windows = driver.getWindowHandles();
				 Iterator<String> it = windows.iterator();
				 String openNewWindow = it.next();
				 String newWindow = it.next();
				driver.switchTo().window(newWindow);
				System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());

				driver.switchTo().window(openNewWindow);

				System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());

	}

}
