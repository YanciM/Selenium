package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yanci");
        driver.findElement(By.id("customer.lastName")).sendKeys("Montiel");
        driver.findElement(By.name("customer.address.street")).sendKeys("Address12345");
        driver.findElement(By.id("customer.address.city")).sendKeys("City12345");
        driver.findElement(By.id("customer.address.state")).sendKeys("Maryland");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20744");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("301-111-2222");
        driver.findElement(By.name("customer.ssn")).sendKeys("111111111");
        driver.findElement(By.id("customer.username")).sendKeys("YanciM");
        driver.findElement(By.id("customer.password")).sendKeys("password");
        driver.findElement(By.name("repeatedPassword")).sendKeys("password");
        driver.findElement(By.className("button")).click();
        driver.quit();

    }
}
