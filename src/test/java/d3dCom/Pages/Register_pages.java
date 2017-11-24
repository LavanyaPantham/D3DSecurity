package d3dCom.Pages;

import d3dCom.BasePage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Register_pages extends BasePage {

    public void Click_Register(){
        driver.findElement(By.linkText("Register")).click();
    }

    public void Enter_email(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void Enter_newpwd(String new_pwd){
        driver.findElement(By.name("pass1")).sendKeys(new_pwd);
    }

    public void Enter_conpwd(String con_pwd){
        driver.findElement(By.name("pass2")).sendKeys(con_pwd);
    }

    public void Submit_Register(){
        driver.findElement(By.name("submit")).click();
    }

    public void blank_email(String blank_id){
        driver.findElement(By.name("email")).sendKeys(blank_id);
    }

    public void blank_npwd(String blank_npwd){
        driver.findElement(By.name("pass1")).sendKeys(blank_npwd);
    }

    public void blank_cpwd(String blank_cpwd){
        driver.findElement(By.name("pass2")).sendKeys(blank_cpwd);
    }

    public void Error_msg(String exp_errmsg){
        String act_errmsg = driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        assertEquals(exp_errmsg, act_errmsg);
    }

    public void New_email(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }

    public void pwd_1(String pwd1){
        driver.findElement(By.name("pass1")).sendKeys(pwd1);
    }

    public void pwd_2(String pwd2){
        driver.findElement(By.name("pass2")).sendKeys(pwd2);
    }

    public void Err_msg1(String exp_msg){
        String act_msg =  driver.findElement(By.xpath(".//*[@id='post-4519']/div/div[1]/p")).getText();
        assertEquals(exp_msg, act_msg);
    }
















}
