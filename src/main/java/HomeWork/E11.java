package HomeWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E11 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.syntaxprojects.com/javascript-alert-box-demo-homework.php");

        WebElement Remainder= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Remainder.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();


        WebElement delete= driver.findElement(By.xpath("//button[@style='background:yellow;']"));
        delete.click();
        alert.dismiss();
        WebElement textMsg=driver.findElement(By.xpath("//p[@id='confirm-demo']"));
        System.out.println(textMsg.getText());

        WebElement nameCollection= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        nameCollection.click();
        alert.sendKeys("Hello");
        alert.accept();
        WebElement name= driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
        if(name.getText().equals("You have entered 'Hello' !")){
            System.out.println("Name is correct");
        }else{
            System.out.println("error");
        }




    }
}
