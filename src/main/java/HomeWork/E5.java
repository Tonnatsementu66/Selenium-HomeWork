package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E5 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxprojects.com/advanceXpath-homework.php");
        driver.manage().window().maximize();

        WebElement textBox1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        textBox1.sendKeys("Rembo");

        WebElement textBox2= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        textBox2.sendKeys("Terminator");

        WebElement textBox3= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        textBox3.sendKeys("John Wick");
//////////////

        WebElement box1= driver.findElement(By.xpath("//input[@id='favouriteBook']"));
        box1.sendKeys("Bolt");

        WebElement box2= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[1]"));
        box2.sendKeys("Ratatui");

        WebElement box3= driver.findElement(By.xpath("//input[@id='favouriteBook']/following-sibling::input[2]"));
        box3.sendKeys("Bomber");

/////////////
        WebElement text1= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        text1.sendKeys("Tom");

        WebElement text2= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        text2.sendKeys("Bob");

        WebElement text3= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        text3.sendKeys("John");

        driver.quit();



    }
}
