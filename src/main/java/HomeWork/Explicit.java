package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicit {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/synchronization-explicit-wait-homework.php");

        WebElement chgText= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        chgText.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='headingtext']"),"Ssyntaxtechs"));

        WebElement text= driver.findElement(By.xpath("//h2[@id='headingtext']"));
        System.out.println(text.getText());

        WebElement enableBtn= driver.findElement(By.xpath("//button[@id='enable_button']"));
        enableBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(enableBtn));

        WebElement button= driver.findElement(By.xpath("(//button[@class='btn btn-default'])[3]"));
        button.click();

        WebElement checkBox= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBox.click();


        WebElement selected= driver.findElement(By.xpath("//input[@id='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(selected));
        if(selected.isSelected()){
            if(selected.isEnabled()){
                System.out.println("The check bis is selected:"+ selected.isSelected() +" The check box is anabled:"+selected.isEnabled());
            }
        }





    }
}
