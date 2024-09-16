package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.syntaxprojects.com");
        driver.manage().window().maximize();

        String url= driver.getCurrentUrl();
        System.out.println("Current URL is: "+ url);

        String title= driver.getTitle();
        System.out.println("Title is:"+ title);

        driver.quit();
    }
}
