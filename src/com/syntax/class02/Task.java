package com.syntax.class02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.className("txt")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("web orders")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is incorrect");
        }
        driver.findElement(By.id("ctl00_logout")).click();
        driver.quit();


    }
}
