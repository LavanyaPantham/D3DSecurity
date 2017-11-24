package d3dCom.Pages;

import d3dCom.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Login_pages extends BasePage {

   public void Click_Login(){
       driver.findElement(By.linkText("Login")).click();

   }
   public void User_name(String email){
       driver.findElement(By.name("log")).sendKeys(email);
   }

   public void Password(String pwd){
       driver.findElement(By.name("pwd")).sendKeys(pwd);

   }

   public void Submit_login(){

       driver.findElement(By.name("submit")).click();
   }

   public void My_Account(){
       String actual = driver.findElement(By.linkText("My Account")).getText();
       String expected = "My Account";
       assertEquals(expected, actual);
   }

   public void Log_Out(){
      String actual = driver.findElement(By.linkText("Log Out")).getText();
       String expected = "Log Out";
       assertEquals(expected, actual);
   }























}
