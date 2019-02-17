import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropWithoutMethods {
    public static void main(String[] args) {
        WebDriver mybrowser=new FirefoxDriver();
        mybrowser.get("http://beej.us/blog/data/drag-n-drop/");


        WebElement source_id=mybrowser.findElement(By.id("goat0"));
        WebElement destination_id=mybrowser.findElement(By.id("goat1"));
        Actions myaction=new Actions(mybrowser);
        myaction.clickAndHold(source_id).build().perform();
        myaction.moveToElement(destination_id).build().perform();
        myaction.release(source_id).build().perform();

        myaction.dragAndDropBy(source_id,-50,-50).build().perform();


    }
}
