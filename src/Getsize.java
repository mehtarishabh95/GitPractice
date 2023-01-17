import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	
		WebElement ele1 = driver.findElement(By.id("email"));
	 	WebElement ele2 = driver.findElement(By.id("pass"));
	 	System.out.println(ele1.getSize());
	 	System.out.println(ele2.getSize());
	 	Dimension s = ele1.getSize();
	 	System.out.println(s.getHeight() +"height");
	 	System.out.println(s.width +"width");
	 	driver.close();
	}

}
