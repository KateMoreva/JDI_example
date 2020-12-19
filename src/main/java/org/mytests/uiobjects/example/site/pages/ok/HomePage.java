package org.mytests.uiobjects.example.site.pages.ok;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.Icon;
import com.epam.jdi.light.ui.html.common.Image;
import com.epam.jdi.light.ui.html.complex.Dropdown;


@Title("Одноклассники")
public class HomePage extends WebPage {
    @Css(".anonym_logo") public static Icon okIconM;
    @FindBy(xpath = ".//*[@class='entity-avatar']") public static Image userImage;
    @FindBy(xpath = ".//*[@class='toolbar_accounts-item ']") public static Dropdown toolbarDropdown;
    @FindBy(xpath =".//*[@class='toolbar_dropdown_w h-mod']") public static Button toolbar;
    @FindBy(xpath = ".//*[@data-l='t,logoutCurrentUser']") public static Button logoutButton;
    @FindBy(xpath = ".//*[@data-l='t,confirm']") public static Button confirmLogout;
}
