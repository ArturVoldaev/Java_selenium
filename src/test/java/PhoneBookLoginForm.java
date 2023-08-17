import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.util.List;

public class PhoneBookLoginForm {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        driver.manage().window().maximize();
    }

    @Test
    public void findLoginForm() {
        WebElement loginLogin__3EHKB = driver.findElement(By.className("login_login__3EHKB"));
    }

    @Test
    public void findLoginInput() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/input[1]"));
        System.out.println(element);
    }

    @Test
    public void findButtons() {
        List<WebElement> element = driver.findElements(By.tagName("button"));
        for(WebElement e : element) {
            System.out.println(e.getText());
        }
    }

    @Test
    public void findButtonLogin() {
        List<WebElement> element = driver.findElements(By.tagName("button"));
        for(WebElement e : element) {
            if (e.getText() == "Login") { // kak iskat`
                System.out.println(e.getText());
                System.out.println("666");
            }
        }
    }
    @Test
    public void putDataInForm() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/input[1]")).sendKeys("admin@localhost.dev");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/input[2]")).sendKeys("6666666666666666666");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/button[1]")).click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }





}
