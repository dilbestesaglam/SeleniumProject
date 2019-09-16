import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstScript {

    public static void main(String[] args) {
        String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
        String CHROME_DRIVER_PATH = "/Users/dilbestesaglam/IdeaProjects/chromedriver";

        System.setProperty(CHROME_WEB_DRIVER, CHROME_DRIVER_PATH);

        // Open Chrome Browser
        WebDriver chromeDriver = new ChromeDriver();

        //Open www.seleniumappium.com
        chromeDriver.get("http://www.seleniumappium.com/");
    }
}
