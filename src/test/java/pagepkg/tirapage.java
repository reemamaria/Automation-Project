package pagepkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tirapage {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div/a")
	WebElement skinmenu;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/div/div/div[4]/div/div[2]/div[1]/a")
	WebElement lipbalm;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div/div/div[4]/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[5]/a/div/div[1]/div[2]/div[3]")
	WebElement lipbalm_pdt;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[2]/div/div/div[2]/div/button")
	WebElement addtobag_btn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/button[2]")
	WebElement quatity_incr;
	
	@FindBy(xpath="//*[@id=\"search\"]")
	WebElement search_bar;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div/div/div[3]/div/div[2]/div[1]/div/picture/img")
	WebElement searchitem;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[1]/div/div[4]/div/div/div/div[2]/div[2]/a/div")
	WebElement pdtsize;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[3]/div/div[2]/div[2]/div/button/span")
	WebElement shampooadd_btn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div[3]/a/div[1]/img")
	WebElement cart_btn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[4]/div/div/div/div/div/div[1]/div/div[2]/div[5]/div/div/div/button")
	WebElement checkout_btn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[3]/div/div/div[1]/div/a/img")
	WebElement logoclick;
	
	@FindBy(xpath="//*[@id=\"1-imageCarousel\"]/div/div[2]/div/div[2]/div[2]/a/picture/img")
	WebElement scroll_element;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[6]/div/div[2]/div/div[2]/div[3]/div[2]/div[7]/a")
	WebElement pdt_last;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[4]/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/a/div/div[1]/div[1]/div[1]/div/div/div/img")
	WebElement wish_symbol;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[4]/div/div/div/div/div/div[1]/div/div/div[3]/div/div[3]/div/div[2]/div[3]/div/div/button")
	WebElement wishlist_add;
	
	public  tirapage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addtocart()
	{
		Actions act=new Actions(driver);
		act.moveToElement(skinmenu).perform();
		
		lipbalm.click();
		lipbalm_pdt.click();
		
		
	}
	
	public void windowHandle()
	{
		String parentwindow=driver.getWindowHandle();
		Set<String>allwindowsHandle=driver.getWindowHandles();
		for(String handle:allwindowsHandle)
		{
			
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				
				driver.switchTo().window(handle);
				addtobag_btn.click();
				quatity_incr.click();
			   driver.navigate().back();
				
						
				
				
				
			}
		}
	}
	
	public void searchitem()
	{
		search_bar.sendKeys("shampoo");
		
		searchitem.click();
		pdtsize.click();
		shampooadd_btn.click();
		cart_btn.click();
		checkout_btn.click();
		logoclick.click();
		
		
	}
	
	
	
	public void scrollPage()
	{
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", scroll_element);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		pdt_last.click();
		wish_symbol.click();
		
		
		

		
		}
	
	
}

