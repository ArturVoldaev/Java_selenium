import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class PhoneBookTest {
    WebDriver driver;
    //before - setUp()
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    //test - test()
    @Test
    public void usingByMethod() {
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        WebElement container = driver.findElement(By.className("container"));
        System.out.println(container.getText());
        List<WebElement> div = driver.findElements(By.tagName("div"));
        System.out.println(div);
    }

    //after - tearDown()
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
