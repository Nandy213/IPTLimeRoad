package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_Base.BaseClass;

public class KurtasLR extends BaseClass {
	WebDriver driver;
	public KurtasLR(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@class=' dIb vB m01']\"")
	private WebElement kurtas;
	
	@FindBy (xpath = "//*[@id=\"views\"]/div/div/div[2]/div[5]/a/span")
	private WebElement selectproduct;
	
	@FindBy (xpath = "//*[@id=\"views\"]/div[1]/div[2]/div/div[1]/div")
	private WebElement viewproduct;
	
	@FindBy (xpath = "//*[@id=\"alSz\"]/div[4]")
	private WebElement selectsize;
	
	@FindBy (xpath = "//div[@class='pR bs fs20 p05 pl12 dTc vT']")
	private WebElement addtocard;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getKurtas() {
		return kurtas;
	}


	public void setKurtas(WebElement kurtas) {
		this.kurtas = kurtas;
	}


	public WebElement getSelectproduct() {
		return selectproduct;
	}


	public void setSelectproduct(WebElement selectproduct) {
		this.selectproduct = selectproduct;
	}


	public WebElement getViewproduct() {
		return viewproduct;
	}


	public void setViewproduct(WebElement viewproduct) {
		this.viewproduct = viewproduct;
	}


	public WebElement getSelectsize() {
		return selectsize;
	}


	public void setSelectsize(WebElement selectsize) {
		this.selectsize = selectsize;
	}


	public WebElement getAddtocard() {
		return addtocard;
	}


	public void setAddtocard(WebElement addtocard) {
		this.addtocard = addtocard;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
