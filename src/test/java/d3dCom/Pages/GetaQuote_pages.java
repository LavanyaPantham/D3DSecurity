package d3dCom.Pages;

import cucumber.api.DataTable;
import d3dCom.BasePage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetaQuote_pages extends BasePage {

    public void Click_Products(){
        driver.findElement(By.xpath(".//*[@id='menu-item-1725']/a")).click();
    }

    public void See_Getaquote(String exp_name){
        String act_name = driver.findElement(By.xpath(".//*[@id='text-9']/div/div[2]/h2")).getText();
        assertEquals(exp_name, act_name);
        boolean title = driver.findElement(By.xpath(".//*[@id='text-9']/div/div[2]/h2")).isDisplayed();
        assertTrue(title);
    }

    public void See_header(String pro_header){
        String act_header = driver.findElement(By.xpath(".//*[@id='post-932']/h1")).getText();
        assertEquals(pro_header, act_header);
        boolean Header = driver.findElement(By.xpath(".//*[@id='post-932']/h1")).isDisplayed();
        assertTrue(Header);
    }

    public void first_name(String first_name){

        driver.findElement(By.name("first-name")).sendKeys(first_name);
    }

    public void last_name(String last_name){
        driver.findElement(By.name("last-name")).sendKeys(last_name);
    }

    public void Email_id(String email){
        driver.findElement(By.name("your-email")).sendKeys(email);
    }

    public void phone_num(String ph_no){
        driver.findElement(By.name("tel-879")).sendKeys(ph_no);
    }

    public void Subject(String Subj){
        driver.findElement(By.name("your-subject")).sendKeys(Subj);
    }

    public void Message(String Msg){

        driver.findElement(By.name("your-message")).sendKeys(Msg);
    }

    public void SEND_MESSAGE(){

        driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[4]/input")).click();
    }

    public void Header(String title_header){
        String act_header = driver.findElement(By.xpath(".//*[@id='post-4029']/h1")).getText();
        assertEquals(title_header, act_header);
        boolean header = driver.findElement(By.xpath(".//*[@id='post-4029']/h1")).isDisplayed();
        assertTrue(header);
    }

    public void Header_Message(String Exp_msg){
        String act_msg = driver.findElement(By.className("heading-title")).getText();
        assertEquals(Exp_msg, act_msg);
        boolean message = driver.findElement(By.className("heading-title")).isDisplayed();
        assertTrue(message);
    }

    public void current_url(String Exp_url){
        String act_url = driver.getCurrentUrl();
        assertEquals(Exp_url, act_url);
    }

    public void blank_name(){
        String fir_name = "";
        String act_firname = driver.findElement(By.name("first-name")).getText();
        assertEquals(fir_name, act_firname);
        boolean firstname = driver.findElement(By.name("first-name")).isDisplayed();
        assertTrue(firstname);
    }

    public void blank_lastname(){
        boolean lastname = driver.findElement(By.name("last-name")).isDisplayed();
        assertTrue(lastname);
    }

    public void blank_email(){
        boolean email = driver.findElement(By.name("your-email")).isDisplayed();
        assertTrue(email);
    }

    public void blank_num(){
        boolean number = driver.findElement(By.name("tel-879")).isDisplayed();
        assertTrue(number);
    }

    public void blank_subject(){
        boolean subject = driver.findElement(By.name("your-subject")).isDisplayed();
        assertTrue(subject);
    }

    public void blank_message(){
        boolean message = driver.findElement(By.name("your-message")).isDisplayed();
        assertTrue(message);
    }

    public void blank_captcha(){
        boolean captcha = driver.findElement(By.name("captcha-005")).isDisplayed();
        assertTrue(captcha);
    }

    public void See_sendmessage(){
//        String act_button = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[4]")).getText();
//        String exp_button = "SEND MESSAGE";
//        assertEquals(exp_button, act_button);
        boolean button = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/p[4]")).isDisplayed();
        assertTrue(button);
    }

    public void mand_firstname(String firstname){
        driver.findElement(By.name("first-name")).sendKeys(firstname);
    }

    public void mand_phonenum(String yournum){
        driver.findElement(By.name("tel-879")).sendKeys(yournum);
    }

    public void message1(String mess1){
        String act_mess1 = driver.findElement(By.cssSelector(".wpcf7-not-valid-tip")).getText();
        assertEquals(mess1, act_mess1);
        boolean act_message = driver.findElement(By.cssSelector(".wpcf7-not-valid-tip")).isDisplayed();
        assertTrue(act_message);
    }

    public void errormsg(String error1){
        String act_error1 = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/div[8]")).getText();
        assertEquals(error1, act_error1);
        boolean act_error = driver.findElement(By.xpath(".//*[@id='wpcf7-f391-o1']/form/div[8]")).isDisplayed();
        assertTrue(act_error);
    }

    public void datatable(DataTable details){
        System.out.println(details);
        System.out.println(details.raw());
        System.out.println(details.raw().get(1));
        System.out.println(details.raw().get(1).get(0));
        System.out.println(details.raw().get(1).get(1));
        String firstname = details.raw().get(1).get(0);
        String lastname = details.raw().get(1).get(1);
        String email = details.raw().get(1).get(2);
        String phno = details.raw().get(1).get(3);
        String subj = details.raw().get(1).get(4);
        String message = details.raw().get(1).get(5);
        driver.findElement(By.name("first-name")).sendKeys(firstname);
        driver.findElement(By.name("last-name")).sendKeys(lastname);
        driver.findElement(By.name("your-email")).sendKeys(email);
        driver.findElement(By.name("tel-879")).sendKeys(phno);
        driver.findElement(By.name("your-subject")).sendKeys(subj);
        driver.findElement(By.name("your-message")).sendKeys(message);

    }


















}
