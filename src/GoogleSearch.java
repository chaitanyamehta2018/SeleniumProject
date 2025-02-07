

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class GoogleSearch {
    
    public static void main(String[] args) 
    {
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        
        options.setExperimentalOption("useAutomationExtension", false);
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("http://www.google.com");
        
        WebElement element = driver.findElement(By.name("q"));
        
        element.sendKeys("Sky Force Movie Trailer");
        
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());
        
        try {
            Thread.sleep(5000); // Sleep for 50 milliseconds
        } catch (InterruptedException ex) {
            Logger.getLogger(GoogleSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        driver.quit();

        
    }
    
}
