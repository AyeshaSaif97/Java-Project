package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2ConfigProperties {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName = "Admin";
        String password = "Hum@nhrm123";

        //open the browser on my computer
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //going to navigate to the URL
        driver.get(url);
        //locate the text field
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        //enter the text into the field
        userNameField.sendKeys(userName);
        //locate the password field
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);

        //locate the login button
        WebElement LoginButton = driver.findElement(By.id("btnLogin"));
        LoginButton.click();


    }
}
