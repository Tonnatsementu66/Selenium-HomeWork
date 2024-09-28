package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class E13 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.syntaxprojects.com/basic-select-dropdown-demo-homework.php");

        WebElement fruit = driver.findElement(By.xpath("//select[@id='fav_fruit_selector']"));
        Select sel = new Select(fruit);
        sel.selectByVisibleText("Pear");

        List<WebElement> allFruit = sel.getOptions();
        for (WebElement all : allFruit) {
            System.out.println(all.getText());
        }

        WebElement multi = driver.findElement(By.xpath("//select[@id='select_multi_hobbies']"));
        Select sel1 = new Select(multi);
        boolean multisel = sel1.isMultiple();


        sel1.selectByVisibleText("Traveling");
        sel1.selectByVisibleText("Cooking");
        sel1.selectByVisibleText("Gardening");

        WebElement buttonAll = driver.findElement(By.xpath("//button[@id='get_all']"));
        buttonAll.click();
        WebElement result= driver.findElement(By.xpath("//p[@class='get_selected_values']"));
        System.out.println(result.getText());

       // List<WebElement> allElement =sel1.getOptions();
        //for (WebElement all : allElement) {
           // System.out.println(all.getText());
        //}
        //Thread.sleep(5000);
       // sel1.deselectByVisibleText("Traveling");
       // buttonAll.click();


    }


}

