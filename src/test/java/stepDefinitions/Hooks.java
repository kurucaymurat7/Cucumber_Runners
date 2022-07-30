package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    cucumberda extends TestBase dememize gerek kalmadan stepDefinitions
    package içinde @before @after gibi bir annotation varsa, her scenario'dan
    once ve veya sonra bu methodlar calisacaktir.

    Bu da bizim istediğimiz bir durum değildir.

    Cucumber'da kullanmamız gerekirse, stepDefinitions altındaki Hooks class
    içine koyarız.

    Biz her senaryodan sonra test sonucu kontrol edip failed olan scenario'lar için
    Screenshot alması amacıyla @After methodu kullanacagiz.
     */
    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }
}
