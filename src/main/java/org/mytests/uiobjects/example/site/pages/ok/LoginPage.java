package org.mytests.uiobjects.example.site.pages.ok;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;

import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Icon;
import org.mytests.uiobjects.example.site.sections.ok.LoginForm;


@Title("OK.RU")
public class LoginPage extends WebPage {
    @Css("form") public static LoginForm loginForm;
    @Css(".anonym_logo") public static Icon okIcon;
//    @Css(".fa-sign-out") public static WebElement logout;
}
