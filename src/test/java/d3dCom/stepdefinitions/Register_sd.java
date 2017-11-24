package d3dCom.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import d3dCom.BasePage;
import d3dCom.Pages.Register_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static d3dCom.BasePage.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Register_sd {
    public Register_pages Rpage = PageFactory.initElements(driver, Register_pages.class);

    @When("^I click Register button$")
    public void iClickRegisterButton() throws Throwable {
        Rpage.Click_Register();
    }


    @Given("^I enter Email ID as \"([^\"]*)\"$")
    public void iEnterEmailIDAs(String email) throws Throwable {
        Rpage.Enter_email(email);
    }

    @And("^I enter New Password as \"([^\"]*)\"$")
    public void iEnterNewPasswordAs(String new_pwd) throws Throwable {
        Rpage.Enter_newpwd(new_pwd);
    }

    @And("^I enter Confirm Password as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordAs(String con_pwd) throws Throwable {
        Rpage.Enter_conpwd(con_pwd);
    }

    @When("^I submit Register button$")
    public void iSubmitRegisterButton() throws Throwable {
        Rpage.Submit_Register();
    }

    @Given("^I enter blank Email ID as \"([^\"]*)\"$")
    public void iEnterBlankEmailIDAs(String blank_id) throws Throwable {
        Rpage.blank_email(blank_id);
    }

    @And("^I enter blank New Password as \"([^\"]*)\"$")
    public void iEnterBlankNewPasswordAs(String blank_npwd) throws Throwable {
        Rpage.blank_npwd(blank_npwd);
    }


    @And("^I enter blank Confirm Password as \"([^\"]*)\"$")
    public void iEnterBlankConfirmPasswordAs(String blank_cpwd) throws Throwable {
        Rpage.blank_cpwd(blank_cpwd);
    }

    @Then("^I should see the error message as \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessageAs(String exp_errmsg) throws Throwable {
       Rpage.Error_msg(exp_errmsg);
    }

    @Given("^I enter new Email ID as \"([^\"]*)\"$")
    public void iEnterNewEmailIDAs(String email) throws Throwable {
       Rpage.New_email(email);
    }

    @And("^I enter the Password as \"([^\"]*)\"$")
    public void iEnterThePasswordAs(String pwd1) throws Throwable {
        Rpage.pwd_1(pwd1);
    }

    @And("^I re-enter confirm Password as \"([^\"]*)\"$")
    public void iReEnterConfirmPasswordAs(String pwd2) throws Throwable {
        Rpage.pwd_2(pwd2);
    }

    @Then("^I should see an error message as \"([^\"]*)\"$")
    public void iShouldSeeAnErrorMessageAs(String exp_msg) throws Throwable {
      Rpage.Err_msg1(exp_msg);
    }


}
