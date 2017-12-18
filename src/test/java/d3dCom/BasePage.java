package d3dCom;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    public static WebDriver driver;

    public void openbrowser() {
        String br = System.getProperty("browser");

        if (br.equals("Chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (br.equals("Firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        }


    }

    public void openurl(String url){
        driver.manage().window().maximize();
        driver.get(url);

    }


    public void Close_Browser() {

        driver.quit();
    }



}
