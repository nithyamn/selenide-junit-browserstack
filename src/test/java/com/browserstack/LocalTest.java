package com.browserstack;

import com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.WebDriverRunner;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class LocalTest extends BrowserStackJUnitTest {

    @Test
    public void test() throws Exception {

        open("http://bs-local.com:45691/check");
        sleep(2000);

    }
}
