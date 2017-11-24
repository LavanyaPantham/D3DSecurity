package d3dCom.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.BasePage;
import d3dCom.Pages.signin_pages;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class signin_sd extends BasePage {

    public signin_pages Spage = PageFactory.initElements(BasePage.driver, signin_pages.class);


    @Given("^I go to URL \"([^\"]*)\"$")
    public void iGoToURL(String url) throws Throwable {
        openurl(url);
    }


    @When("^I click Login button$")
    public void iClickLoginButton() throws Throwable {
        Spage.click_login();
    }

    @Given("^I enter login as \"([^\"]*)\"$")
    public void iEnterLoginAs(String username) throws Throwable {
        Spage.enter_username(username);

    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) throws Throwable {
        Spage.enter_password(password);
    }

    @When("^I click Log in button$")
    public void iClickLogInButton() throws Throwable {
        Spage.clicklog_in();
    }


    @And("^I should see My Account button$")
    public void iShouldSeeMyAccountButton() throws Throwable {
        Spage.MyAccount();
    }


    @And("^I should see Log Out button$")
    public void iShouldSeeLogOutButton() throws Throwable {
        Spage.Logout();

    }


//    @Then("^I should see \"([^\"]*)\" header with menu$")
//    public void iShouldSeeHeaderWithMenu(String expected_header) throws Throwable {
//        String actual_header = driver.findElement(By.xpath(".//*[@id='masthead']/div[1]/div[1]/div/a/img")).getText();
//        assertEquals(expected_header, actual_header);


    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String error_message) throws Throwable {
        Spage.error_message();

    }


    @Then("^I should see \"([^\"]*)\" header$")
    public void iShouldSeeHeader(String exp_header) throws Throwable {

    }

    @When("^I click Why D(\\d+)D header$")
    public void iClickWhyDDHeader(int arg0) throws Throwable {
        driver.findElement(By.linkText("Why D3D")).click();
    }

    @Then("^I should see \"([^\"]*)\" header with some text$")
    public void iShouldSeeHeaderWithSomeText(String header) throws Throwable {
        Spage.header();

    }
}
