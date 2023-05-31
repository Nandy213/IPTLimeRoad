package com_StepDefinition;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Com.Pom.KurtasLR;
import Com.Pom.LimeRoadGS;
import Com.Pom.POM_Class;
import Com_Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tlh.ach.achs;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class Lime_Stepdefinition  extends BaseClass{
	POM_Class pom=new POM_Class(driver);
	LimeRoadGS lrgs=new LimeRoadGS(driver);
	KurtasLR klr=new KurtasLR(driver);
	public static WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions c=new ChromeOptions();
	    driver=new ChromeDriver(c);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
	}
	@When("Launch the Url")
	public void launch_the_url() throws InterruptedException {
		driver.get("https://www.limeroad.com/");
		Thread.sleep(5000);
		    
	}
	@When("Click the element to select shop women it navigate to women page")
	public void click_the_element_to_select_shop_women_it_navigate_to_women_page() throws InterruptedException {
//	Thread.sleep(1000);
//	jsexecutorclick(pom.getlr().getWomentab());
//		//clickElement(pom.getlr().getWomentab());
//		Thread.sleep(2000);
		
		
 	    WebElement womentab=driver.findElement(By.xpath("//*[@id=\"shopWomen\"]"));
		womentab.click();
		Thread.sleep(2000);

	
	   }

	@Given("Enter the profile page")
	public void enter_the_profile_page() throws InterruptedException {
		
//		clickElement(pom.getlr().getProfileclick());
//		Thread.sleep(2000);
//       
		WebElement profilepage=driver.findElement(By.xpath( "//*[@id=\"desktop_profile\"]/div[2]"));
        profilepage.click();
        Thread.sleep(2000);

      	}
	@When("Enter the login page")
	public void enter_the_login_page() throws InterruptedException {
		
//		clickElement(pom.getlr().getLoginclick());
//		Thread.sleep(1000);
		
		
    	WebElement inlog=driver.findElement(By.xpath("//*[@id=\"desktop_profile_expand\"]/div[1]/div[3]/a"));
    	inlog.click();
    	Thread.sleep(1000);

		
		}
	@When("Enter the moblie number")
	public void enter_the_moblie_number() throws InterruptedException {
		
//		sendkey(pom.getlr().getEntermobileno(), "6385699746");
//		Thread.sleep(9000);
	
		WebElement phoneno=driver.findElement(By.xpath("//*[@id=\"emph\"]"));
		phoneno.sendKeys("6385699746");
		Thread.sleep(9000);

		
	}
	@When("Click the next")
	public void click_the_next() throws InterruptedException {
		
//		clickElement(pom.getlr().getClicknexttab());
//		Thread.sleep(5000);
//		
		
		
		WebElement nexttab=driver.findElement(By.xpath("//*[@id=\"signinnewForm\"]/div[3]"));
		nexttab.click();
		Thread.sleep(5000);

		
    }

	@When("user  click the kurtas")
	public void user_click_the_kurtas() throws InterruptedException {
		
//		clickElement(pom.getlr().getKurtas());
//		Thread.sleep(3000);
		
		WebElement kurtas=driver.findElement(By.xpath("//div[@class=' dIb vB m01']"));
		kurtas.click();
		Thread.sleep(3000);

				
	}
	@When("user select the product for fill up your  cart")
	public void user_select_the_product_for_fill_up_your_cart() throws InterruptedException {
		
//		clickElement(pom.getlr().getSelectproduct());
//		Thread.sleep(3000);
		
	   WebElement selectproduct=driver.findElement(By.xpath("//*[@id=\"views\"]/div/div/div[2]/div[5]/a/span"));
	   selectproduct.click();
	   Thread.sleep(3000);

	  	}
	@When("user shivangini shehawat  product in addtocard")
	public void user_shivangini_shehawat_product_in_addtocard() throws InterruptedException {
		
//		clickElement(pom.getlr().getViewproduct());
//		Thread.sleep(1000);
		
	    WebElement ptaddtocard=driver.findElement(By.xpath(("//*[@id=\"views\"]/div[1]/div[2]/div/div[1]/div")));
	    ptaddtocard.click();
	    Thread.sleep(2000);

	    
//	    
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("agrument[0].scrollIntoView(true);",ptaddtocard);
//	    Thread.sleep(6000);
//		
	}
	@Then("click the element for addtocard")
	public void click_the_element_for_addtocard() throws InterruptedException {
		
//		clickElement(pom.getlr().getSelectsize());
//		Thread.sleep(4000);
//		clickElement(pom.getlr().getAddtocard());
//		Thread.sleep(6000);
		
	    WebElement size=driver.findElement(By.xpath("//*[@id=\"alSz\"]/div[4]"));
	    size.click();
	    Thread.sleep(4000);
		WebElement cardclick=driver.findElement(By.xpath("//div[@class='pR bs fs20 p05 pl12 dTc vT']"));
	    cardclick.click();
	    Thread.sleep(6000);
		
	}
}
	
	
   	