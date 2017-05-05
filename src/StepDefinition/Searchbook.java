package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchbook 
{
	
	
WebDriver driver;

@Given("^Open amazon.com$")
public void Open_amazon_com() throws Throwable {
 driver=new FirefoxDriver();
 driver.manage().window().maximize();
 driver.get("https://www.amazon.com/");

}

@When("^I enter name of the book in search textbox and click submit$")
public void I_enter_name_of_the_book_in_search_textbox_and_click_submit() throws Throwable {
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The Testing");
 
   driver.findElement(By.id("nav-search-submit-text")).click();
}

@Then("^Direct me to Book page$")
public void Direct_me_to_Book_page() throws Throwable {
	String Url = driver.getCurrentUrl();      
	 if (Url.equals(" https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=the+testing"))          
		 {
		 System.out.println("Test passed");
		 }
		 else {
	
		    System.out.println("Test Failed");
	      }
	 

	
		 driver.quit();
		 

}

	}


	


