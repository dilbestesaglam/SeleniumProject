import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertsHandling {

    public static void main(String[] args) throws InterruptedException {

        String CHROME_WEB_DRIVER = "webdriver.chrome.driver";
        String CHROME_DRIVER_PATH = "/Users/dilbestesaglam/IdeaProjects/chromedriver";

        System.setProperty(CHROME_WEB_DRIVER, CHROME_DRIVER_PATH);
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://javascript.info/alert-prompt-confirm");
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);


        WebElement elementButton = webDriver.findElement(By.xpath("//div[2]/div[2]/div/div/div/a"));
        elementButton.click();

        Alert alert = webDriver.switchTo().alert();
        String text = alert.getText();
        Thread.sleep(2000);
        System.out.println(text);
        alert.accept();
    }
}
