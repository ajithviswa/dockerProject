package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firstTest {
  @Test
  @Parameters({"OS", "browser"})
  public void f(String os, String br) {
//	  ChromeDriver driver = new ChromeDriver();
	  WebDriver driver = null;
	  switch(br.toLowerCase()) {
	  case "chrome": driver=new  ChromeDriver();
	  }
	 
		driver.get("https://google.com");
		System.out.println("Browser opened the url");
		driver.close();
		driver.quit();
  }
}
