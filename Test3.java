package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\Selenium\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
//	String TextOp = driver.findElement(By.id("checkBoxOption1")).getText();
		 String TextOp=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
	System.out.println(TextOp);
    WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));

    Select s=new Select(dropdown);

    s.selectByVisibleText(TextOp);

    driver.findElement(By.name("enter-name")).sendKeys(TextOp);

    driver.findElement(By.id("alertbtn")).click();

 String text=  driver.switchTo().alert().getText();

 if(text.contains(TextOp))

 {

System.out.println("Hello Option1, share this practice page and share your knowledge");

 }

 else

System.out.println("Something wrong with execution");

}
		
		

	}


