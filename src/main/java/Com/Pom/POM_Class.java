package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Com_Base.BaseClass;

public class POM_Class extends BaseClass {
	
	 public POM_Class (WebDriver driver) {
		 
		 PageFactory.initElements(driver, this);
		 
	 }
private LimeRoadGS lr;
	public LimeRoadGS getlr() {
		lr =new LimeRoadGS(driver);
		return lr;
		
	
}
}
