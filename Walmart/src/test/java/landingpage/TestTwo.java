package landingpage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTwo extends CommonAPI {

    @Test
    public void testTwo(){
        String titleOfWebpage = "Walmart.com | Save Money. Live Better.";
        String realTitle = driver.getTitle();
        Assert.assertEquals(realTitle, titleOfWebpage);

    }
}
