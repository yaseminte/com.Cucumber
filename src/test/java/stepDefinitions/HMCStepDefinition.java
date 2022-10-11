package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinition {
    HMCPage hmcPage = new HMCPage();

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.loginButton.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.userNameButton.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.passwordButton.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.ikinciLoginButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.managerYazisi.isDisplayed());
    }
}
