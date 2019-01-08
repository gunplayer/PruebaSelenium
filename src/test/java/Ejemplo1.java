import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ejemplo1 {

    public static void main(String[] args) throws InterruptedException {

        // Creamos una instancia de FirefoxDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\IdeaProjects\\PruebaSelenium\\src\\main\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String web = "https://www.google.com/gmail";

        driver.get(web);

        //Maximizamos la ventana
        //driver.manage().window().maximize();

        //driver.findElement(By.id("identifierId")).sendKeys("lvaldes@acl.cl");
        //driver.findElement(By.id("identifierNext")).click();

        //if(driver.getCurrentUrl().contains("https://accounts.google.com/signin/v2/identifier?"))
        //{
            driver.findElement(By.id("identifierId")).sendKeys("lvaldes@acl.cl");
            driver.findElement(By.id("identifierNext")).click();

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
            driver.findElement(By.name("password")).sendKeys("xxxxxxx");
            driver.findElement(By.id("passwordNext")).click();
            Thread.sleep(10000);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.className("gb_0a")));
        //}
        driver.close();
    }

}

