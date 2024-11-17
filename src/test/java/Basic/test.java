package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String titl=driver.getTitle();
		System.out.println(titl);
		
		
	String url=	driver.getCurrentUrl();
    System.out.println(url);
    driver.close();
		
//		driver.navigate().to("https://www.youtube.com/");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
		
	
	
	}

}
