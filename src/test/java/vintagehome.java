import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class vintagehome {
        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            System.out.println("Register");
           // driver.get("http://localhost:8080/shop/");
            driver.get("http://localhost:8080/admin/");
            driver.manage().window().maximize();
           // driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")).click();
         //   MyAccount.myAccount(driver).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            /*driver.manage().window().maximize();
            MyAccount.registerAccount(driver).click();
            MyAccount.firstName(driver).sendKeys("MyYellowTeam3");
            MyAccount.lastName(driver).sendKeys("Sprintteam3");
            MyAccount.selectCountry(driver).sendKeys("Australia");
            MyAccount.selectState(driver).sendKeys("Western Australia");

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            MyAccount.selectEmail(driver).sendKeys("MyTeamyellow3@gmail.com");
            MyAccount.typePassword(driver).sendKeys("acsmvyt6");
            MyAccount.repeatPassword(driver).sendKeys("acsmvyt6");
            MyAccount.createAccount(driver).click();

            search.search1(driver).click();
            search.search2(driver).sendKeys("hand bags");
            search.search3(driver).click();
*/
            Adminlogin.UserName(driver).sendKeys("admin@shopizer.com");
            Adminlogin.Password(driver).sendKeys("password");
            Adminlogin.Submit(driver).click();



        }
    }

