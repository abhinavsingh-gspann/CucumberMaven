package factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverFactory {
	
	static ThreadLocal<WebDriver> driverTL = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		if (driverTL.get() == null) {
			driverTL.set(new ChromeDriver());
		}
		return driverTL.get();
	}

	public static void quitDriver() {
		driverTL.get().quit();
		driverTL.remove();
	}
	
	

}
