import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjw7p6aBhBiEiwA83fGuiTSIyn7xT4KuqCeGv4Prltw7bTA2l5CfyGcG06GXnGCH8JIS59ptRoCa9YQAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Women'])[1]")).click();
		String t=driver.getTitle();
		if(t.equals("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
