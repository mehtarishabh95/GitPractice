import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9782045063");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("r2");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.findElement(By.name("q")).sendKeys("pho");
		
		Thread.sleep(3000);
		 List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		 System.out.println(ele1.size());
		 for(WebElement b:ele1)
		 {
			 System.out.println(b.getText());
		 }
		 driver.close();

	}

}
