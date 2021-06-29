package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // To open Gmail site
        driver.get("https://www.gmail.com");


        //enter gmail credentials
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("test1014409@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password")));
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("vgyuhb852");

        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();

        //click on compose button
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();

        driver.quit();
    }
}
