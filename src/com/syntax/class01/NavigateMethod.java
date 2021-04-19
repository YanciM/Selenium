package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://facebook.com");
        driver.navigate().to("https://google.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.close();  // will close the current tab
       // driver.quit();  // will close the whole browser


        /*
       - navigate() vs get()....
       - get()...will wait for the whole page to load whereas
        navigate() will not

       - navigate() method will move  back, forward, refresh
       -get() will not keep history of your browser whereas navigate() will
         */

    }

}
