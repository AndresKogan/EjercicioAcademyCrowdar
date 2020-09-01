import Bussines.Interfaces.BussinesInterface;
import Bussines.Interfaces.GoogleSearchPageBussines;
import Bussines.Interfaces.GoogleSearchResultsBussines;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {

    private WebDriver webDriver;
    private BussinesInterface googleSearchBussines;
    private BussinesInterface googleSearchResultBussines;


    @Before
    public void settingTest(){
        System.setProperty("webdriver.chrome.driver", "./src/test/Resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com.ar");
        googleSearchBussines = new GoogleSearchPageBussines(webDriver);
        googleSearchResultBussines = new GoogleSearchResultsBussines(webDriver);
    }

    @After
    public void cleanUp(){
        webDriver.quit();
    }




    @Test
    public void executeAndVerify(){
        String text = "Crowdar";
        googleSearchBussines.perform(text);
        googleSearchResultBussines.perform(text);
    }

}




