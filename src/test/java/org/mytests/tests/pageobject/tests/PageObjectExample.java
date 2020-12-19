package org.mytests.tests.pageobject.tests;


import org.mytests.tests.SimpleTestsInit;
import org.testng.annotations.Test;

import static org.mytests.uiobjects.example.site.SiteJdi.*;
import static org.mytests.uiobjects.example.site.pages.BHomePage.*;


public class PageObjectExample implements SimpleTestsInit {
    @Test
    public void openPage() {
        bhomePage.open();
        userIcon.click();
        name.sendKeys("epam");
        password.sendKeys("1234");
        loginButton.click();
        menuContactForm.click();
        contactPage.checkOpened();
    }
}
