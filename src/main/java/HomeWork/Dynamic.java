package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

// click on PIM option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

// get the column id
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        boolean notFound = true;
        while (notFound) {
            int count = 1;
            for (WebElement id : allIDs) {
                String idNo = id.getText();
                if (idNo.equals("111022A")) {
                    System.out.println(count);
// find checkbox and click
                    WebElement checkbox = driver.findElement(By.xpath("//table/tbody/tr[" + count + "]/td[1]"));
                    checkbox.click();
                    notFound = false;
                }
                count = count + 1;
            }
            if (notFound) {
                WebElement nextButton = driver.findElement(By.xpath("(//a[text()='Next'])[1]"));
                nextButton.click();
                allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            }
        }


    }
}


