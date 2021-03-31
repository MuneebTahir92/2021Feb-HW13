package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestThree extends CommonAPI {

    @Test
    public void testThree() throws InterruptedException {
        driver.findElement(By.name("query")).sendKeys("video game");
        Thread.sleep(2000);
        driver.findElement(By.name("query")).sendKeys("s");
        Thread.sleep(2000);
        driver.findElement(By.name("query")).sendKeys(Keys.CLEAR);
        Thread.sleep(2000);
    }
}
