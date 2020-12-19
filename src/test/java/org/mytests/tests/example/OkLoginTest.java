package org.mytests.tests.example;

import com.epam.jdi.light.elements.composite.WebPage;
import org.mytests.tests.SimpleTestsInit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.uiobjects.example.TestData.DEFAULT_USER;
import static org.mytests.uiobjects.example.site.JdiTestSite.homePage;
import static org.mytests.uiobjects.example.site.JdiTestSite.loginPage;
import static org.mytests.uiobjects.example.site.pages.ok.HomePage.*;
import static org.mytests.uiobjects.example.site.pages.ok.LoginPage.loginForm;

public class OkLoginTest implements SimpleTestsInit {

    @AfterMethod
    public void after() {
        homePage.checkOpened();
        toolbar.click();
        logoutButton.click();
        confirmLogout.click();
        loginPage.checkOpened();
    }

    @Test
    public void nonPageObjectTest() {
        WebPage.openUrl("https://ok.ru/");
        $(".//input[@name='st.email']").input("technopolisBot232");
        $(".//input[@name='st.password']").input("technopolis21");
        $(".//input[@data-l='t,sign_in']").click();
        Assert.assertEquals(WebPage.getUrl(), "https://ok.ru/");
    }

    @Test
    public void loginTest() {
        loginPage.open();
        loginForm.loginAs(DEFAULT_USER);
    }
}
