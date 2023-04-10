package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		
		driver.findElement(By.id("checkBoxOption1")).click();
	
		//System.out.println(driver.findElements(By.xpath("//input[@type='CheckBox']")).size());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
