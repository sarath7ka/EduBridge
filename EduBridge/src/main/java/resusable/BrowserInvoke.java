package resusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserInvoke {

    public static WebDriver driver;
    public static Properties prob ;

    public static void launchApp() throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/configuations/utility.properties"));
        prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser").toLowerCase()){

            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new InvalidArgumentException("inject the correct browser name");
        }

        driver.navigate().to( prob.getProperty("url"));
        driver.manage().window().maximize();
        driver.navigate().refresh();

    }
}
