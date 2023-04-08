package cucumber;


import base.DriverManager;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.util.Properties;

public class ApplicationHooks {

    WebDriver driver;
    Properties prop;
    DriverManager driverManager;


    public ApplicationHooks(DriverManager driverManager){
        try {
            this.driverManager=driverManager;
            driver=driverManager.getDriverInstance();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
//            Allure.addAttachment("screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
//            byte[] img=(byte[]) ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(img,"image/jpeg",scenario.getName());
        }
        driverManager.closeBrowser();
    }

}
