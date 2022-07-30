package stepDefinitions;

import io.cucumber.java.en.Then;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.ObjectInputFilter;

public class MyStepdefs {

    @Then("tekrar {string} gider")
    public void tekrar_gider(String amazonUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(amazonUrl));
    }
}
