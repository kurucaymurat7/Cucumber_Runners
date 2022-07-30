package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage = new HerokuappPage();
    @And("add element butonuna basar")
    public void addElementButonunaBasar() {
        herokuappPage.addElement.click();
    }

    @Then("delete butonu gorunur oluncaya kadar bekler")
    public void deleteButonuGorunurOluncayaKadarBekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElement));
    }

    @And("Delete butonunun gorunur oldugunu test eder")
    public void deleteButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(herokuappPage.deleteElement.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void deleteButonunaBasar() {
        herokuappPage.deleteElement.click();
    }

    @And("Delete butonunun gorunmedigini test eder")
    public void deleteButonununGorunmediginiTestEder() {
        Assert.assertTrue(herokuappPage.deleteElementList.isEmpty());
    }
}
