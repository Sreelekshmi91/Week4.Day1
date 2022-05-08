package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://erail.in/ ");

		WebElement StationFrom = driver.findElement(By.id("txtStationFrom"));
		StationFrom.clear();
		StationFrom.sendKeys("MDU", Keys.ENTER);

		WebElement StationTo = driver.findElement(By.id("txtStationTo"));
		StationTo.clear();
		StationTo.sendKeys("TPJ", Keys.ENTER);

		List<WebElement> trainnumber = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		List<WebElement> trainname = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		System.out.println("Train Number and Train Name");
		for (int i = 0; i < trainnumber.size(); i++) {
			System.out.println(trainnumber.get(i).getText() + " : " + trainname.get(i).getText());
		}
	}
}
