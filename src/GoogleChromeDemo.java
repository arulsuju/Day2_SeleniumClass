import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChromeDemo {

    public static void main(String[] args)throws Exception {

        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            WebDriver googleChrome = new ChromeDriver();
            googleChrome.get("https://www.google.com");
            googleChrome.quit();


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
