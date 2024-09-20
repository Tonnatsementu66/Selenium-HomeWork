package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement attribute= driver.findElement(By.xpath("//div[@id='textattr']"));
        String att=attribute.getAttribute("data-text-attr");
        System.out.println("The attribute is:" +att);

        WebElement meal=driver.findElement(By.xpath("//input[@name='MealRadio']"));
        boolean mealEnable=meal.isEnabled();
        System.out.println("Music festival checkbox is enable:"+mealEnable);

        WebElement option2= driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean option2disabled= option2.isEnabled();
        System.out.println("Tech Talk is enable:"+ option2disabled);

        WebElement click= driver.findElement(By.xpath("//button[contains(text(),'Show More Options')]"));
        click.click();

        WebElement displayed= driver.findElement(By.xpath("//input[@name='MealRadio']"));
        boolean displayed1=displayed.isDisplayed();
        if(displayed1){
            System.out.println("Art Exhibition is displayed");
        }
        else {
            System.out.println("Art Exhibition not displayed" );
        }

        WebElement click1=driver.findElement(By.xpath("(//input[@name='MealRadio'])[3]"));
        click1.click();

        WebElement retrive=driver.findElement(By.xpath("//div[@id='hidden_message']"));
        String retrivetITLE= retrive.getAttribute("data-text");
        System.out.println("The title attribute is:"+retrivetITLE);

        WebElement ckeckbox1=driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
        boolean ckeckbocenable= ckeckbox1.isEnabled();
        System.out.println("Checkbox 1 is anable:"+ckeckbocenable);

        WebElement checkBoc1click=driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
        checkBoc1click.click();

        WebElement checkBox2disable=driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
        boolean checkBoxdisable=checkBox2disable.isEnabled();
        System.out.println("Checkbox 2 is enable:"+ checkBoxdisable);

        WebElement clear=driver.findElement(By.xpath("//input[@class='form-control']"));
        clear.clear();

        WebElement entertext=driver.findElement(By.xpath("//input[@type='text']"));
        entertext.sendKeys("here is the custom text entered");


    }
}
