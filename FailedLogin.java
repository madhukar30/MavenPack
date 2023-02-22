package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class FailedLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

        wd.manage().window().maximize();

        String expectedval="Returning Customer!";
        wd.findElement(By.id("input-email")).sendKeys("Test123");
        wd.findElement(By.id("input-password")).sendKeys("Test123");
        wd.findElement(By.xpath("//*[@id=\"form-login\"]/button"));

        WebElement phn=wd.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[1]/a/i"));
        if(phn.isDisplayed()){
            System.out.println("Correct Phn number!");
        }
        else{
            System.out.println("Invalid Phone number!");
        }
    }
}
