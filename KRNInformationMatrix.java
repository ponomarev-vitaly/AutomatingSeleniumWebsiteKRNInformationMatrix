import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KRNInformationMatrix {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://krninformatix.com/selenium/testing.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[11]/div[1]/p[1]/button[1]")).click();
        Thread.sleep(3000);
        String altText = driver.switchTo().alert().getText();
        System.out.println(altText);
        driver.switchTo().alert().accept();
        driver.quit();

    }

}
