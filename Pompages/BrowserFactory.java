package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
  
  public static WebDriver wd;
  public static WebDriver startBrowser(String bName, String string)
  {
	  if(bName.equalsIgnoreCase("Chrome"))
		  {
		  WebDriverManager.chromedriver().browserVersion("109").setup();
		  wd=new ChromeDriver();
		  }
	  else if(bName.equalsIgnoreCase("FireFox"))
		  {
		  WebDriverManager.firefoxdriver().browserVersion("65").setup();
		  wd=new ChromeDriver();
		  }
	  wd.manage().window().maximize();
	  wd.get("url");
	  return wd;
  }
}

		  
	  
	  
  

