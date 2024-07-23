package com.example;

import org.junit.Test;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
// import 

import org.openqa.selenium.chrome.ChromeOptions;



public class AppTest {
    public WebDriver driver;

    public String baseUrl = "https://www.lambdatest.com/";

    @Test
    public void test1() {
        // ChromeOptions options;
        WebDriverManager.chromedriver().driverVersion("116.0.5845.96").setup();
         // System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        // options.setBinary(Constants.WebDriverPaths.sChromeBin);
        driver = new ChromeDriver();

        driver.get(baseUrl);

        driver.close();
    }
}
