package org.mytests.tests.fewpageobjects.tests;


import org.mytests.tests.SimpleTestsInit;
import org.mytests.uiobjects.example.baeldung.entities.ContactInfo;
import org.testng.annotations.Test;

import static com.epam.jdi.light.ui.html.PageFactory.initElements;
import static org.mytests.uiobjects.example.baeldung.BaeldungSite.contactPage;


public class ContactsExample implements SimpleTestsInit {
    ContactInfo MY_CONTACT = new ContactInfo().set(c -> {
        c.firstName = "Roman";
        c.email = "roman.iovlev.jdi@gmail.com";
        c.message = "Hi Baeldung!";} );

    @Test
    public void fillContactTest() {
        contactPage.open();
        contactPage.asForm().send(MY_CONTACT);
        contactPage.asForm().check(MY_CONTACT);
    }
}
