package pompages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClsAmazon
{
	 public WebDriver wd;
	 public ClsAmazon(WebDriver d)
	 {
		 wd=d;
	 }
	 By
	 linksignIn=By.xpath("//*[@id='nav-link-accountList']/span[1]");
	 By
	 txtEmail=By.xpath("//*[@id='ap-email']");
	 By
	 btnContinue=By.xpath("//*[@id='continue']");
	 By
	 txtPwd=By.xpath("//*@id='ap-password']");
	 By
	 btnLogin=By.xpath("//*@id='signSubmit']");
	      
	 public void clickSignin()
	 {
		 wd.findElement(linksignIn).click();
	 }
	 public void clickContinue()
	 {
		 wd.findElement(btnContinue).click();
	 }
	 public void clickLogin()
	 {
		 wd.findElement(btnLogin).click();
	 }
	 public void setEmail(String username)
	 {
		 wd.findElement(txtEmail).sendKeys(username);
	 }
	 public void setPassword(String pwd)
	 {
		 wd.findElement(txtPwd).sendKeys(pwd);
	 }
}

		 
	 
	 
	 
	 
	


