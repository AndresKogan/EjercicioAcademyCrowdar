package Bussines.Interfaces;

import org.openqa.selenium.WebDriver;
import Bussines.Interfaces.BussinesInterface;
import Pages.GoogleSearchResultsPage;

public class GoogleSearchResultsBussines implements BussinesInterface {

        public GoogleSearchResultsPage googleSearchResultsPage;

        public GoogleSearchResultsBussines(WebDriver driver){
            super();
            this.googleSearchResultsPage = new GoogleSearchResultsPage(driver);
        }



        public void perform(String text) {
            System.out.println("EL valor retornado para el primer resultado es : "+googleSearchResultsPage.valorBusqueda());
        }
    }

