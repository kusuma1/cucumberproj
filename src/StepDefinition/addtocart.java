package StepDefinition;



	import java.net.URI;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	
	
	public class addtocart {
	
		WebDriver driver;	
		String Url1,Url2,Url3;

	@Given("^I can see the book page$")
	public void I_can_see_the_book_page() throws Throwable {
		driver = new FirefoxDriver();
		 
		 driver.get("https://www.amazon.com");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The Testing");
		 		driver.findElement(By.id("nav-search-submit-text")).click();
		 		String Url = driver.getCurrentUrl();
		 		
		 		if (Url.equals(" https://www.amazon.com/s/ref=nb_sb_noss_1?url=search-alias%3Daps&field-keywords=the+testing")) 
		 		{        
		 
		 		driver.findElement(By.id("a-link-normal a-text-normal")).click();
		 		String Url1 = driver.getCurrentUrl();
		 		}
		 		else {
		 			System.out.println("Test Failed");	
		 		}
		 		
		 		}

	@When("^I click on the book image$")
	public void I_click_on_the_book_image() throws Throwable {
		if(Url1.equals("https://www.amazon.com/Testing-Joelle-Charbonneau/dp/0544336232/ref=sr_1_1?ie=UTF8&qid=1493967410&sr=8-1&keywords=the+testing"))
		{
			driver.findElement(By.id("imgBlkFront")).click();
			String Url2 = driver.getCurrentUrl();
		}
		else {
 			System.out.println("Test Failed");	
 		}
		
	}


	@Then("^I can see the Add to cart button$")
	public void I_can_see_the_Add_to_cart_button() throws Throwable {
		if (Url2.equals("https://www.amazon.com/Testing-Joelle-Charbonneau/dp/0544336232/ref=sr_1_1?ie=UTF8&qid=1493326783&sr=8-1&keywords=the+testing"))
			 	{
			 
			 		driver.findElement(By.id("add-to-cart-button")).click();
			 		String Url3 = driver.getCurrentUrl();
			 
	}
		else {
 			System.out.println("Test Failed");	
 		}

	}

	@And("^Direct me to Confirmation page$")
	public void Direct_me_to_Confirmation_page() throws Throwable {
		if (Url3.equals("https://www.amazon.com/gp/huc/view.html?ie=UTF8&newItems=C1XH9C7EWLBGDD%2C1"))
					{
					 System.out.println("Test passed” ");
			         } 
			 		else 
			 		{
			 			System.out.println("Test Failed");
			 		}
	}	 
	
	driver.quit();
	
	}
	
	
}
