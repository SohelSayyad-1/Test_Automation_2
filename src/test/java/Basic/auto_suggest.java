package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class auto_suggest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement srch=driver.findElement(By.id("APjFqb"));        //(By.xpath("//textarea[@name='q']"));
	     srch.sendKeys("maven");
	     Thread.sleep(3000);
		
	     List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]//li"));
	     System.out.println(list.size());
	     
	     
	     for(int i=0;i<list.size();i++){
	    	 
	    	 String text=list.get(i).getText();
	    	 System.out.println(text);
	    	 	 
	         if(text.equals("maven dependency")){
	        	 
	        	list.get(i).click();
	        	Thread.sleep(3000);
	        	break;
	         }}
	      
	      

//	                                       for (int i=0;i<list.size();i++){
//	                                   
//	                               		String text=list.get(i).getText();
//	                               		System.out.println(text);
//	                               		
//	                               		if(text.equals("maven dependency")) {
//	                               			
//	                               			list.get(i).click();
//	                               			break;  
//	     
	
	
	}

}
