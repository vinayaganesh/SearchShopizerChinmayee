
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
    public static WebElement search1(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='searchField']"));
        return element;
    }

    public static WebElement search2(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='searchField']"));
        return element;
    }
    public static WebElement search3(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//div[2]/input"));
        return element;
    }

}










