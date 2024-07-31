
package org.objectRepository;

import java.awt.AWTException;

import org.genericLibrary.Webdriver_Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFileInTeamspage {

	public UploadFileInTeamspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//div[@aria-label='Teams']")
	private WebElement teams;
	
	@FindBy(xpath = "//div[text()='Files']")
	private WebElement files;
	
	@FindBy(xpath = "//span[text()='Upload']")
	private WebElement upload;
	
	@FindBy(xpath = "//span[text()='Files']")
	private WebElement file2;

	public WebElement getTeams() {
		return teams;
	}

	public WebElement getFiles() {
		return files;
	}

	public WebElement getUpload() {
		return upload;
	}

	public WebElement getFile2() {
		return file2;
	}
	
	public void uploadResume(WebDriver driver) throws InterruptedException, AWTException
	{
		Webdriver_Utility wlib=new Webdriver_Utility();
		wlib.implicitWaitCondition(driver, 1000);
		
		wlib.switchToWindow(driver);
		
		wlib.explicitWaitCondition(driver, teams, 500);
		teams.click();
		
		wlib.explicitWaitCondition(driver, files, 200);
		files.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("embedded-page-container");
		
//		WebElement frame = driver.findElement(By.xpath("//iframe"));
//		driver.switchTo().frame(frame);
		
		wlib.explicitWaitCondition(driver, upload, 200);
		upload.click();
		
		wlib.explicitWaitCondition(driver, file2, 200);
		file2.click();
		
		Thread.sleep(3000);
		
		wlib.uploadFile();
		
		

	}

    
		
	}
	

