package stepDefination;


import PageObjectModel.loginOl_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilites.Driver;

import java.util.concurrent.TimeUnit;

public class Login_Steps {


private WebDriver driver;

loginOl_Page loginOl_page=new loginOl_Page();




    @Given("navigate to website")
    public void navigate_to_website() throws Throwable {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);





    }

    @Given("login ola tıkla")
    public void login_ola_tıkla() throws Throwable {


     loginOl_page.clickLoginOlButton();

    }

    @Given("giriş yapa tıkla")
    public void giriş_yapa_tıkla() throws Throwable {

    loginOl_page.girisYapButton();

    }

    @Given("mail gir")
    public void mail_gir() throws Throwable{

        loginOl_page.mailGirButton();
        Thread.sleep(3000);


    }

    @Given("sifre gir")
    public void sifre_gir() throws Throwable {

        loginOl_page.sifreGirButton();
        Thread.sleep(3000);


    }



    @Given("giriş yap butonuna tıkla")
    public void giriş_yap_butonuna_tıkla() throws Throwable{

        loginOl_page.GirisYap2Button();
        Thread.sleep(3000);

    }

    @Given("search alanına samsung yaz")
    public void search_alanına_samsung_yaz() throws Throwable {

     loginOl_page.araBulButton();
     Thread.sleep(4000);


    }

   @Given("search butonuna tıkla")
    public void search_butonuna_tıkla() throws Throwable {



        loginOl_page.searchTiklaButton();
    }




    @Given("sol menüden telefona tıkla")
    public void sol_menüden_telefona_tıkla() throws Throwable {

        loginOl_page.telTiklaButton();
        Thread.sleep(3000);

    }

    @Given("cep telefonuna tıkla")
    public void cep_telefonuna_tıkla() throws Throwable {

        loginOl_page.cepTiklaButton();

    }


    @Given("samsung icin sonuc bulundu")
    public void samsung_icin_sonuc_bulundu() throws Throwable {


    loginOl_page.sonucBulButton();
    Thread.sleep(3000);

    }


    @Given("sayfa ikiye tıkla")
    public void sayfa_ikiye_tıkla() throws Throwable{


        loginOl_page.ikiyeTiklaButton();

    }



    @Given("rastgele bir ürün seç")
    public void rastgele_bir_ürün_seç() throws Throwable {


        loginOl_page.rastgeleSecButton();
        Thread.sleep(3000);

    }


    @Given("ürün detayında begene tıkla")
    public void ürün_detayında_begene_tıkla() throws Throwable {

        loginOl_page.begeneTiklaButton();
        Thread.sleep(3000);

    }



    @Given("popup kontorlü yap")
    public void popup_kontorlü_yap() throws Throwable{

        loginOl_page.popupKontrolButton();

    }




    @Given("hesabima tikla")
    public void hesabima_tikla() throws Throwable{

        loginOl_page.hesabımaTıklaButton();


    }


    @Given("begendiklerime tıkla")
    public void begendiklerime_tıkla() throws Throwable{


        loginOl_page.begendiklerimKontrolButton();
        Thread.sleep(5000);

    }



    @Given("begendiklerime alınan ürün onaylanacak")
    public void begendiklerime_alınan_ürün_onaylanacak() throws Throwable{

       loginOl_page.begendiklerimOnaylaButton();
       Thread.sleep(5000);

    }


    @Given("begendiklerime alınan ürün sepete eklenecek")
    public void begendiklerime_alınan_ürün_sepete_eklenecek() throws Throwable{

        loginOl_page.begendiklerimSepeteEkleButton();
        Thread.sleep(3000);

    }



    @Given("bulunan ürün eklendi")
    public void bulunan_ürün_eklendi() throws Throwable{

        loginOl_page.bulunanEkleButton();

    }


    @Given("ürün sepete eklendi popup kontrolü")
    public void ürün_sepete_eklendi_popup_kontrolü() throws Throwable{

            loginOl_page.sepetPopupButton();

    }



    @Given("sepete git")
    public void sepete_git()throws Throwable{

        loginOl_page.sepeteGitButton();
Thread.sleep(3000);
    }

    @Given("ürünü kaldır")
    public void ürünü_kaldır() throws Throwable {

        loginOl_page.ürünkaldırButton();
        Thread.sleep(3000);

    }

    @Given("ürün sepetten kaldırılmıs")
    public void ürün_sepetten_kaldırılmıs() throws Throwable {

        loginOl_page.sepetKontrolButton();
    }


}
