package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {
	@Test(description = "validate the list does not contain any duplicates")

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("  https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()= 'NSE Bulk Deals'])[1]")).click();
		List<WebElement> SecurityName = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		System.out.println('\n' + "1. Security Names : " + '\n');

		for (int i = 0; i < SecurityName.size(); i++) {
			System.out.println(SecurityName.get(i).getText());
		}
		List<WebElement> list = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));
		List<String> strings = new ArrayList<String>();
		for (WebElement Security : list) {
			strings.add(Security.getText());
		}
		// To ensure whether there are Duplicate Security Names
		System.out.println('\n' + "2. Checking for Duplicate Security Names : " + '\n');
		Set<String> set1 = new HashSet<String>();
		for (String name : strings) {
			if (!set1.add(name)) {
				System.out.println("Duplicate Found : " + " " + name);
			} else {
				System.out.println("No Duplicate : " + " " + name);
			}
		}
	}
}
