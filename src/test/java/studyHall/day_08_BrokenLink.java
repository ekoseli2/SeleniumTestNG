package studyHall;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.util.List;

public class day_08_BrokenLink extends TestBase {

    @Test
    public void BrokenLink(){
        driver.get("https://demoqa.com/broken");
        HttpURLConnection http=null;

        int response=200; //200 is Status Code and it means success
        String url="";
        List<WebElement> links=driver.findElements(By.tagName("link"));
        int actualLinksSize=links.size();
        System.out.println(actualLinksSize);







    }


}
