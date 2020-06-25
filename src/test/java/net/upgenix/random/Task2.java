package net.upgenix.random;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    /**
     * Task:
     * Navigate to a WebPage which has 5 links
     * Identify ALL 5 links
     * Iterate through each link and click in ONE action
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("url");

        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for (WebElement each : links){
            new Clicker(each).run();
        }
        driver.close();
    }



}
