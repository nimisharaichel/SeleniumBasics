import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\ChromDriver\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.amazon.com/");
		   driver.manage().window().maximize();
		   WebElement cssSearchField=driver.findElement(By.cssSelector("#twotabsearchtextbox"));//using css selector locator
		   cssSearchField.sendKeys("Dress");
		   
		   
		  // driver.get("https://www.amazon.com/");
		  // driver.manage().window().maximize();
		   //WebElement forgotLink=driver.findElement(By.linkText("Forgotten password?"));
		   //WebElement forgotLink=driver.findElement(By.partialLinkText("Forgotten password"));
		  // WebElement forgotLink=driver.findElement(By.tagName("select"));
		  // forgotLink.click();
	}

}
