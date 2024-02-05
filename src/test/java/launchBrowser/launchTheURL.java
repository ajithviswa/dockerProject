package launchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchTheURL {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Browser opened the url");
		driver.close();
		driver.quit();
		}

}