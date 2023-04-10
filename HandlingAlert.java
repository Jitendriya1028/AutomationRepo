package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		
		String text = "Jeet";

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.id("confirmbtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

	}



	}


