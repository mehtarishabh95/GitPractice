import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/downloads/");
		WebElement ele = driver.findElement(By.xpath("//p[text()='Selenium Server (Grid)']"));
		System.out.println(driver.getTitle());
		System.out.println(ele.getText());
		driver.close();

	}

}
