package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickCountTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Click Me!')]"));

        String expectedcount = "100";
        WebElement clickCount = driver.findElement(By.xpath("//span[contains(@class , 'counter')]"));
        for (int i = 0; i < 100; i++) {
            click.click();
        }
        String clickText = clickCount.getText();
        if (clickText.equals(expectedcount)){
            System.out.println("Click Counter App: Working as expected");
        }
        driver.quit();



    }
}
