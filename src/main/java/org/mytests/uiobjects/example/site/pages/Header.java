package org.mytests.uiobjects.example.site.pages;


import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.composite.Section;


import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;
import org.mytests.uiobjects.example.site.sections.EpamLoginForm;
import org.openqa.selenium.WebElement;

public class Header extends Section {
	@Css("form") public static EpamLoginForm loginForm;
	@Css(".logout") public static WebElement logout;
	@Css("#epam-logo") public static WebElement epamLogo;
	public static WebElement userIcon;
	@XPath("//*[@ui='label']") public static UIElement userName;

	@Css(".search-field input") static UIElement searchInput;
	@Css(".icon-search") static WebElement searchIcon;
	@Css(".icon-search.active") static WebElement doSearch;

	public static void search(String text) {
		if (logout.isDisplayed()) {
			userName.click();
		}
		if (searchInput.isHidden()) {
			searchIcon.click();
		}
		searchInput.input(text);
		doSearch.click();
	}
}