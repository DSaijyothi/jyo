package basepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SpiceJetBasePage
{
    WebDriver driver;
    @BeforeSuite
    public void LaunchSpiceJet()
    {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
    }

    @BeforeTest
    public void SpiceJetLaunchPage()
    {
        String url="https://www.spicejet.com/";
        driver.get(url);
    }
    @AfterSuite
    public void KillSession()
    {
        driver.quit();

    }

}
