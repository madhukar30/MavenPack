package MavenPack;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver dr=new ChromeDriver();

        dr.manage().window().maximize();

        dr.get("https://github.com");
        System.out.println(dr.getTitle());

        dr.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div[2]/a")).click();
        Thread.sleep(2000);
        System.out.println(dr.getCurrentUrl());

        dr.findElement(By.id("login_field")).sendKeys("madhukar30");
        dr.findElement(By.id("password")).sendKeys("Madhukar07");
        dr.findElement(By.name("commit")).click();

        Thread.sleep(5000);

        dr.findElement(By.xpath("//*[@id=\"AppHeader-notifications-button\"]/svg"));
        dr.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div"));
        try {
            if (dr.findElement(By.xpath("//*[@id=\"AppHeader-notifications-button\"]/svg")).isDisplayed()) {
                System.out.println("Login successfull");
            } else if (dr.findElement(By.xpath("//*[@id=\"js-flash-container\"]/div")).isDisplayed()) {
                System.out.println("Login failed");
            }
        }
        catch (Exception e){
            System.out.println("Exception caught!");
        }
    }
}
