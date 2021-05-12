package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static LoginPage loginPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        loginPage.driver = new ChromeDriver(options);
        loginPage.driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        loginPage.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginPage.driver.manage().timeouts().setScriptTimeout(15,TimeUnit.SECONDS);


    }

    @Test(priority = 1, description = "Логин страничка")
    public void loginTest() {

        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.inputPasswd(ConfProperties.getProperty("passwd"));
        loginPage.clickBtnEnter();

    }

    @Test(priority = 2, description = "T-4530")
    public void createPSTest() {
        //loginPage.clickBtnSiteMap();
        loginPage.clickBtnPS();
        loginPage.clickBtnMyPS();

    }

    @AfterClass
    public static void tearDown() {
        loginPage.driver.quit();
    }
}
