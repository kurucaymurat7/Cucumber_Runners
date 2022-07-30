package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String dataTablesUrl) {
        Driver.getDriver().get(ConfigReader.getProperty("dataTablesUrl"));
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButonunaBasar.click();
    }
    @Then("isim bolumune {string} girer")
    public void isim_bolumune_girer(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }
    @Then("soyisim bolumune {string} girer")
    public void soyisim_bolumune_girer(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }
    @Then("position bolumune {string} girer")
    public void position_bolumune_girer(String position) {
        dataTablesPage.position.sendKeys(position);
    }
    @Then("ofis bolumune {string} girer")
    public void ofis_bolumune_girer(String office) {
        dataTablesPage.office.sendKeys(office);

    }
    @Then("extension bolumune {string} girer")
    public void extension_bolumune_girer(String extension) {
        dataTablesPage.extn.sendKeys(extension);

    }
    @Then("startdate bolumune {string} girer")
    public void startdate_bolumune_girer(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);
    }
    @Then("salary bolumune {string} girer")
    public void salary_bolumune_girer(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablesPage.search.sendKeys(firstname);
    }

    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isimBolumundeOldugunuDogrular(String firstname) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstname));
    }


}
