package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://www.leafground.com/pages/table.html");
		
		WebElement elementTable = driver.findElement(By.xpath("//table"));
		List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < cols.size(); j++) {
			System.out.println(cols.get(j).getText());
			
		}
		}
		}
}

