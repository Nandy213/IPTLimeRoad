package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_Base.BaseClass;

public class LimeRoadGS extends BaseClass{

		WebDriver driver;
		public LimeRoadGS(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//*[@id=\"shopWomen\"]") 
	private WebElement womentab;
		
		@FindBy (xpath = "//*[@id=\"desktop_profile\"]/div[2]")
		private WebElement profileclick;
		
		@FindBy (xpath = "//*[@id=\"desktop_profile_expand\"]/div[1]/div[3]/a/span")
		private WebElement loginclick;
		
		@FindBy (xpath = "//*[@id=\"emph\"]")
		private WebElement entermobileno;
		
		@FindBy (xpath = "//*[@id=\"signinnewForm\"]/div[3]")
		private WebElement clicknexttab;
		
//		@FindBy (xpath = "//*[@id=\"shopWomen\"]")
//		private we
//		
		
		public WebDriver getDriver() {
			return driver;
		}

		
		public WebElement getWomentab() {
			return womentab;
		}

		public WebElement getProfileclick() {
			return profileclick;
		}

		public WebElement getLoginclick() {
			return loginclick;
		}

		public WebElement getEntermobileno() {
			return entermobileno;
		}

		public WebElement getClicknexttab() {
			return clicknexttab;
		}

		
}











