import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  Adminlogin {
    public static WebElement UserName(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//form[@id='logonForm']//input[@id='username']"));
        return element;
    }
    public static WebElement Password(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//input[@id='password']"));
        return element;
    }
    public static WebElement Submit(WebDriver browser) {
        WebElement element = browser.findElement(By.xpath("//a[@id='formSubmitButton']"));
        return element;
    }
}



