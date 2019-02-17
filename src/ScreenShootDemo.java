import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.File;

public class ScreenShootDemo {

    public static void main(String[] args)throws Exception {

        WebDriver mybrowser =new FirefoxDriver();
        mybrowser.get("https://www.google.com");

        EventFiringWebDriver eventFiringWebDriver=new EventFiringWebDriver(mybrowser);
        File file=eventFiringWebDriver.getScreenshotAs(OutputType.FILE);
        File file1=new File("screenshots.jpeg");
        FileUtils.copyFile(file,file1);


    }
}
