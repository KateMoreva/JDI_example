package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.Root;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.mytests.uiobjects.example.entities.User;
import org.openqa.selenium.WebElement;

public class EpamLoginForm extends Form<User> {
    @UI("*root*//header//form//input[@type='text']")
    public WebElement name;
    @Css("input[type=password]") WebElement password;

    @Root
    @XPath(".//header//form//button[@type='submit']") WebElement enter;

}