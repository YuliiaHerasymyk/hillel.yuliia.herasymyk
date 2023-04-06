package ua.ithillel.automation.ui;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HomeWork {
    private WebDriver driver;

    @BeforeClass
    public static void setUpDriver() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void qAutoEnd2End() throws InterruptedException{
        driver.get("https://guest:welcome2qauto@qauto.forstudy.space/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".hero-descriptor_btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("signupName")).sendKeys("Jack");
        Thread.sleep(2000);

        driver.findElement(By.id("signupLastName")).sendKeys("Black");
        Thread.sleep(2000);

        driver.findElement(By.id("signupEmail")).sendKeys("Qwerty61@ukr.net");
        Thread.sleep(2000);

        driver.findElement(By.id("signupPassword")).sendKeys("TestTest23");
        Thread.sleep(2000);

        driver.findElement(By.id("signupRepeatPassword")).sendKeys("TestTest23");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);

//

        driver.findElement(By.id("userNavDropdown")).click();
        Thread.sleep(2000);



        WebElement profileButton = driver.findElement(By.cssSelector("div app-user-nav nav div a:nth-child(2)"));
        profileButton.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
//


        WebElement nameField = driver.findElement(By.id("editProfileName"));
        WebElement lastNameField = driver.findElement(By.id("editProfileLastName"));

        assertArrayEquals(new String[] { "Jack" }, new String[] { nameField.getAttribute("value") });
        assertArrayEquals(new String[] { "Black" }, new String[] { lastNameField.getAttribute("value") });

        
        driver.findElement(By.xpath("//button[@class='close']")).click();
        Thread.sleep(2000);
//
        driver.findElement(By.id("userNavDropdown")).click();
        Thread.sleep(2000);


        WebElement garageButton = driver.findElement(By.cssSelector("div app-user-nav a:first-child"));
        garageButton.click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("addCarMileage")).sendKeys("1");
        Thread.sleep(2000);

        WebElement addButton = driver.findElement(By.cssSelector("div app-add-car-modal button:nth-of-type(2)"));
        addButton.click();
        Thread.sleep(2000);

//
        driver.findElement(By.cssSelector(".btn-success")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("addExpenseMileage")).sendKeys("2");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseLiters")).sendKeys("3");
        Thread.sleep(2000);
        driver.findElement(By.id("addExpenseTotalCost")).sendKeys("15");
        Thread.sleep(2000);

        WebElement adButton = driver.findElement(By.cssSelector("div app-add-expense-modal button:nth-of-type(2)"));
        adButton.click();
        Thread.sleep(2000);

//
        WebElement buttonSettings = driver.findElement(By.cssSelector("div app-panel-layout div a:last-child"));
        buttonSettings.click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn-danger-bg")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn-danger")).click();
        Thread.sleep(2000);

    }

    @After
    public void postCondition() {
        driver.quit();
    }
}
