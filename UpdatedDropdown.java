package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * 
		 * }
		 */
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}



/*
 * System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
 * 
 * WebDriver driver =new ChromeDriver();
 * 
 * driver.get("http://spicejet.com"); //URL in the browser
 * 
 * Assert.assertFalse(driver.findElement(By.cssSelector(
 * "input[id*='SeniorCitizenDiscount']")).isSelected());
 * 
 * //Assert.assertFalse(true);System.out.println(driver.findElement(By.
 * cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
 * 
 * driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).
 * click();
 * 
 * System.out.println(driver.findElement(By.cssSelector(
 * "input[id*='SeniorCitizenDiscount']")).isSelected());
 * 
 * Assert.assertTrue(driver.findElement(By.cssSelector(
 * "input[id*='SeniorCitizenDiscount']")).isSelected());
 */

	}


