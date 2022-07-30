package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

import static org.openqa.selenium.Keys.TAB;

public class AutomationStepDefinitions {
    static AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.signInButton.click();
    }
    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(TAB)
                .sendKeys("10")
                .sendKeys(TAB)
                .sendKeys("January")
                .sendKeys(TAB)
                .sendKeys("2000")
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.company().name())
                .sendKeys(TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.address().city())
                .sendKeys(TAB)
                .sendKeys("Alaska")
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(TAB)
                .sendKeys("United States")
                .sendKeys(TAB)
                .sendKeys(TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(TAB)
                .sendKeys("ALSK").perform();
    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automationPage.registerButton.click();
    }
    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }

}
