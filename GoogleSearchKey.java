package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchKey {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver dr = new ChromeDriver();

        dr.manage().window().maximize();

        dr.get("https://www.google.com/");

        dr.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(2000);
        //dr.findElement(By.name("btnk")).click();
        dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
