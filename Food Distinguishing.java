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
     
     String[] food = {"C:\\Users\\AnthonyPC\\Desktop\\food inputs\\red pears.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\beans that look like kidney.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\cake that looks like acorn.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\carrot in soup.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog cake.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog with apple.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog with burger 1.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog with burger 2.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog with cake 1.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\dog with cake 2.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\eggplant.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\eggplant 2.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\fish cake.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\muffin that looks like dog.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\muffin that looks like hamster.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\paprika.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\popsicle.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\purple banana.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\salad that looks like parrot.jpg",
    		 "C:\\Users\\AnthonyPC\\Desktop\\food inputs\\sofa that looks like bread.jpg",
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
