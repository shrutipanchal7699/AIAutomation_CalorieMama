package scripts;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  

public class PackagingAutomation {
	public static void main(String[] args) throws InterruptedException { 
		    // System Property for Chrome Driver   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATHENA\\Documents\\CMPE 187\\chromeDriver\\chromedriver.exe");  
		  // Instantiate a ChromeDriver class.     
		WebDriver driver=new ChromeDriver();  
		   
		    // Launch Website  
		driver.navigate().to("https://caloriemama.ai/api");  
		   
		 //Maximize the browser  
		  driver.manage().window().maximize();  
		   
		WebElement button = driver.findElement(By.xpath("//*[@id=\"cm_api-fullpage\"]/div[1]/div/div/div[1]/div/a"));
		button.click();
		 
		int counter = 1;
		 
		File folder = new File("C:\\Users\\ATHENA\\Desktop\\CMPE 187 Automation");
		File[] foodList = folder.listFiles();
		 
		for(int i = 0; i< 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("Packaging case: " + counter);
				counter++;
				System.out.println("Packaged");
			}
			if(i % 2 != 0)
			{
				System.out.println("Unpackaged");
			}	 			 
			if (foodList[i].isFile()) 
			{
				String foodImage = foodList[i].getName();
				String foodPath = "C:\\Users\\ATHENA\\Desktop\\CMPE 187 Automation\\" + foodImage;
				System.out.println("Input: " + foodList[i].getName());
				WebElement upload = driver.findElement(By.className("file-upload"));
				upload.sendKeys(foodPath);
				upload.clear();
				Thread.sleep(3000);
				if((driver.findElements(By.className("food-item")).size() == 0))
				{
				   	System.out.println("Result: Food not recognized");
				   	System.out.println("Fail");
				   	if(i % 2 != 0)
					{
						System.out.println("");
					}
				   	continue;
				}
				WebElement foodName = driver.findElement(By.className("item-name"));
				String foodNameString = foodName.getText();
				WebElement serving = driver.findElement(By.className("serving-size"));
				String servingString = serving.getText();
				System.out.println("Result: " + foodNameString + " " + servingString);
				
				if(i % 2 != 0)
				{
					System.out.println("");
				}
				
			//System.out.println("");
			}   
		}
	}  
} 

