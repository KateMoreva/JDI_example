package org.mytests.uiobjects.example.site.sections.ok;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

import com.epam.jdi.light.ui.html.common.Button;
import com.epam.jdi.light.ui.html.common.TextField;
import org.mytests.uiobjects.example.entities.User;

public class LoginForm extends Form<User> {
    @FindBy(xpath = ".//input[@name='st.email']") TextField userName;
    @FindBy(xpath = ".//input[@name='st.password']") TextField password;
    @FindBy(xpath = ".//input[@data-l='t,sign_in']") Button enter;
}
