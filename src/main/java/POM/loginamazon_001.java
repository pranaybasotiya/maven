package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginamazon_001 
{
	       //Webdriver
			private WebDriver driver;
			private Select s;
			
			 //username
			 @FindBy(xpath="//input[@id='ap_email']")
			 private WebElement username; 
			 
			 public void sendUsername()
			 {
				 username.sendKeys("pranaybasotiya2@gmail.com");
			 }
			 
			 
			 //Continue
			 @FindBy(xpath="//input[@id='continue']")
			 private WebElement loginbtn;
			 
			 public void sendbtn()
			 {
				 loginbtn.click();
			 }
			 
			 
			 //password
			 @FindBy(xpath="//input[@id='ap_password']")
			 private WebElement Password; 
				 
				 public void password()
				 {
					 Password.sendKeys("9371710693");
				 }
				 
			//signbtn
				 @FindBy(xpath="//input[@id='signInSubmit']")
				 private WebElement signin; 
					 
					 public void SignIn()
					 {
						 signin.click();
					 }
					 
					 
			 
			
				 //cons declared
				  public loginamazon_001 ( WebDriver driver)
				  {
					this.driver=driver;
					PageFactory.initElements(driver,this);
					
				  }
			
			
			
			
			
			
				
			
			
			
			
}
