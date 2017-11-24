package d3dCom.Pages;

import d3dCom.BasePage;
import org.openqa.selenium.By;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class signin_pages extends BasePage {
    public void click_login(){
        driver.findElement(By.xpath(".//*[@id='menu-item-4532']/a")).click();

    }

    public void MyAccount(){
        String Actual_My_Account = driver.findElement(By.xpath(".//*[@id='menu-item-5958']/a")).getText();
        String Expected_My_Account = "My Account";
        assertEquals(Expected_My_Account, Actual_My_Account);
    }

    public void Logout(){
        boolean Actual_Logout = driver.findElement(By.cssSelector("#menu-item-4531>a")).isDisplayed();
        assertTrue(Actual_Logout);

    }

    public void clicklog_in(){
        driver.findElement(By.name("submit")).click();
    }

    public void enter_username(String username){
        driver.findElement(By.name("log")).sendKeys(username);

    }

    public void enter_password(String password){
        driver.findElement(By.name("pwd")).sendKeys(password);
    }

    public void error_message(){
        driver.findElement(By.xpath(".//*[@id='post-4521']/div/div[1]")).getText();
    }

    public void header(){
        String act_url = driver.getCurrentUrl();
        String exp_url = "https://www.d3dsecurity.co.uk/about-us/";
        assertEquals(exp_url, act_url);
    }
}
