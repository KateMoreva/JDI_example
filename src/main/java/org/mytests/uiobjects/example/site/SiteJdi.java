package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import org.mytests.uiobjects.example.site.pages.BHomePage;
import org.mytests.uiobjects.example.site.pages.ContactPage;

@JSite("https://epam.github.io/JDI/")
public class SiteJdi {
    @Url("/") public static BHomePage bhomePage;
    @Url("/contacts.html") @Title("Contact Form")
    public static ContactPage contactPage;
}
