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
	
	WebDriverManager.edgedriver().setup();
	WebDriver web = new EdgeDriver();
	web.manage().window().maximize();
	web.get("https://www.google.com/");
	web.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	
	
	
}
}
