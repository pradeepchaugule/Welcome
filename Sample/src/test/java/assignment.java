import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment {

	@Test(priority=0)
	public void login() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pradeep\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");	
		driver.manage().window().maximize();
		
		


		//driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter prependTop5 appendBottom40']/a")).click();
		Thread.sleep(1000);
		List<WebElement>  list=driver.findElements(By.xpath("//ul[@class='fswTabs latoBlack greyText']/li"));
		list.get(0).click();

		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Mumbai,India");
		
		List<WebElement>  list1=driver.findElements(By.xpath("//div[@class='calc60']"));
		list1.get(0).click();
	
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Pune,India");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]")).click();
		//list2.get(0).click();
	}

}
