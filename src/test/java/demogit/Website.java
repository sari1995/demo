package demogit;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Website 
{
	
@Test
public  void xyz() {
	
	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.chromedriver().setup();
	WebDriver web = new ChromeDriver();
	web.manage().window().maximize();
	web.get("https://www.google.com/");
	web.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	
	
	
}
}
