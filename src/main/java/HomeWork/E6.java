package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E6 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector-homework.php");

        WebElement userID= driver.findElement(By.cssSelector("input#UserID"));
        userID.sendKeys("John123");

        WebElement userName=driver.findElement(By.cssSelector("input#UserName"));
        userName.sendKeys("John321");

        WebElement intro= driver.findElement(By.cssSelector("input[name='LectureIntro']"));
        intro.sendKeys("Hello");

        WebElement feedbackRay = driver.findElement(By.cssSelector("input#FeedbackFromRay"));
        feedbackRay.sendKeys("Not Bad");

        WebElement feedbackDucky = driver.findElement(By.cssSelector("input#FeedbackfromDucky"));
        feedbackDucky.sendKeys("Good");

        WebElement ID = driver.findElement(By.cssSelector("input[name='ClientID']"));
        ID.sendKeys("JoHN1234");

        WebElement email= driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("john@gmail.com");

        WebElement topic=driver.findElement(By.cssSelector("input[name='CourseTopic']"));
        topic.sendKeys("Learn");
    }
}
