package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class E8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        WebElement beverage= driver.findElement(By.xpath("//input[@value='Juice']"));
        beverage.click();

       List< WebElement> prefered= driver.findElements(By.xpath("//input[@name='working_enviroment']"));
       for(WebElement pr:prefered){
           if(pr.getAttribute("value").equals("hybrid")){
               pr.click();
           }

       }

       WebElement enableButton= driver.findElement(By.xpath("//button[@id='enabledFruitradio']"));
       enableButton.click();

       WebElement spring= driver.findElement(By.xpath("//input[@value='spring']"));
       boolean stateSpring=spring.isEnabled();
        System.out.println("The Spring option is now enabled:"+ stateSpring);
        spring.click();

        WebElement winter= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean winterDisplayed=winter.isDisplayed();
        System.out.println("Winter button displayed:"+winterDisplayed);

        WebElement showButton1= driver.findElement(By.xpath("//button[@id='showRadioButtons']"));
        showButton1.click();

        WebElement winter1= driver.findElement(By.xpath("//input[@value='winter']"));
        boolean winterDisplayed1=winter.isDisplayed();
        System.out.println("Winter button displayed:"+winterDisplayed1);


        WebElement winterButton= driver.findElement(By.xpath("//input[@type='radio'and @value='winter']"));
        winterButton.click();

        WebElement meal= driver.findElement(By.xpath("//input[@value='dinner']"));
        meal.click();

        driver.quit();

    }
}
