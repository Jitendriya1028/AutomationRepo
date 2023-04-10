package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Jitu");
		driver.findElement(By.name("email")).sendKeys("jeet@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Jeet1234");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select gender = new Select(Dropdown);

		gender.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.name("bday")).sendKeys("05/05/1999");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
