package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class EmpireState extends CommonAPI {

    @Test
    public void empireState() throws InterruptedException {
        driver.findElement(By.name("search")).sendKeys("empire state building", Keys.ENTER);
        Thread.sleep(2000);
    }
}
