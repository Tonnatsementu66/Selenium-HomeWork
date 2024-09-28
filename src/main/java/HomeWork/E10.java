package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E10 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo-homework.php");

        
        WebElement fruitDD = driver.findElement(By.xpath("//div[@id='dream_fruits']"));
        fruitDD.click();

        List<WebElement> allfruits = driver.findElements(By.xpath("//ul[@class='dropdown-menu single-dropdown-menu']/li/a"));

        for(WebElement fruit:allfruits){
            if(fruit.getText().equals("Mango")){
               fruit.click();
            }
        }

        WebElement hobbyDD=driver.findElement(By.xpath("//div[@id='favorite_hobbies']"));
        hobbyDD.click();

        List<WebElement>allHobbys=driver.findElements(By.xpath("//ul[@class='dropdown-menu multi-dropdown-menu']/li/a"));
        for(WebElement hobby:allHobbys){
            if(hobby.getText().equals("Reading")){
                hobby.click();
            }
        }

    }
}

