package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver =null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com") String url )

    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\farha\\Desktop\\WebAutomationFrameWork2018\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
@AfterMethod
    public void cleanUp()
{
   driver.close();
}
}
