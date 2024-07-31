package org.testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.genericLibrary.BaseClass;
import org.objectRepository.Outlook_Homepage;
import org.objectRepository.Outlook_Loginpage;
import org.objectRepository.UploadFileInTeamspage;
import org.testng.annotations.Test;

public class Surya extends BaseClass {

	@Test
	public void test() throws IOException, InterruptedException, AWTException
	{
		Outlook_Loginpage login=new Outlook_Loginpage(driver);
		login.loginToOutlook(driver);
		
		Thread.sleep(2000);
		
		Outlook_Homepage download=new Outlook_Homepage(driver);
		download.downloadResume(driver);
		
		Thread.sleep(20000);
		
		UploadFileInTeamspage upload=new UploadFileInTeamspage(driver);
		upload.uploadResume(driver);
		
	}
}
