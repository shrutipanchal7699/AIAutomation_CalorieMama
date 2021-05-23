import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;  

public class QuantityCategory {
	public static void main(String[] args) throws InterruptedException {  
	      
        // System Property for Chrome Driver   
     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ATHENA\\Documents\\CMPE 187\\chromeDriver\\chromedriver.exe");  
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\chromedriver_win32\\chromedriver.exe");  
     
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
     
     String[] food = 
    	 	{
    	 	 "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\7chapatis.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\apple.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\basketOfCherries.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\bowlOfChips.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\bowlsOfChips.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\3bananaChips.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\9Nachos.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\bowlsOfChips.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\colourfull_salad_bowl.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\cookies.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\cubeOfChocolate.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\easy-chicken-fried-rice-recipe-2.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\friedChickenLegs.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\Fried-Rice-on-bowl-plate.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\Fruit-and-Berry-Salad1.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\Fruit-Salad-SWP-500x500.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\greenTea.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\halfCookie.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\hotChocolate.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\hotChocolateAndMarshmellows.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\instant-pot-white-rice-1200-1156.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\kettleAndCup.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\marshmellows.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\milk.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\oneChapati.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\oneNacho.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\orange.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\orangeJuice.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\plateOfNachos.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\potatoWedges.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\Punjabi-Chhole-2.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\Seasonal-Fruit-Salad-500x500.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\sliced.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\sliceOfCake.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\spoonOfYougurt.jpeg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\strawberriesAndBlueBerries.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\teaBag.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\twoSlicesOfCake.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\wholecake.jpg",
             "C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\yougurt.jpg"
             
             };
     System.out.println("\n\nCountability Category Testing");
     for(int i = 0; i< food.length; i++)
     {
         System.out.println("Quality Test case: " + (i+1));
//         System.out.println();
         
         Path path = Paths.get(food[i]);
         String fileName = path.getFileName().toString();
         System.out.println("Input: " + fileName);
         
         WebElement upload = driver.findElement(By.className("file-upload"));
         upload.sendKeys(food[i]);
         Thread.sleep(2000);
         upload.clear();
         if((driver.findElements(By.className("food-item")).size() == 0))
         {
             System.out.println("Result: Food not recognized");
             break;
         }
         WebElement text = driver.findElement(By.className("food-item"));
         System.out.println("Result: " + text.getText());
         System.out.println("");
     }
     
//     WebElement upload = driver.findElement(By.className("file-upload"));
////     upload.sendKeys("C:\\Users\\ATHENA\\Desktop\\CMPE 187 Automation\\beans0.jpeg");
//     upload.sendKeys("C:\\Users\\shrut\\OneDrive\\Desktop\\Spring 2021\\CMPE 187\\AutomationTestingTool\\7chapatis.jpg");
//     Thread.sleep(5000);
////     upload.submit();
//     upload.clear();
//     
//     WebElement text = driver.findElement(By.className("food-item"));
//     System.out.println(text.getText());
////     upload.sendKeys("C:\\Users\\ATHENA\\Desktop\\CMPE 187 Automation\\beans1.jpg");
////     upload.clear();
////     System.out.println(text.getText());
////     Thread.sleep(5000);
////     driver.navigate().to("https://caloriemama.ai/api");  
////     button.click();
////     upload.sendKeys("C:\\Users\\ATHENA\\Desktop\\CMPE 187 Automation\\beans1.jpeg");
//       
//      // Click on the Search button  


 }  

} 

