package com.syntax.class01;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MaximizeWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
       // driver.navigate().back();

    }
}