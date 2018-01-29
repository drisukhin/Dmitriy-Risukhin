import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class FirstTest extends TestBase {

    @Test
    public void FirstTest() {
        OpenGoogle();
        wd.findElement(By.id("lst-ib")).click();
        wd.findElement(By.id("lst-ib")).clear();
        wd.findElement(By.id("lst-ib")).sendKeys("selenium ");
        wd.findElement(By.xpath("//div[@id='sbse2']//b[.=' webdriver']")).click();
        wd.findElement(By.name("submit")).click();
        wd.findElement(By.name("submit")).click();
    }

}
