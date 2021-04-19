package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Yanci");
        driver.findElement(By.name("lastname")).sendKeys("M");
        driver.findElement(By.name("reg_email__")).sendKeys("fakeemail@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("fakeemail@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("pass1234");
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}