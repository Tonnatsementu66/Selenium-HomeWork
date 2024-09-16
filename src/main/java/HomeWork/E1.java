package HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://www.google.com");
        String title= driver.getTitle();
        System.out.println("Title is:" +title);

        driver.navigate().to("http://www.syntaxprojects.com");
        String title1= driver.getTitle();
        System.out.println("Title is: "+ title1);
        driver.navigate().back();

        driver.navigate().refresh();

        driver.quit();
    }
}
