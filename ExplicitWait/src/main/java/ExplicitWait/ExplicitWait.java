package ExplicitWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
		
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().setSize(new Dimension(1000,1000));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("sadhya bandhala");
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(((WebElement) ExpectedConditions.visibilityOfElementLocated(By.id("btn1"))).getText());
		
}


}