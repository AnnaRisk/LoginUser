import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class LogWeb {


    private WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @Test
    void firstTest() {
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("Anna");
        driver.findElement(By.id("password")).sendKeys("qwerty123");
        driver.findElement(By.xpath("//*[@class=\"radius\"]")).click();
       // driver.findElement(By.name("Login")).click();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }


}
