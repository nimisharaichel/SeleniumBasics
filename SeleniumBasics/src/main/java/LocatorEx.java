import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromDriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.amazon.com/");
		   driver.manage().window().maximize();
		  // WebElement.searchfield=driver.findElement(By.className("field-keywords"));
		   WebElement searchfield=driver.findElement(By.name("field-keywords"));
		   searchfield.sendKeys("watch");
		   WebElement dropDown=driver.findElement(By.className("nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"));
		   dropDown.click();
		  //searchfield.click();
		  WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		  driver.get("https://www.flipkart.com/");
		  
		  //driver.findElement(By.className("_2KpZ6l _2doB4z"));
		  
		  //Or
		   
		//  WebElement.closebutton=driver.findElement(By.className("_2KpZ6l _2doB4z"));
	}

}
