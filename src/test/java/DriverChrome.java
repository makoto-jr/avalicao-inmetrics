import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome {
	
	private static WebDriver driver;
	
	private DriverChrome() {};
	
	public static WebDriver getDriver() {
		
		// Verificando se o driver já foi instanciado
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}