package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Contact;
import main.ContactService;

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Sagun",
                "Pokharel",
                "1234567890",
                "123 Lakeshore Dr"
        );

        service.addContact(contact);

        assertEquals(1, service.getContacts().size());
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Sagun",
                "Pokharel",
                "1234567890",
                "123 Lakeshore Dr"
        );

        service.addContact(contact);

        service.deleteContact("123");

        assertEquals(0, service.getContacts().size());
    }

    @Test
    public void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "123",
                "Sagun",
                "Pokharel",
                "1234567890",
                "123 Lakeshore Dr"
        );

        service.addContact(contact);

        service.updateFirstName("123", "Salman");

        assertEquals("Salman", contact.getFirstName());
    }
}