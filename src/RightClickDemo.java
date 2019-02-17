import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
    public static void main(String[] args) {

        WebDriver mybrowser=new FirefoxDriver();
        mybrowser.get("https://www.google.com/");

        WebElement link=mybrowser.findElement(By.linkText("தமிழ்"));
        Actions actions=new Actions(mybrowser);
        actions.contextClick(link).build().perform();
        actions.sendKeys("k").build().perform();


    }
}
