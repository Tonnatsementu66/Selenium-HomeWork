package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E12 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.syntaxprojects.com/handle-iframe-homework.php");

        driver.switchTo().frame(1);
        WebElement nestedFrame= driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame(nestedFrame);

        WebElement cb1=driver.findElement(By.xpath("//input[@class='cb1-element']"));
        cb1.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");
        WebElement city=driver.findElement(By.xpath("//select[@id='cities']"));
        Select sel=new Select(city);
        sel.selectByVisibleText("Los Angeles");

        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        WebElement userName= driver.findElement(By.xpath("//input[@name='Username']"));
        userName.sendKeys("John123");
    }
}
