package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {

    GuruPage guruPage = new GuruPage();

    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        // listemiz web elementlerden olusuyor
        // dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini iceriyor

        int istenenenBaslikIndexi=-3; // index'ler negatif deger alamadıgı icin ayırt edebilmek adina negatif deger verildi
        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenenBaslikIndexi=i+1; // +1 dedik cunku html kodlarında index 1'den baslar
                break;
            }
        }
        // for loop ile tum sutun basliklarini bana verilen istenenSutun degeri ile karsilastirdim
        // loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve
        // bulundu ise yoluma devam etmek istiyorum

        if (istenenenBaslikIndexi!=-3){ // baslik bulundu
            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenenBaslikIndexi+"]"));

            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());
            }


        }else { // baslik bulunamadi
            System.out.println("istenen baslik bulunamadi");
        }
    }
}