package com.Actitime.pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime.Generic.ReadDataFromExcel;

public class TaskPage {
    @FindBy(xpath = "//div[.='Add New']")           //Declaration
    private WebElement AddnewBtn;
    
    @FindBy(xpath = "//div[.='+ New Customer']")
    private WebElement newcustomer;
    
    @FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
    private WebElement custname;
    
    @FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
    private WebElement description;
    
    @FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
    private WebElement dropdown;
    
    @FindBy(xpath = "(//div[.='Big Bang Company'])[6]")
    private WebElement bigbang;
    
    @FindBy(xpath = "//div[.='Create Customer']")
    private WebElement createcust;
    
    public TaskPage(WebDriver driver) {        //Initialization
    	PageFactory.initElements(driver,this);
    }
    
    
    public WebElement getDescription() {      //Utilization
		return description;
	}

	public WebElement getDropdrown() {
		return dropdown;
	}
	
	public WebElement getBigbang() {
		return bigbang;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCustname() {          
		return custname;
	}
	public WebElement getNewcustomer() {
		return newcustomer;
	}
	public WebElement getAddnewBtn() {
		return AddnewBtn;
	}
    public void Addnew() throws EncryptedDocumentException, IOException {
    	ReadDataFromExcel r=new ReadDataFromExcel();
    	String custname1 = r.readDataFromexcelFile("Sheet1", 1, 1);
    	AddnewBtn.click();
    	newcustomer.click();
    	custname.sendKeys(custname1);
    	description.sendKeys("Banking");
    	dropdown.click();
    	bigbang.click();
    	createcust.click();
    }
    
}
