package com.vigil.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class residence {

   public static void main(String[] args) throws InterruptedException {
	  // TODO Auto-generated method stub
	  WebDriverManager.chromedriver().setup();

	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  /*Store the current window handle */
	  String parent_handle = driver.getWindowHandle();
	  driver.get("https://serviceonline.bihar.gov.in/resources/homePage/10/loginEnglish.htm");
	  driver.findElement(By.xpath("//label[contains(text(),'General')]")).click();
	  driver.findElement(By.xpath(("//p[contains(text(),'Residential')]"))).click();
	  driver.findElement(By.xpath(("//div[@id='collapseOneOne']/div/p/a"))).click();

	  for(String winHandle:driver.getWindowHandles()){
		 if(!parent_handle.equals(winHandle))
			driver.switchTo().window(winHandle);
	  }

	  /* Write Gender accordingly.Default is Male(M).(F) and (T)*/
	  char gender='M';
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='17290_1']/input")));
	  if(gender=='M')
	  {
		 driver.findElement(By.xpath("//input[@id='17290_1']")).click();
	  }
	  else if(gender=='F')
	  {
		 driver.findElement(By.xpath("//input[@id='17290_2']")).click();
	  }
	  else
	  {
		 driver.findElement(By.xpath("//input[@id='17290_3']")).click();
	  }

	  WebElement obj=driver.findElement(By.xpath("//input[@name='78250']"));

	  /* I have also tried obj.sendKeys("Sumit Kumar") , this is also not working*/

	  obj.clear();
	  obj.sendKeys("Sumit");
	  obj.sendKeys(" ");
	  obj.sendKeys("Kumar");
	  obj = driver.findElement(By.xpath("//input[@name='17287']"));
	  obj.clear();
	  obj.sendKeys("Name in Hindi with space ");
   }

}