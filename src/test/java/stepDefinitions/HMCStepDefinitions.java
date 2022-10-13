package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Then("Log in yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.loginButton.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        hmcPage.ikinciLoginButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
        Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.ikinciLoginButton.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.userNameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }


    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmcPage.userNameBox.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        hmcPage.passwordBox.sendKeys(password);
    }
}
