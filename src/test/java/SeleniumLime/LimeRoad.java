package SeleniumLime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LimeRoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\eclipse-workspace\\Lime_RoadProject\\chrome\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("chrome");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.limeroad.com/");
	}

}
