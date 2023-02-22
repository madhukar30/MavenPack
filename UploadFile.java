package MavenPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/schava238/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver dr = new ChromeDriver();

        dr.manage().window().maximize();

        dr.get("https://www.reduceimages.com/");
        dr. findElement(By.xpath("//*[@id=\"dropzone-container-offline\"]/div[2]/button")).click();

        Thread.sleep(10000);
        WebElement img=dr.findElement(By.xpath("//*[@id=\"image_previews_2\"]/div[2]/div/img"));
        if (img.isDisplayed()){
            ((JavascriptExecutor)dr).executeScript("scroll(0,800)");
            Thread.sleep(2000);
            dr.findElement(By.xpath("//*[@id=\"offline-submit-button\"]")).click();
            System.out.println("Done");
        }
    }
}
