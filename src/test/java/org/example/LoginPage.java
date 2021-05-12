package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /*локаторs*/
    @FindBy(xpath = "//*[contains(@name,'SWEUserName')]")
    private WebElement loginField;
    @FindBy(xpath = "//*[contains(@name,'SWEPassword')]")
    private WebElement passwField;
    @FindBy(xpath = "//*[contains(@id,'s_swepi_22')]")
    private WebElement btnEnter;

    //@FindBy(xpath = "//*[contains(@id,'tb_14')]")
    //private WebElement btnSiteMap;
    @FindBy(xpath = "//*[@class='ui-tabs-anchor'][contains(.,'Потенциальные сделки')]")
    private WebElement btnPS;
    @FindBy(xpath = "//*[@class='siebui-ctrl-drilldown'][contains(.,'Мои потенциальные сделки')]")
    private WebElement btnMyPS;

    /*локаторs-значения*/
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwField.sendKeys(passwd);
    }

    public void clickBtnEnter() {
        btnEnter.click();
    }

    //public void clickBtnSiteMap() {btnSiteMap.click();}
    public void clickBtnPS() {
        btnPS.click();
    }

    public void clickBtnMyPS() {
        btnMyPS.click();
    }
}

