package pageobjectmodelclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement ProductSearch;
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//*[@class='a-size-medium a-color-base a-text-normal']")
	WebElement MobilePhone;
	
	WebDriver driver;
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this );
	}
	
	public void SearchProduct()
	{
		ProductSearch.sendKeys("Mobile Phones");
		SubmitBtn.click();
		
	}
	
	public void ClickOnProduct()
	{
		MobilePhone	.click();
		

	}

}
