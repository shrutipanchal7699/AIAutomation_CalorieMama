import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  

public class Automation {
	public static void main(String[] args) throws InterruptedException {  
	      
        // System Property for Chrome Driver   
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaya\\Desktop\\chromedriver.exe");  
          // Instantiate a ChromeDriver class.     
     WebDriver driver=new ChromeDriver();  
       
        // Launch Website  
     driver.navigate().to("https://caloriemama.ai/api");  
       
      //Maximize the browser  
       driver.manage().window().maximize();  
       
       //Scroll down the webpage by 5000 pixels  
//     JavascriptExecutor js = (JavascriptExecutor)driver;  
//     System.out.println(driver.getTitle());
     WebElement button = driver.findElement(By.xpath("//*[@id=\"cm_api-fullpage\"]/div[1]/div/div/div[1]/div/a"));
     button.click();
     
     File folder = new File("C:\\Users\\shaya\\Desktop\\CMPE 187 Automation\\angle");
     File[] foodList = folder.listFiles();
     
     int counter = 1;
     
     for(int i = 0; i< foodList.length; i++)
     {
         if(i % 2 == 0)
         {
             System.out.println("Angle test case: " + counter);
             counter++;
         }
//         System.out.println("Angle test case: " + (i+1));
         if (foodList[i].isFile()) 
         {
            String foodImage = foodList[i].getName();
            String foodPath = "C:\\\\Users\\\\shaya\\\\Desktop\\\\CMPE 187 Automation\\\\angle\\" + foodImage;
            System.out.println("Input: " + foodList[i].getName());
            WebElement upload = driver.findElement(By.className("file-upload"));
            upload.sendKeys(foodPath);
            Thread.sleep(2000);
            upload.clear();
            if((driver.findElements(By.className("food-item")).size() == 0))
            {
                   System.out.println("Result: Food not recognized");
                   System.out.println("");
                   continue;
            }
            WebElement foodName = driver.findElement(By.className("item-name"));
            WebElement serving = driver.findElement(By.className("serving-size"));
            System.out.println("Result: " + foodName.getText() + " " + serving.getText());
            System.out.println("");
        }   
     }
 }  

} 

