package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class E14 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo-homework.php");
        String mainPageWH= driver.getWindowHandle();
        System.out.println("The window hadle of the main page:"+ mainPageWH);
        WebElement b1= driver.findElement(By.xpath("//a[text()='Open B1 Page ']"));
        WebElement b2= driver.findElement(By.xpath("//a[text()=' Open B2 Page ']"));
        b1.click();
        b2.click();

        Set<String> allHandles=driver.getWindowHandles();
        for(String handle:allHandles){
            driver.switchTo().window(handle);
            String url=driver.getCurrentUrl();
            if(url.equals("https://syntaxprojects.com/b1-page.php")){
                WebElement B1text= driver.findElement(By.xpath("//h2[contains(text(),'Welcome to B1! page')]"));
                if(B1text.getText().equals("Welcome to B1! page")){
                    System.out.println("The text in window B1 correct");
                }
                break;
            }
        }
        System.out.println("The current focus of driver on window"+ driver.getCurrentUrl());

        driver.switchTo().window(mainPageWH);

        Set<String> allHandles1=driver.getWindowHandles();
        for(String handle1:allHandles1){
            driver.switchTo().window(handle1);
            String url= driver.getCurrentUrl();
            if(url.equals("https://syntaxprojects.com/b2-page.php")){
                WebElement B2text= driver.findElement(By.xpath("//h2[contains(text(),'Welcome to B2 page')]"));
                if(B2text.getText().equals("Welcome to B2 page")){
                    System.out.println("The text in window B2 correct");
                }
                break;
            }
        }
        driver.switchTo().window(mainPageWH);





        
    }
}
