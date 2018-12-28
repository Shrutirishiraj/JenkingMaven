package shruti.MavenShruti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverDemo {
	@Test
	public void demo() {
		String path = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}
}
