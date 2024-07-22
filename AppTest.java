import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AppTest

{

    public WebDriver driver;

    public String baseUrl = "https://www.lambdatest.com/";

    public void test1() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");

        options.addArguments("--disable-dev-shm-usage");

        options.addArguments("--headless");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get(baseUrl);

        driver.close();

    }

}
