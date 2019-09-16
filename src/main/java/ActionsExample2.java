import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsExample2 {

    public static void main(String[] args) {

        String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
        String CHROME_DRIVER_PATH = "/Users/dilbestesaglam/IdeaProjects/chromedriver";

        System.setProperty(CHROME_WEB_DRIVER, CHROME_DRIVER_PATH);
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.primefaces.org/primereact/#/orderlist");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement element1 = webDriver.findElement(By.xpath("//div[@id='layout-content']/div/div[2]/div/div/div/div[2]/ul/li[2]/div"));
        WebElement element2 = webDriver.findElement(By.xpath("//div[@id='layout-content']/div/div[2]/div/div/div/div[2]/ul/li[6]/div"));

        Actions actions = new Actions(webDriver);
        actions.keyDown(Keys.COMMAND);
        actions.click(element1);
        actions.click(element2);
        actions.keyUp(Keys.COMMAND);
        actions.build().perform();
    }
}
