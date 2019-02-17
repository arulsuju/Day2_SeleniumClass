import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickandMoveDemo {
    public static void main(String[] args) {

        WebDriver mybrowser=new FirefoxDriver();
        mybrowser.get("https://www.google.com/");


        WebElement link=mybrowser.findElement(By.className("gb_P"));
        Actions actions=new Actions(mybrowser);
        actions.doubleClick(link).build().perform();
        mybrowser.quit();

        WebDriver mybrowser1=new FirefoxDriver();
        mybrowser1.get("http://learn-automation.com/");

        WebElement link_a=mybrowser1.findElement(By.linkText("Automation Tools"));
        Actions actions1=new Actions(mybrowser1);
        actions1.moveToElement(link_a).build().perform();
        mybrowser1.quit();


    }
}
