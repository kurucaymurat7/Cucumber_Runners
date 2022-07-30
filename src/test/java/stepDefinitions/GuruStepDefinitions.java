package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    @And("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenBaslik) {
        GuruPage guruPage = new GuruPage();
        istenenBaslik = "Company";
        int istenenSutunIndex = -3;
        for (int i = 0; i < guruPage.headersList.size(); i++) {
            if (guruPage.headersList.get(i).getText().equals(istenenBaslik)) {
                istenenSutunIndex = i;
                break;
            }
        }
        istenenSutunIndex++;
        List<WebElement> sutunElementler = Driver.getDriver().findElements(By.xpath("//tbody//td[" + istenenSutunIndex + "]"));
        if (istenenSutunIndex != -3) {
            for (int i = 0; i < sutunElementler.size(); i++) {
                System.out.println(sutunElementler.get(i).getText());
            }
        } else {
            System.out.println("başlık bulunamadı");
        }
    }
}
