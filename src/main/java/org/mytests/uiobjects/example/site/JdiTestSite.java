package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.example.site.pages.ok.HomePage;
import org.mytests.uiobjects.example.site.pages.ok.LoginPage;

@JSite("https://ok.ru/")
public class JdiTestSite {
    public static LoginPage loginPage;
    public static HomePage homePage;
}
