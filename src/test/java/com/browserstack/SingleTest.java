package com.browserstack;

import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class SingleTest extends BrowserStackJUnitTest{

    @Test
    public void test() throws Exception {

        open("http://www.google.com");

        $(By.name("q")).setValue("BrowserStack").pressEnter();

        sleep(2000);

        //Assert.assertTrue(Pattern.matches("BrowserStack -.*", title()));

    }
}
