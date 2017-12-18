package d3dCom.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.BasePage;
import d3dCom.Pages.Easyjet_pages;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static d3dCom.BasePage.driver;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Easyjet_sd {
    public Easyjet_pages Epage = PageFactory.initElements(BasePage.driver, Easyjet_pages.class);

    @Given("^I Go to the Url \"([^\"]*)\"$")
    public void iGoToTheUrl(String url) throws Throwable {
        Epage.go_url(url);
    }

    @When("^I close the Cookies button$")
    public void iCloseTheCookiesButton() throws Throwable {
        Epage.close_cookies();
    }

    @When("^I click Sign in button$")
    public void iClickSignInButton() throws Throwable {
        Thread.sleep(6000);
        Epage.Signin();
    }

    @Then("^I should see header as \"([^\"]*)\"$")
    public void iShouldSeeHeaderAs(String header) throws Throwable {
       Epage.header(header);
    }


    @Given("^I enter Email address as \"([^\"]*)\"$")
    public void iEnterEmailAddressAs(String mailid) throws Throwable {
        Epage.username(mailid);
    }

    @And("^I enter the password as \"([^\"]*)\"$")
    public void iEnterThePasswordAs(String passwd) throws Throwable {
        Epage.password(passwd);
    }

    @When("^I submit Sign in button$")
    public void iSubmitSignInButton() throws Throwable {
        Epage.submit_signin();
        Thread.sleep(8000);
    }

    @Then("^I should see the URL as \"([^\"]*)\"$")
    public void iShouldSeeTheURLAs(String Cururl) throws Throwable {
       Epage.current_url(Cururl);
    }

    @Given("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url) throws Throwable {
        Epage.navigate_url(url);
    }

    @Then("^I should see page header as \"([^\"]*)\"$")
    public void iShouldSeePageHeaderAs(String arg0) throws Throwable {
        Epage.page_header(arg0);
    }

    @Then("^I should see the header as \"([^\"]*)\"$")
    public void iShouldSeeTheHeaderAs(String header) throws Throwable {
       Epage.header1(header);
    }

    @Given("^I enter My details as below:$")
    public void iEnterMyDetailsAsBelow(DataTable details) throws Throwable {
        Epage.account_details(details);
    }

    @Then("^I see account details as \"([^\"]*)\"$")
    public void iSeeAccountDetailsAs(String exp_title) throws Throwable {
        Epage.account_header(exp_title);

    }

    @When("^I select \"([^\"]*)\" from dropdown list$")
    public void iSelectFromDropdownList(String title) throws Throwable {
        Epage.title(title);
    }

    @Given("^I enter the account details as follows:$")
    public void iEnterTheAccountDetailsAsFollows(DataTable account) throws Throwable {
        Epage.account_address(account);
    }

    @And("^I select the country as \"([^\"]*)\"$")
    public void iSelectTheCountryAs(String cntry) throws Throwable {
        Epage.country(cntry);
    }

    @And("^I select country code as \"([^\"]*)\"$")
    public void iSelectCountryCodeAs(String code) throws Throwable {
        Epage.country_code(code);
    }

    @When("^I click on I don't have a mobile phone$")
    public void iClickOnIDonTHaveAMobilePhone() throws Throwable {
        Epage.nomobile();
        Thread.sleep(4000);
    }

    @And("^I select the Alternative country telephone as \"([^\"]*)\"$")
    public void iSelectTheAlternativeCountryTelephoneAs(String tel_code) throws Throwable {
        Epage.alter_countrycode(tel_code);
    }

    @Given("^I enter mobile number as \"([^\"]*)\"$")
    public void iEnterMobileNumberAs(String arg0) throws Throwable {
        Epage.mobile_num(arg0);
    }

    @Then("^I should see the Heading as \"([^\"]*)\"$")
    public void iShouldSeeTheHeadingAs(String heading) throws Throwable {
        Epage.Heading(heading);
    }

    @Given("^I select the departing flights as below:$")
    public void iSelectTheDepartingFlightsAsBelow(DataTable dep_port) throws Throwable {
        Epage.airports(dep_port);
    }

    @When("^I select the check box$")
    public void iSelectTheCheckBox() throws Throwable {
        Epage.checkbox();
    }

    @And("^I click Register now button$")
    public void iClickRegisterNowButton() throws Throwable {
        Epage.click_register();
        Thread.sleep(8000);
    }


    @Then("^I should see current url as \"([^\"]*)\"$")
    public void iShouldSeeCurrentUrlAs(String exp_url) throws Throwable {
        Epage.cur_url(exp_url);
    }
}



