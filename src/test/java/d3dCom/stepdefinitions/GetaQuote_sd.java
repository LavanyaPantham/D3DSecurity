package d3dCom.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.BasePage;
import d3dCom.Pages.GetaQuote_pages;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static d3dCom.BasePage.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetaQuote_sd {

    public GetaQuote_pages GQpage = PageFactory.initElements(BasePage.driver, GetaQuote_pages.class);

    @When("^I click on Products tab in the menu$")
    public void iClickOnProductsTabInTheMenu() throws Throwable {
        GQpage.Click_Products();
    }

    @Then("^I should see \"([^\"]*)\" form on left side of the page$")
    public void iShouldSeeFormOnLeftSideOfThePage(String exp_name) throws Throwable {
        GQpage.See_Getaquote(exp_name);
    }

    @And("^I should see list of products under \"([^\"]*)\" header on the right side of the page$")
    public void iShouldSeeListOfProductsUnderHeaderOnTheRightSideOfThePage(String pro_header) throws Throwable {
        GQpage.See_header(pro_header);
    }

    @Given("^I enter the First name of user \"([^\"]*)\"$")
    public void iEnterTheFirstNameOfUser(String first_name) throws Throwable {
        GQpage.first_name(first_name);
    }

    @And("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String last_name) throws Throwable {
        GQpage.last_name(last_name);
    }


    @And("^I enter email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String email) throws Throwable {
        GQpage.Email_id(email);
    }

    @And("^I enter phone number as \"([^\"]*)\"$")
    public void iEnterPhoneNumberAs(String ph_no) throws Throwable {
        GQpage.phone_num(ph_no);
    }


    @And("^I enter Subject as \"([^\"]*)\"$")
    public void iEnterSubjectAs(String Subj) throws Throwable {
        GQpage.Subject(Subj);
    }

    @And("^I enter Message as \"([^\"]*)\"$")
    public void iEnterMessageAs(String Msg) throws Throwable {
        GQpage.Message(Msg);
        Thread.sleep(10000);
    }

    @When("^I click the SEND MESSAGE button$")
    public void iClickTheSENDMESSAGEButton() throws Throwable {
        GQpage.SEND_MESSAGE();
        Thread.sleep(8000);
    }

    @Then("^I should see a \"([^\"]*)\" Header$")
    public void iShouldSeeAHeader(String title_header) throws Throwable {
        GQpage.Header(title_header);
    }

    @And("^I should see message as \"([^\"]*)\"$")
    public void iShouldSeeMessageAs(String Exp_msg) throws Throwable {
        GQpage.Header_Message(Exp_msg);
    }


    @And("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String Exp_url) throws Throwable {
        GQpage.current_url(Exp_url);
    }

    @And("^I should see blank First name field$")
    public void iShouldSeeBlankFirstNameField() throws Throwable {
        GQpage.blank_name();
    }

    @And("^I should see blank Last name field$")
    public void iShouldSeeBlankLastNameField() throws Throwable {
        GQpage.blank_lastname();
    }

    @And("^I should see blank email id field$")
    public void iShouldSeeBlankEmailIdField() throws Throwable {
        GQpage.blank_email();
    }

    @And("^I should see blank phone number field$")
    public void iShouldSeeBlankPhoneNumberField() throws Throwable {
        GQpage.blank_num();
    }

    @And("^I should see blank Subject field$")
    public void iShouldSeeBlankSubjectField() throws Throwable {
        GQpage.blank_subject();
    }

    @And("^I should see blank Message field$")
    public void iShouldSeeBlankMessageField() throws Throwable {
        GQpage.blank_message();
    }

    @And("^I should see blank captcha field$")
    public void iShouldSeeBlankCaptchaField() throws Throwable {
        GQpage.blank_captcha();
    }

    @And("^I should see SEND MESSAGE button$")
    public void iShouldSeeSENDMESSAGEButton() throws Throwable {
        GQpage.See_sendmessage();
    }

    @Given("^I enter the mandatory first name field as \"([^\"]*)\"$")
    public void iEnterTheMandatoryFirstNameFieldAs(String firstname) throws Throwable {
        GQpage.mand_firstname(firstname);

    }

    @And("^I enter the mandatory phone number field as \"([^\"]*)\"$")
    public void iEnterTheMandatoryPhoneNumberFieldAs(String yournum) throws Throwable {
        GQpage.mand_phonenum(yournum);
    }

    @Then("^I should see a prompted message as \"([^\"]*)\"$")
    public void iShouldSeeAPromptedMessageAs(String mess1) throws Throwable {
        GQpage.message1(mess1);
    }

    @And("^I should see Error Message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String error1) throws Throwable {
        GQpage.errormsg(error1);
    }


    @Given("^I enter the details of user in Get a Free Quote box as follows:$")
    public void iEnterTheDetailsOfUserInGetAFreeQuoteBoxAsFollows(DataTable details) throws Throwable {
      GQpage.datatable(details);
        Thread.sleep(10000);
    }
}
