package Bussines.Interfaces;


import Pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageBussines implements BussinesInterface {

    private GoogleHomePage googleHomePage;

    public GoogleSearchPageBussines(WebDriver driver){
        this.googleHomePage= new GoogleHomePage(driver);


    }

    public void perform(String texto1) {

        googleHomePage.buscarEnGoogle(texto1);
        googleHomePage.clickButton();

    }
}
