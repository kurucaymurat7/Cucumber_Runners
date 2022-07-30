package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/cucumber_reports.html"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@smoke",
        dryRun = false // eksik adımları kontrol edip onları gosterir.
)

public class RunnerSmokeTests {
    /*
    bir framwork'te bir tek TestRunner class yeterli olabilir.
    TestRunner classında class body'sinden hiçbirşey olmaz.
    TestRunner classınızı onemli yapan 2 adet annotation vardır.
    @RunWith annotation kullanabilmek için Cucumber Junit yükledik.

     features: TestRunner dosyasının feature dosyalarını nereden bulacagını tarif eder
     glue: stepDefinitions dosyalarini nereden bulacagimizi gosterir.
     tags: o an hangi tag'i calistiracagimizi istiyorsak onun tagini yazariz.

     dryRun = true, testimizi calistirmadan bize eksik adımları verir.
     */
}
