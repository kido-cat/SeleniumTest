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
    public void test() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get(baseUrl);

        driver.close();
    }
}
