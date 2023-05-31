package Com_Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;
	  static Actions a;
	  static Robot r;
	  static JavascriptExecutor js;

		public static void  browserLauncher(String url){
			WebDriverManager.chromedriver().setup();
			ChromeOptions c=new ChromeOptions();
			c.addArguments("chrome");
	         driver=new ChromeDriver(c);
	         driver.manage().window().maximize();
	         driver.get(url);
		}
		public static void geturl(String s ) {
			driver.get(s);
			}
		
		public static void windowmax() {
			driver.manage().window().maximize();
		}

		public static void title() {
			driver.getTitle();
		}
		
		public static void currenturl() {
			driver.getCurrentUrl();
		}
		//screen shot
		public static void screenshot(String st) throws IOException {
		    TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
		    File des=new File("C:\\Users\\Dinesh\\eclipse-workspace\\Nykaa\\screenshot");
		    FileHandler.copy(src,des);
		    }
//		public static void click() {
//			click();
//		}
		
			public static void dropdown(WebElement e, String option,String value) {
				Select s=new Select(e);
				if (option.equalsIgnoreCase("index")) {
					
					//int o=Integer.parseInt(v2);
					s.selectByIndex(Integer.parseInt(value));
				}
				
				else if (option.equalsIgnoreCase("value")) {
					s.selectByValue(value);
				}
				else if (option.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);
					}
				}
			
			   public static void clickElement(WebElement e) {
				if(e.isDisplayed()){
				e.click();
				}
						
			}

			public static void inputValues(WebElement e, String s) {
				if(e.isDisplayed()) {
					e.sendKeys(s);
				}
			}

			//nagative//

			public static void navigateto(String url) {
				driver.navigate().to(url);

			}

			public static void backn() {
				driver.navigate().back();

			}

			public static void refresh() {
				driver.navigate().refresh();
			}

			public static void forward() {
				driver.navigate().forward();

			}
//close nd quit
			public static void close() {
				driver.close();

			}

			public static void quit() {
				driver.quit();
	      }
			
			
			public static  String Scanner() {
				java.util.Scanner s=new Scanner(System.in);
				System.out.println("Enter a OTP");
              String otp=s.next();
              return otp;
				
			}
			//sendkeys
			public static void gettext(WebElement e) {
			e.getText();
			}
			
			public static void sendkey(WebElement e,String value ) {
				if(e.isDisplayed()) {
					e.sendKeys(value);
				}
			}	
			
			public static void getsize(WebElement name) {
				name.getSize();
			}
			public static void getattribute(String value, WebElement name) {
				System.out.println(name.getAttribute(value));
			}
			public static void get_text(WebElement name) {
				System.out.println(name.getText());
			}
			public static void enable(WebElement name) {
				name.isEnabled();
			}
			//Actions
			public static void Mouseactionclick(WebElement element) {
				a = new Actions(driver);
				a.click(element).build().perform();
			}
			
			public static void Mouseactioncontextclick(WebElement element) {
				a = new Actions(driver);
				a.contextClick(element).build().perform();
			}
			
			public static void Mouseactionmovetoelement(WebElement element) {
				a = new Actions(driver);

				a.moveToElement(element).build().perform();
			}
			
			public static void Mouseactiondraganddrop(WebElement element,WebElement element1) {
				a = new Actions(driver);
				a.dragAndDrop(element, element1).build().perform();
					
			}
			
			public static void Mouseactiondoubleclick(WebElement element) {
				a = new Actions(driver);
				a.doubleClick(element).build().perform();
			}
			
			//alert
			public static void simpleAlert() {
				driver.switchTo().alert().accept();
			}
			public static void confirmAlert(String a) {
				if (a.equals("accept")) {
					driver.switchTo().alert().accept();
				}
			else if (a.equals("dismiss")) {
				driver.switchTo().alert().dismiss();
				
			}
		}
			public static void promtAlert(String input, String option) {
				
				 Alert a=driver.switchTo().alert();
				 a.sendKeys(input);
				 if(option.equals("accpet")) {
					 a.accept();
				 }
				 else if (option.equals("dismiss")) {
					 a.dismiss();
					}
				 }
			//wait and explicit
			public static void implicit() {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			}
			public static void explicit(WebElement name) {
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(name));
				
			}
			
				//swich window
			public static void windowswitch(int index) {
				Set <String> tabidset =	driver.getWindowHandles();
				List <String> id_list = new LinkedList<>(tabidset);
				String string = id_list.get(index);
				driver.switchTo().window(string);
				}				
			
			//windowhandles
			public static void getwindowsize(int i) {
				//driver.switchTo().window("swtich window");
				int obj=driver.getWindowHandles().size ();
				System.out.println("window count : "+ obj );
				
			}
			
			//windowhandle
			public static void windowhandle() {
				System.out.println("Unique Id: " + driver.getWindowHandle());
				
			}
			
			//javaexecutorclick
			public static void jsSendkeys(String txtbox, WebElement target) {
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('value','" + txtbox + "')", target);
			}
			
			public static void jsexecutorclick(WebElement element) {
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();",element);
			}
			public static void executeJavaScript(String scriptToExecute) {
				 js = (JavascriptExecutor) driver;
				js.executeScript(scriptToExecute);
			}
			
			public static void executeJavaScriptt(String scriptToExecute,WebElement element) {
				 js = (JavascriptExecutor) driver;
				js.executeScript(scriptToExecute,element);
			}
			
			
			//scroll
			public static void scrollup(String value) {
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scroll("+ value +",0)", "");
			}
			public static void scrolldown(String value) {
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,"+ value +")", "");
				
			}
			//frames
			public static void frameindex(int index) {
				driver.switchTo().frame(index);
			}
			public static void frameid(String id) {
				driver.switchTo().frame(id);
			}
			public static void frameByElement(WebElement element) {
				driver.switchTo().frame(element);
			}
			public static void frame_exit() {
				driver.switchTo().defaultContent();
			}
          //robot
			public static void robot(String value) throws Throwable {
				Robot r= new Robot();
				if (value.equalsIgnoreCase("up")) {
					r.keyPress(KeyEvent.VK_PAGE_UP);
					r.keyRelease(KeyEvent.VK_PAGE_UP);
				}else if (value.equalsIgnoreCase("down")) {
					r.keyPress(KeyEvent.VK_PAGE_DOWN);
					r.keyRelease(KeyEvent.VK_PAGE_DOWN);
				}else if (value.equalsIgnoreCase("left")) {
					r.keyPress(KeyEvent.VK_LEFT);
					r.keyRelease(KeyEvent.VK_LEFT);
				}else if (value.equalsIgnoreCase("right")) {
					r.keyPress(KeyEvent.VK_RIGHT);
					r.keyRelease(KeyEvent.VK_RIGHT);
				}else if (value.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
					}
			}

