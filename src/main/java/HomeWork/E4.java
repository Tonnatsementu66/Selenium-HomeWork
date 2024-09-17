package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/Xpath-homework.php");

        WebElement hobbies= driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        hobbies.sendKeys("Sleep");

        WebElement button= driver.findElement(By.xpath("//button[@id='display_text']"));
        button.click();

        WebElement movies= driver.findElement(By.xpath("//input[@id='favoriteMoviesId']"));
        movies.sendKeys("Rembo");

        WebElement text= driver.findElement(By.xpath("//label[contains(text(),'sit amet')]"));
        System.out.println(text.getText());

        WebElement city= driver.findElement(By.xpath("//input[@id='yourCity']"));
        city.sendKeys("Brooklyn");

        WebElement email= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email.sendKeys("alore@gmail.com");
        WebElement email1= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email1.sendKeys("alore@gmail.com");
        WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email2.sendKeys("alore@gmail.com");

        WebElement name= driver.findElement(By.xpath("//input[@data-detail='one' and @id='clientName']"));
        name.sendKeys("Bob");

        WebElement id= driver.findElement(By.xpath("//input[@name='clientId' and @id='clientId']"));
        id.sendKeys("Bob123");

        WebElement street=driver.findElement(By.xpath("//input[@name='StreetNo' and @type='text']"));
        street.sendKeys("2343");

        WebElement house= driver.findElement(By.xpath("//input[@name='HouseNo' and @type='text']"));
        house.sendKeys("23");











    }
}
