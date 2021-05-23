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
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnthonyPC\\Documents\\chromeDriver\\chromedriver.exe");  
     WebDriver driver=new ChromeDriver();  
     driver.navigate().to("https://caloriemama.ai/api");  
     driver.manage().window().maximize();  
     WebElement button = driver.findElement(By.xpath("//*[@id=\"cm_api-fullpage\"]/div[1]/div/div/div[1]/div/a"));
     button.click();
     
     String[] food = {"C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\baby head that looks like kiwi.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\cartoon donut.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\cat.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\chicken live.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\clouds.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\cow.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\dogfood.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\dogs that look like fried chicken.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\donut drawing.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\horse.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\ivy.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\live fish.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\mountain.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\mouse that looks like egg.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\mud.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\pig.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\rocks that look like popcorn.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\sofa.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\white paint.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\non food inputs\\yellow sticky notes.jpg",
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
