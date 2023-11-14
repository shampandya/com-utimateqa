package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class Com_UltimateQa {
 static String browser = "Chrome";
 static String baseUrl = "https://courses.ultimateqa.com/";
 static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Invalid Browser name ");
        }

        driver.get(baseUrl); // open URL
        System.out.println("Print the title of the page:" +driver.getTitle()); // Print the title of the page
        System.out.println("Print the current URL: " +driver.getCurrentUrl());  // Print the current URL
        System.out.println("Print the Page Source: " +driver.getPageSource());  // Print the Page Source
        driver.findElement(By.linkText("Sign In")).click(); // Click on Sign in element
        System.out.println("Print the current URL: " +driver.getCurrentUrl());  // Print the current URL
        driver.findElement(By.id("user[email]")).sendKeys("sham@gmail.com"); // enter email to email field
        driver.findElement(By.id("user[password]")).sendKeys("123456"); // enter password to password field
        driver.findElement(By.partialLinkText("Sign")).click();
        driver.get(baseUrl); // navigate to baseUrl
        driver.navigate().forward();  // navigate forward to homepage
        driver.navigate().back(); // navigate back to base url
        driver.navigate().refresh(); // refresh the page
        driver.quit();  // close the browser

    }
}
