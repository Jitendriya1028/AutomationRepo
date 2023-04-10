package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("T-Shirt").doubleClick().perform();
		a.moveToElement(driver.findElement(By.id("nav-search-submit-button"))).click().build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}
}























