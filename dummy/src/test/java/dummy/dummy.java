package dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v129.page.model.LaunchHandler;
import org.testng.annotations.Test;

public class dummy {

	@Test
	public  void Launchbrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
