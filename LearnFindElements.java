package week4.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
	
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(" http://www.amazon.in ");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13",Keys.ENTER);	
	List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
	for (WebElement eachmobileNames : mobileNames) {
		System.out.println(eachmobileNames.getText());
	}	
}
}