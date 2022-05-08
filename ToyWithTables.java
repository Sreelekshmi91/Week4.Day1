package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.leafground.com/pages/table.html");

		// To get the count of number of Rows

		List<WebElement> rows1 = driver.findElements(By.xpath("//table//tr"));
		int rows = rows1.size();
		System.out.println('\n' + "1. Total  number of Rows : " + rows);

		// To get the count of number of Columns

		List<WebElement> columns2 = driver.findElements(By.xpath("//table//th"));
		int columns02 = columns2.size();
		System.out.println('\n' + "2. Total  number of columns : " + columns02);

		// To get the progress value of 'Learn to interact with Elements'

		List<WebElement> Elements = driver.findElements(By.xpath("//table//tr"));
		System.out.println('\n' + "3. The progress value of 'Learn to interact with Elements is : " + '\n');
		for (int i = 2; i < Elements.size() - 1; i++) {
			System.out.println(Elements.get(i).getText());
		}

		// To check the vital task for the least completed progress.

		driver.findElement(By.xpath("(//input[@name='vital'])[5]")).click();
		List<WebElement> vitaltask = driver.findElements(By.xpath("//table//tr"));
		System.out.println('\n' + "4. The vital task for the least completed progress is : " + '\n');
		for (int i = 5; i < vitaltask.size(); i++) {
			System.out.println(vitaltask.get(i).getText());
		}
	}
}