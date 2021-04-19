package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\yanci\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Amazon.com");
        String title=driver.getTitle();
        String url= driver.getCurrentUrl();
        System.out.println(url+" "+title);
        driver.quit();
    }
}
