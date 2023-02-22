package MavenPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenClass_1 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver dr=new ChromeDriver();
        dr.get("https://demo.opencart.com/");
    }
}
