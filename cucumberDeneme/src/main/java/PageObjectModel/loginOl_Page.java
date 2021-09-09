package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilites.Driver;

import java.util.List;
import java.util.Random;

public class loginOl_Page extends AbstractClass{


    WebDriver driver;


    public loginOl_Page(){


        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath = "//span[@title='Giriş Yap']")
    private WebElement loginOlButton;

    public void clickLoginOlButton(){

        clickFunction(loginOlButton);

    }



    @FindBy(css= ".sf-OldMyAccount-32BWo>ul>:first-of-type>:first-of-type" )
    private WebElement girisYapButton;

    public void girisYapButton(){

        clickFunction(girisYapButton);

    }

    @FindBy(xpath= "//input[@id='txtUserName']" )
    private WebElement mailGirButton;

    public void mailGirButton(){

        sendKeysFunction(mailGirButton,"kamerchngr@gmail.com");

    }




    @FindBy(xpath= "//input[@id='txtPassword']" )
    private WebElement sifreGirButton;

    public void sifreGirButton(){

        sendKeysFunction(sifreGirButton,"K12345678");

    }




    @FindBy(xpath= "//button[@id='btnLogin']" )
    private WebElement girisYap2Button;

    public void GirisYap2Button(){

        clickFunction(girisYap2Button);

    }





    @FindBy(css= "input[class=desktopOldAutosuggestTheme-input]" )
    private WebElement araBulButton;

    public void araBulButton(){

        sendKeysFunction(araBulButton,"samsung");

    }



    @FindBy(css= "div[class=SearchBoxOld-buttonContainer]" )
    private WebElement  searchTiklaButton;

    public void searchTiklaButton(){

        clickFunction(searchTiklaButton);

    }

    @FindBy(xpath= "//label[@for='category-2147483642']" )
    private WebElement  telTiklaButton;

    public void telTiklaButton(){

        clickFunction(telTiklaButton);


    }

    @FindBy(xpath= "//label[@for='category-2147483642_371965']" )
    private WebElement  cepTiklaButton;

    public void cepTiklaButton(){

        clickFunction(cepTiklaButton);

    }

    @FindBy(xpath= "//header[@class=\"container title-wrapper for-suggestion\"]" )
    private WebElement  sonucBulButton;

    public void sonucBulButton(){

      Assertion(sonucBulButton,"samsung ile ilgili 128 ürün bulduk.");

        Assert.assertTrue(sonucBulButton.getText().contains("samsung"));
        System.out.println("Samsung ile ilgili 2.sayfa açıldı!");


    }

    @FindBy(xpath= "//a[@href=\"//www.hepsiburada.com/ara?kategori=2147483642_371965&q=samsung&sayfa=2\"]" )
    private WebElement  ikiyeTiklaButton;

    public void ikiyeTiklaButton(){


   clickFunction(ikiyeTiklaButton);


    }



    @FindBy(xpath= "//ul[@class='product-list results-container do-flex list']" )
    private WebElement  rastgeleSecButton;

    public void  rastgeleSecButton(){

        int num = rastgeleSecButton.findElements(By.tagName("li")).size();

        Random r = new Random();
        List<WebElement> list = rastgeleSecButton.findElements(By.tagName("li"));
        list.get(r.nextInt(num)).click();



    }




    @FindBy(xpath= "//div[@class='customerAccount-Like-2wPzH']" )
    private WebElement  begeneTiklaButton;

    public void begeneTiklaButton(){


        clickFunction(begeneTiklaButton);


    }




    @FindBy(xpath= "//div[@class='hb-toast-content-holder']" )
    private WebElement  popupKontrolButton;

    public void popupKontrolButton(){

        System.out.println(popupKontrolButton.getText());



    }
    @FindBy(xpath= "//a[@title='Hesabım'][1]" )
    private WebElement  hesabımaTıklaButton;

    public void hesabımaTıklaButton() throws Throwable{


        clickFunction(hesabımaTıklaButton);


    }


    @FindBy(css= ".sf-OldMyAccount-32BWo>ul>li>a[title=Beğendiklerim]" )
    private WebElement  begendiklerimKontrolButton;

    public void begendiklerimKontrolButton(){


        clickFunction(begendiklerimKontrolButton);


    }


    @FindBy(css= "div[class=my-list-summary-info]" )
    private WebElement  begendiklerimOnaylaButton;

    public void begendiklerimOnaylaButton(){

        System.out.println(begendiklerimOnaylaButton.getText());


    }



    @FindBy(css= ".product-list>div>ul>div:first-of-type>div:first-of-type" )
    private WebElement  begendiklerimSepeteEkleButton;

    public void begendiklerimSepeteEkleButton(){

        clickFunction(begendiklerimSepeteEkleButton);




    }

    @FindBy(css= "button[id=addToCart]" )
    private WebElement  bulunanEkleButton;

    public void bulunanEkleButton(){

        clickFunction(bulunanEkleButton);


    }

    @FindBy(xpath= "//span[@class='checkoutui-SalesFrontCash-XeG2a']" )
    private WebElement  sepetPopupButton;

    public void sepetPopupButton(){

        System.out.println(sepetPopupButton.getText());


    }

    @FindBy(xpath= "//button[text()='Sepete git']" )
    private WebElement  sepeteGitButton;

    public void sepeteGitButton(){

        clickFunction(sepeteGitButton);



    }

    @FindBy(xpath= "//a[@aria-label='Ürünü Kaldır']" )
    private WebElement  ürünKaldırButton;

    public void ürünkaldırButton(){

clickFunction(ürünKaldırButton);


    }

    @FindBy(xpath= "//span[text()='Ürün sepetinizden silinmiştir']" )
    private WebElement  sepetKontrolButton;

    public void sepetKontrolButton(){


        System.out.println(sepetKontrolButton.getText());

    }

}
