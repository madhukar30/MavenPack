package MavenPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffmailLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://mail.rediff.com/cgi-bin/login.cgi");

        String ckbox=wd.findElement(By.name("remember")).getText();
        System.out.println(ckbox);

        wd.findElement(By.id("login1")).sendKeys("test123");
        wd.findElement(By.name("proceed")).click();

        Alert al=wd.switchTo().alert();
        String alert_msg=al.getText();
        System.out.println(alert_msg);

        //Thread.sleep(5000);

        al.accept();

        wd.findElement(By.id("password")).sendKeys("test123");


        Thread.sleep(10000);
        wd.quit();
    }
}
