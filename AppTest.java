import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Test;

public class AppTest

{

    public WebDriver driver;

    public String baseUrl = "https://www.lambdatest.com/";

    @Test
    public void test2() {

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get(baseUrl);

        driver.close();

    }

}
