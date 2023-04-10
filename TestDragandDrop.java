package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/droppable/");
				driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
			WebElement Scr = driver.findElement(By.id("draggable"));
			WebElement trgt = driver.findElement(By.id("droppable"));
				 Actions ac = new Actions(driver);
				 ac.dragAndDrop(Scr, trgt).build().perform();
				 driver.switchTo().defaultContent();
				 

	}

	}


