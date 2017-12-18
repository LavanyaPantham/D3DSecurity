package d3dCom.stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.BasePage;
import d3dCom.Pages.Login_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_sd extends BasePage{

    public Login_pages Lpage = PageFactory.initElements(BasePage.driver, Login_pages.class);


    @Given("^I Go To URL \"([^\"]*)\"$")
    public void iGoToURL(String url) throws Throwable {
        openurl(url);
    }

    @When("^I Click Login button$")
    public void iClickLoginButton() throws Throwable {
        Lpage.Click_Login();
    }


    @Given("^I enter Username/Email as \"([^\"]*)\"$")
    public void iEnterUsernameEmailAs(String email) throws Throwable {
        Lpage.User_name(email);
    }

    @And("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String pwd) throws Throwable {
        Lpage.Password(pwd);
    }

    @When("^I Submit Log in button$")
    public void iSubmitLogInButton() throws Throwable {
       Lpage.Submit_login();
    }

    @Then("^I Should see My Account Button$")
    public void iShouldSeeMyAccountButton() throws Throwable {
        Lpage.My_Account();
    }


    @And("^I Should see Log Out Button$")
    public void iShouldSeeLogOutButton() throws Throwable {


    }



}
