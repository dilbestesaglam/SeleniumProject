import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsExample {

    public static void main(String[] args) {

        String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
        String CHROME_DRIVER_PATH = "/Users/dilbestesaglam/IdeaProjects/chromedriver";

        System.setProperty(CHROME_WEB_DRIVER, CHROME_DRIVER_PATH);
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://swisnl.github.io/jquery-contextmenu/demo.html");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement link = webDriver.findElement(By.linkText("Read the full documentation"));
        Actions action = new Actions(webDriver);
        action.moveToElement(link);
        action.contextClick(link);
        action.build().perform();

    }
}
