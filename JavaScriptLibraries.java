package week4.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptLibraries {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");

		// To get MarketShare Library

		List<WebElement> MarketShare = driver.findElements(By.xpath("(//div[@class='render']//tr[1])[2]//td"));
		System.out.println('\n' + "1. Market Share Library is : " + '\n');
		List<WebElement> MarketShare1 = driver.findElements(By.xpath("//div[@class='render']//th"));
		for (int i = 0; i < MarketShare.size(); i++) {
			System.out.println(MarketShare1.get(i).getText() + " : " + MarketShare.get(i).getText());
		}

		// To get Absolute Usage Library

		List<WebElement> AbsoluteUsage = driver.findElements(By.xpath("//div[@class='render']//tr[2]//td"));
		System.out.println('\n' + "2. Absolute Usage Library is : " + '\n');
		List<WebElement> AbsoluteUsage1 = driver.findElements(By.xpath("//div[@class='render']//th"));
		for (int i = 0; i < AbsoluteUsage.size(); i++) {
			System.out.println(AbsoluteUsage1.get(i).getText() + " : " + AbsoluteUsage.get(i).getText());
		}
	}
}