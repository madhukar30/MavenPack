package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BMWScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver dr = new ChromeDriver();

        dr.manage().window().maximize();

        dr.get("https://www.bmw.in/en/index.html");
        ((JavascriptExecutor) dr).executeScript("scroll(0,850)");

        Thread.sleep(2000);

        dr.findElement(By.xpath("/html/body/div[1]/main/div[1]/div[6]/div[2]/div[6]/div/div[2]/div[2]/ul/li[1]/a")).click();
        System.out.println("Selected");
    }
}
