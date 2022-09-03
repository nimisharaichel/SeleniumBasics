import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// example for run time polymorphism
		
		//System.setProperty("webdriver.edge.driver","D:\\EdgeDriver\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		//System.setProperty("webdriver.gecko.driver","D:\\FirefoxDriver\\geckodriver.exe");
				//WebDriver driver=new FirefoxDriver();
				driver.get("https://www.meesho.com/");
				driver.manage().window().maximize();
				String title=driver.getTitle();
				System.out.println(title);
				String url=driver.getCurrentUrl();
				System.out.println("URL:"+url);
				driver.get(driver.getCurrentUrl());//refresh the browser site again of all pages comes in that website
	            // or// another code 
				System.out.println("url=" +url); 
				driver.get(url);

	}
	

}
