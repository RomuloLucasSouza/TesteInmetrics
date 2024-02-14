package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	 /*public Iframe(WebDriver driver) {
	        new WebDriverWait(driver, Duration.ofSeconds(3));
	    }*/
	    
	 public static void fecharIframe(WebDriver driver) {
	        try {
	            
	            WebElement iframe = driver.findElement(By.id("aswift_1"));
	            driver.switchTo().frame(iframe);

	            
	            WebElement botaoFechar = driver.findElement(By.id("dismiss-button"));
	            botaoFechar.click();

	         
	            driver.switchTo().defaultContent();
	        } catch (Exception e) {
	           
	            driver.switchTo().defaultContent();
	        }
	    }
		
	}