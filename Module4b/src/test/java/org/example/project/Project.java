package org.example.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Set;

import static junit.framework.Assert.assertTrue;

public class Project {
    public static void main(String[] args) throws InterruptedException {
        //Visit https://www.automationexercise.com/
        //Sign up as a new user by creating an account. Fill/select all the options on the 'Enter Account Information' page. That is both mandatory and optional , including the radio button for title and checkboxes.
        //Assert that your account was successfully created and then continue
        //Go to the products section of the site and purchase any top of your choice from under the women's section
        //Add the top to the cart and assert that the item has been successfully added to the cart.
        //Go to the 'cart' section and proceed to checkout
        //Fill the checkout information and complete your order
        //@channel
        System.setProperty("webdriver.chrome.d river", "C:\\Users\\USER\\Pictures\\Screenshots\\New folder\\ci-cd-testify\\module4\\src\\chromedriver.exe");
        //this set the executable property of the chrome driver
        //lunch browser
        WebDriver driver = new ChromeDriver();
        //to maximize the page
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //to navigate to web page, you will use this: driver.navigate() or driver.get()
        driver.get("https://www.automationexercise.com/");
        Thread.sleep(3000);

        //signing up as new user
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        //fill user input: name and email
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("euphemia");
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("euphemiauc94@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
        //select days, month, nd year
        WebElement days = driver.findElement(By.xpath("//select[@id='days']"));
        days.click();
        Select select = new Select(days);
        select.selectByIndex(22);
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
        month.click();
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(2);
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
        month.click();
        Select selectYear = new Select(year);
        selectYear.selectByValue("1994");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        //fill address information form
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Euphemia");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Nnaemeka ");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Testify academy");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("testify ltd");
        WebElement country = driver.findElement(By.xpath("//select[@id='days']"));
        country.click();
        Select select1 = new Select(country);
        select1.selectByIndex(2);
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Lagos");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("lagos city");
        driver.findElement(By.xpath(" //input[@id='zipcode']")).sendKeys("800111");
        driver.findElement(By.xpath(" //input[@id='mobile_number']")).sendKeys("07069029696");
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
        String pageTitle = driver.getTitle();
        // Assert that the page contains the text "account created"
        assertTrue(driver.findElement(By.tagName("body")).getText().contains("ACCOUNT CREATED!"));
       // Assert.assertEquals(pageTitle, "account_created");

        //go to product and purchase top
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
        //view the top of choice and purchase
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]")).click();
        //go to cart
        driver.findElement(By.xpath("//u[contains(text(),'View Cart')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]")).click();
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]")).sendKeys("ensure to send the excert quality i ordered");
        driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();
        //fill payment details: card name, card number, cvc, and year
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Eupheia Uche");
        //driver.findElement(By.xpath("")).sendKeys("");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("89653685678");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("123");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]")).sendKeys("123");
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]")).sendKeys("2025");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //SECTION B
        //Without terminating the current window,launch another window and
        // visit https://blazedemo.com/
        // -Select Boston and Romeas departure and arrival destinations.-
        // Click on “FindFlights”- Select a flight-Copy the flight number and paste into the Zip code field
        // -Fill all other fields with valid inputs-Tick the‘Remember Me’checkbox and Purchase flight That’s

        // Open a new window
        String parentWindowHandle = driver.getWindowHandle();
        String script = "window.open('https://blazedemo.com/', '_blank');";
        ((ChromeDriver) driver).executeScript(script);
        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        // Perform actions on the second window (BlazeDemo); select boston for departure and
        WebElement departureCity= driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]"));
        departureCity.click();
        Select selectDepCity = new Select(month);
        selectDepCity.selectByIndex(2);
        WebElement arrivalCity= driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]"));
        arrivalCity.click();
        Select selectArrivalCity = new Select(month);
        selectArrivalCity.selectByIndex(1);
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        Thread.sleep(3000);
        //find and select flight
        driver.findElement(By.xpath("//tbody/tr[2]/td[1]/input[1]")).click();
        //fill form
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Euphemia");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("1234, bonston city");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Bonston city");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("United State");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("34566");
        //select card type
        WebElement cardType = driver.findElement(By.xpath("//select[@id='cardType']"));
        cardType.click();
        Select carType = new Select(month);
        carType.selectByIndex(0);
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("2345 6783 23564 3875");
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("11");
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2024");
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Eupheia Uche");
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();







    }
}