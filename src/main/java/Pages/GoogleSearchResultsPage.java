package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchResultsPage {
    private WebDriver driver;


    public GoogleSearchResultsPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public String valorBusqueda(){
        List<WebElement> valor = driver.findElements(By.cssSelector("#rso>div>div"));
        WebElement primer_valor = valor.get(0);
        return  primer_valor.getText();
    }
}
