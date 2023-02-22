package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Users/schava238/Downloads/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://jqueryui.com/");
        Thread.sleep(2000);
        wd.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();

        wd.switchTo().frame(0);
        Thread.sleep(2000);

        WebElement src=wd.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
        WebElement dest=wd.findElement(By.xpath("//*[@id=\"droppable\"]"));

        Actions act=new Actions(wd);
        act.clickAndHold(src).moveToElement(dest).release().build().perform();
    }
}
