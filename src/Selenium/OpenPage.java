package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenPage {

    public static void main(String[] args) {
    	
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\rawlings.ozeh\\2024 Java Training\\SeleniumTraining6thMayBatch\\resources\\chromedriver.exe");
        
       // Set up Chrome Options == Run headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
       // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver(options);
      
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");// Get website
        
        driver.manage().window().maximize();// Maximize window  
        System.out.println(driver.getTitle()); // Get the page title
        
        //Sign-up
        //driver.findElement(By.xpath("//a[@id='u_0_0_8H']")).click();
        
        //Login
        driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("12334hgdhg");
        driver.findElement(By.name("login")).click();
       
        driver.quit(); // close all browser instance
        System.out.println("end");
       
    }
}
