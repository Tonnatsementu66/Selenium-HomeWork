package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector-homework.php");

        WebElement attribute = driver.findElement(By.xpath("//div[@id='textattr']"));
        String text = attribute.getText();
        System.out.println("The text is:" + text);
        if (text.equals("inspect me to view my custom attribute")) {
            System.out.println("the text matches");
        } else {
            System.out.println("the text does match");

        }


        WebElement music = driver.findElement(By.xpath("//input[@name='MealRadio']"));
        if (music.isEnabled()) {
            music.click();
        }


        WebElement option2 = driver.findElement(By.xpath("//input[@value='tech_talk']"));
        boolean option2disabled = option2.isEnabled();
        if (!option2disabled) {
            System.out.println("the tech talk button is disable");
        } else {
            System.out.println("the tech talk radio button is enable");
        }

        WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Show More Options')]"));
        click.click();

        WebElement displayed = driver.findElement(By.xpath("//input[@name='MealRadio']"));
        if (displayed.isDisplayed()) {
            displayed.click();


            WebElement retrive = driver.findElement(By.xpath("//div[@id='hidden_message']"));
            System.out.println(retrive.getAttribute("title"));

            WebElement ckeckbox1 = driver.findElement(By.xpath("//input[@name='CheckboxFirst']"));
            boolean ckeckbocenable = ckeckbox1.isEnabled();
            System.out.println("Checkbox 1 is anable:" + ckeckbocenable);

            WebElement checkBoc1click = driver.findElement(By.xpath("//input[@value='CheckboxFirst']"));
            checkBoc1click.click();

            WebElement checkBox2disable = driver.findElement(By.xpath("//input[@value='disabledCheckbox']"));
            boolean checkBoxdisable = checkBox2disable.isEnabled();
            System.out.println("Checkbox 2 is enable:" + checkBoxdisable);

            WebElement clear = driver.findElement(By.xpath("//input[@class='form-control']"));
            clear.clear();

            clear.sendKeys("here is the custom text entered");


        }
    }
}
