package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo-homework.php");

       List< WebElement> country=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
       int count=1;
       for(WebElement ct:country){
           String statusCountry= ct.getText();
           if(statusCountry.equals("USA")){
               System.out.println(count);
               WebElement row=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
               System.out.println(row.getText());
           }
           count=count+1;
       }



    }
}
