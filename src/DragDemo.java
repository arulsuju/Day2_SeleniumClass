import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
    public static void main(String[] args) {

        WebDriver mybrowser=new FirefoxDriver();
        mybrowser.get("http://beej.us/blog/data/drag-n-drop/");


        WebElement source_id=mybrowser.findElement(By.id("goat0"));
        WebElement destination_id=mybrowser.findElement(By.id("goat1"));

        Actions actions=new Actions(mybrowser);
        //build and perform will do composite methods- must called build() and perform()
        actions.dragAndDrop(source_id,destination_id).build().perform();


    }
}
