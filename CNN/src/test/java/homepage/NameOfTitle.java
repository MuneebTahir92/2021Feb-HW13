package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class NameOfTitle extends CommonAPI {

    @Test
    public void getTitle() throws InterruptedException {
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
    }
}
