package d3dCom.Pages;

import cucumber.api.DataTable;
import d3dCom.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Easyjet_pages extends BasePage {
public void go_url(String url){
    driver.get(url);
}
public void close_cookies(){
    driver.findElement(By.id("close-drawer-link")).click();
}
public void Signin(){
    driver.findElement(By.xpath("html/body/div[4]/header/div[1]/div[1]/nav[2]/ul/li[2]/span/a[2]/span[1]")).click();
}
public void header(String header){
    String actheader = driver.findElement(By.id("drawer-title-sign-in")).getText();
    assertEquals(header, actheader);
}
public void username(String mailid){
    driver.findElement(By.id("signin-username")).sendKeys(mailid);
}
public void password(String passwd){
    driver.findElement(By.id("signin-password")).sendKeys(passwd);
}
public void submit_signin(){
    driver.findElement(By.id("signin-login")).click();
}
public void current_url(String Cururl){
    String Acturl = driver.getCurrentUrl();
    assertEquals(Cururl, Acturl);
}
public void navigate_url(String url){
    driver.navigate().to(url);
}
public void page_header(String arg0){
    String act_header = driver.findElement(By.id("RegistrationTitle")).getText();
    assertEquals(arg0, act_header);
}
public void header1(String header){
    String Act_header = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[2]/h2")).getText();
    assertEquals(header, Act_header);
    boolean Header = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[2]/h2")).isDisplayed();
    assertTrue(Header);
}
public void account_details(DataTable details){
    System.out.println(details);
    System.out.println(details.raw());
    String emailid = details.raw().get(1).get(0);
    String con_email = details.raw().get(1).get(1);
    String passwd = details.raw().get(1).get(2);
    String con_passwd = details.raw().get(1).get(3);
    driver.findElement(By.name("EmailAddress")).sendKeys(emailid);
    driver.findElement(By.name("EmailAddressCheck")).sendKeys(con_email);
    driver.findElement(By.name("Password")).sendKeys(passwd);
    driver.findElement(By.name("PasswordCheck")).sendKeys(con_passwd);
}
public void account_header(String exp_title){
    String act_title = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[3]/h2")).getText();
    assertEquals(exp_title, act_title);
}
public void title(String title){
    new Select(driver.findElement(By.name("TitleTypeCode"))).selectByValue("1");
}
public void account_address(DataTable account){
    String firstname = account.raw().get(1).get(0);
    String surname = account.raw().get(1).get(1);
    String address = account.raw().get(1).get(2);
    String town = account.raw().get(1).get(3);
    String postcode = account.raw().get(1).get(4);
    String mobile = account.raw().get(1).get(5);
    driver.findElement(By.name("FirstName")).sendKeys(firstname);
    driver.findElement(By.name("LastName")).sendKeys(surname);
    driver.findElement(By.name("Address1")).sendKeys(address);
    driver.findElement(By.name("City")).sendKeys(town);
    driver.findElement(By.name("PostalCode")).sendKeys(postcode);
    driver.findElement(By.name("MobilePhone")).sendKeys(mobile);
}
public void country(String ctry){
    new Select(driver.findElement(By.name("Country"))).selectByValue("IND");
}
public void country_code(String code){
    new Select(driver.findElement(By.name("CountryMobileCodes"))).selectByValue("+91");
}
public void nomobile(){
    driver.findElement(By.id("altahref")).click();
}
public void alter_countrycode(String tel_code){
    new Select(driver.findElement(By.name("CountryHousePhoneCodes"))).selectByValue("+91");
}
public void mobile_num(String arg0){
    driver.findElement(By.name("HomePhone")).sendKeys(arg0);
}
public void Heading(String heading){
    String act_heading = driver.findElement(By.xpath(".//*[@id='RegistrationMiddlePanel']/div[4]/h2")).getText();
    assertEquals(heading, act_heading);
}
    public void airports(DataTable dep_port) {

            new Select(driver.findElement(By.name("PreferredAirport1"))).selectByValue(dep_port.raw().get(1).get(0));

            new Select(driver.findElement(By.name("PreferredAirport2"))).selectByValue(dep_port.raw().get(2).get(0));

            new Select(driver.findElement(By.name("PreferredAirport3"))).selectByValue(dep_port.raw().get(3).get(0));

    }
public void checkbox(){
    driver.findElement(By.name("OptInEasyJetMailingListCheckBox")).click();
}
public void click_register(){
    driver.findElement(By.xpath("html/body/div[1]/div/form/div/div[3]/div[5]/div/div/p/a/span")).click();
}
public void cur_url(String exp_url){
    String act_url = driver.getCurrentUrl();
    assertEquals(exp_url, act_url);
}




























}
