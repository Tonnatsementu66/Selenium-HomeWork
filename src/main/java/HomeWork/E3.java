package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.classfile.attribute.ModuleAttribute;

public class E3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");
        driver.manage().window().maximize();

        WebElement name=driver.findElement(By.id("fullName"));
        name.sendKeys("John Wick");

        WebElement email= driver.findElement(By.name("yourEmail"));
        email.sendKeys("johnwickgmai.com");

        WebElement clientName= driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Tomas");

        WebElement clientId= driver.findElement(By.name("ClientId"));
        clientId.sendKeys("Tomas123");

        WebElement feedback=driver.findElement(By.id("ClientfeedbackId"));
        feedback.sendKeys("Perfect");

        WebElement project=driver.findElement(By.name("ProjectName"));
        project.sendKeys("House");

        WebElement time=driver.findElement(By.id("ProjectTimeId"));
        time.sendKeys("07/07/2024");

        WebElement address= driver.findElement(By.name("CurrentAddress"));
        address.sendKeys("2323 Ocean Avenue");

        WebElement permanent=driver.findElement(By.id("PermanentAddressId"));
        permanent.sendKeys("Same as current");

        WebElement submit=driver.findElement(By.name("btn-submit"));
        submit.click();

        Thread.sleep(2000);

        WebElement click=driver.findElement(By.linkText("Click Here."));
        click.click();

        driver.quit();



    }
}
