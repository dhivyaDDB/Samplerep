package com.yosi.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.yosi.base.YosiBaseClass;
import com.yosi.util.Log;

public class Patient_Info_POM extends YosiBaseClass{
	WebDriver driver;
	
	
	@FindBy(xpath= "//*[@id=\"firstname\"]")
	 WebElement pat_info_fname;
	

	@FindBy(xpath = "//*[@id=\"lastname\"]")
	 WebElement  pat_info_lname;
	
	@FindBy(xpath = "//*[@id=\"select_gender_wrap\"]/div[1]/label]") 
	 WebElement  pat_info_gender;
	
	@FindBy(xpath = "//*[@id=\"date\"]")
	 WebElement  pat_info_dob;
	
	@FindBy(id = "address1")
	 WebElement  pat_info_address1;
	
	@FindBy(id = "address2")
	 WebElement  pat_info_address2;
	
	@FindBy(id = "zipcode")
	 WebElement  pat_info_zipcode;
	
	
	public Patient_Info_POM(WebDriver driver)
	{

	  this.driver = driver;
	    //This initElements method will create all WebElement
	  PageFactory.initElements(driver, this);

	 }
	
	public String getPat_info_fname() {
		return pat_info_fname.getAttribute("value");
	}

	public void setPat_info_fname(String pat_info_strfname) {
		pat_info_fname.sendKeys(pat_info_strfname);
	}

	public String getPat_info_lname() {
		return pat_info_lname.getAttribute("value");
	}

	public void setPat_info_lname(String pat_info_strlname) {
		pat_info_lname.sendKeys(pat_info_strlname);;
	}

	public String getPat_info_gender() {
		return pat_info_gender.getText();
	}

	public void setPat_info_gender(String pat_info_strgender) {
		pat_info_gender.sendKeys(pat_info_strgender);
	}

	public WebElement getPat_info_dob() {
		return pat_info_dob;
	}

	public void setPat_info_dob(WebElement pat_info_dob) {
		this.pat_info_dob = pat_info_dob;
	}

	public String getPat_info_address1() {
		return pat_info_address1.getAttribute("value");
	}

	public void setPat_info_address1(String pat_info_straddress1) {
		 pat_info_address1.sendKeys(pat_info_straddress1);
	}

	public String getPat_info_address2() {
		return pat_info_address2.getAttribute("value");
	}

	public void setPat_info_address2(String pat_info_straddress2) {
		pat_info_address2.sendKeys(pat_info_straddress2); 
	}

	public String getPat_info_zipcode() {
		return pat_info_zipcode.getAttribute("value");
	}

	public void setPat_info_zipcode(String pat_info_strzipcode) {
		pat_info_zipcode.sendKeys(pat_info_strzipcode);
	}

	
}
	
	

