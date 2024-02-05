package launchBrowser;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {
  @Test
  public void f() {
	  ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		System.out.println("Browser opened the url");
		driver.close();
		driver.quit();
  }
}
