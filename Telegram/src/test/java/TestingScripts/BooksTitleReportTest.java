package TestingScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import ObjectRepository.BooksPage1;
import ObjectRepository.WelcomePage;
import genericLibrary.BaseClass;

public class BooksTitleReportTest extends BaseClass {
	
	@Test
	public void BooksTitleReportTest() {
		WelcomePage welcomepage=new WelcomePage(driver);
		BooksPage1 bookspage1=new BooksPage1(driver);
		welcomepage.getBookslink().click();
		test.log(LogStatus.INFO,"clicked on bookslink");
		try {
			
		
		Assert.assertEquals(bookspage1.getBookstitle().getText(), "BOOKS");
		test.log(LogStatus.PASS,"Books page is displayed");
		}
		catch(AssertionError e) {
			test.log(LogStatus.FAIL,test.addScreenCapture(getwebpage));
		}
		//Reporter.log("vanitha",true);
	}

}
