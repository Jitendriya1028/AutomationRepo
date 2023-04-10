package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://the-internet.herokuapp.com/");
				driver.findElement(By.linkText("Nested Frames")).click();
				driver.switchTo().frame("frame-top");
				driver.switchTo().frame("frame-middle");
				System.out.println(driver.findElement(By.id("content")).getText());

	}

}
