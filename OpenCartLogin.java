package MavenPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class OpenCartLogin {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd=new ChromeDriver();
        wd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

        wd.manage().window().maximize();

        String url=wd.getCurrentUrl();
        System.out.println("URL : "+url);

        String title=wd.getTitle();
        System.out.println("Title : "+title);

    }
}
