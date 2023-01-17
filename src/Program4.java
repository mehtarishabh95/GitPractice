import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/?utm_source=admitad_846&utm_campaign=86827111c06603818f6b1fd4863b83ed&utm_content=admitad_846&publisher_id=586854");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		
	
		a.moveToElement(signin).perform();
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("userName")).sendKeys("9782045063");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		Thread.sleep(3000);

		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//img[@class='wooble'])[4]")).click();
				
		

	}

}
