package org.example.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task17a {
    WebDriver driver;

    //Run the following tests on https://demoqa.com   as a Testsuite (All test must be in diffrent classes)
    //Navigate to the homepage and click on the Elements tile 
    // Assert that you are on the Elements page
    //Navigate to the homepage and click on the Forms tile 
    //Assert that you are on the Forms page
    //Navigate to the homepage and click on the Widgets tile 
    //Assert that you are on the Widgets page
    //Navigate to the homepage and click on the Interactions tile 
    //Assert that you are on the Interactions page
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //executable property of the chrome driver
        //lunch browser
        driver = new ChromeDriver();
        //to maximize the page
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
    }
    @Test
    public void elementTitle() {
        //select element title
        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Elements");
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}