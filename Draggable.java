package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Draggable {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://jqueryui.com/draggable/");
        wd.switchTo().frame(0);

        String drag = wd.findElement(By.xpath("/html/body/div/p")).getText();
        System.out.println(drag);
    }
}
