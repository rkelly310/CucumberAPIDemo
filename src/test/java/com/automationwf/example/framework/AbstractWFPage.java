package com.automationwf.example.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractWFPage {

    private WebDriver driver;

    public AbstractWFPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait driverWait(long timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }

}
