package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;

public class HerokuappStepDefinitions {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addButton.click();
    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteButton));
    }
    @Then("Delete botonunun gorunur oldugunu test eder")
    public void delete_botonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.deleteButton.click();
    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertTrue(herokuappPage.deleteElementList.isEmpty());
    }
}
