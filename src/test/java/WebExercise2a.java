import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Zakir on 7/14/17.
 */
public class WebExercise2a {

    private WebDriver driver = null;

    @BeforeMethod
    public void setup(){
        ChromeDriverManager.getInstance().arch32().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        String url = "file:///" + System.getProperty("user.dir") + "/src/test/resources/index.html";
        driver.navigate().to(url);
    }

    @Test
    public void displayItem3rdand5thTest(){

        List<WebElement> items = driver.findElements(By.xpath("//span[contains(text(), 'Applesauce') or contains(text(), 'Juice')]"));

        for(WebElement item : items){
            System.out.println(item.getText());
        }
    }

    @Test
    public void test2(){

        Map<List<WebElement>, List<WebElement>>map = new Hashtable<List<WebElement>, List<WebElement>>();

        List<WebElement> foodList = driver.findElements(By.xpath("//span[@ng-bind='food.name']"));
        List<WebElement> servingList = driver.findElements(By.xpath("//span[@ng-bind='food._servingDesc']"));



       /*for (int i = 0; i < foodList.size(); i++){
           for (int j=1; j >= i ; j+=2)
            map.put(items.get(i).getText(), items.get(j).getText());
        }*/


        Set set = map.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)i.next();
            System.out.print(mapEntry.getKey() + " |-> ");
            System.out.println(mapEntry.getValue());
        }
        System.out.println();



    }

    @AfterMethod
    public void teardown(){


    }
}
