package homepage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPage extends CommonAPI {

    @Test
    public void title(){
        String actualTitle = driver.getTitle();
        String testTitle = "Wikipedia, the free encyclopedia";
        Assert.assertEquals(actualTitle, testTitle);
    }
}
