package automation;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  

public class automation {
	public static void main(String[] args) throws InterruptedException 
	{     
    
     //instead of the *** as the second parameter below, insert the path where your chromedriver.exe is installed.
     System.setProperty("webdriver.chrome.driver", "***");  
		
     WebDriver driver=new ChromeDriver();  
     driver.navigate().to("https://caloriemama.ai/api");  
     driver.manage().window().maximize();  
     WebElement button = driver.findElement(By.xpath("//*[@id=\"cm_api-fullpage\"]/div[1]/div/div/div[1]/div/a"));
     button.click();
		
     //all the paths for your photos as individual elements in the array.
     String[] food = {
             };
     
     for(int i = 0; i < food.length; i++)
     {
         System.out.println("Test case: " + (i+1));
         WebElement upload = driver.findElement(By.className("file-upload"));
         upload.sendKeys(food[i]);
         Thread.sleep(5000);
         upload.clear();
         if((driver.findElements(By.className("food-item")).size() == 0))
         {
             System.out.println("Food not recognized");
             break;
         }
         WebElement text = driver.findElement(By.className("food-item"));
         System.out.println(text.getText());
     }
 }  

} 
