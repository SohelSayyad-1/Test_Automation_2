package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys("sohelsayyad");
		
		WebElement txt_pass=driver.findElement(By.id("pass"));
		txt_pass.sendKeys("1234");
		
		WebElement clk=driver.findElement(By.xpath("//*[@id='loginbutton']"));
		clk.click();
		
		
	}

}
