package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowsAndColumns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");

		// To get the count of number of rows

		List<WebElement> rows1 = driver.findElements(By.xpath("//div[@class='render']//tr"));
		int rows01 = rows1.size();
		List<WebElement> rows2 = driver.findElements(By.xpath("//div[@class='related-pages']//tr"));
		int rows02 = rows2.size();
		int rows = rows01 + rows02;
		System.out.println('\n' + "1. Total  number of rows : " + rows);

		// To get the count of number of columns

		List<WebElement> columns1 = driver.findElements(By.xpath("//div[@class='render']//th"));
		int columns01 = columns1.size();
		List<WebElement> columns2 = driver.findElements(By.xpath("//div[@class='related-pages']//th"));
		int columns02 = columns2.size();
		int columns = columns01 + columns02;
		System.out.println('\n' + "2. Total  number of columns : " + columns);
	}
}