package MavenPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HackerRank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://www.hackerrank.com/auth/login");
        // wd.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/nav/div/div[2]/ul[2]/li[2]/button")).click();

        wd.findElement(By.id("input-1")).sendKeys("srinivasamadhukar33@gmail.com");
        wd.findElement(By.id("input-2")).sendKeys("madhukar08");
        wd.findElement(By.xpath("//*[@id=\"tab-1-content-1\"]/div[1]/form/div[4]/button")).click();

        Thread.sleep(3000);
        String exp_url="https://www.hackerrank.com/dashboard";

        if (exp_url.equalsIgnoreCase(wd.getCurrentUrl())){
            System.out.println("Login successful!");
        }
        else{
            System.out.println("Login failed....try the forgot password option!");
            Thread.sleep(2000);
            wd.findElement(By.xpath("//*[@id=\"tab-1-content-1\"]/div[1]/form/div[3]/a")).click();
        }
    }
}
