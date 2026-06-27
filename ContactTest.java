package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Contact;

public class ContactTest {

    @Test
    public void testValidContact() {

        Contact contact = new Contact(
                "123",
                "Sagun",
                "Pokharel",
                "1234567890",
                "123 Lakeshore Dr"
        );

        assertTrue(contact.getContactId().equals("123"));
    }

    @Test
    public void testInvalidContactId() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "12345678901",
                    "Sagun",
                    "Pokharel",
                    "1234567890",
                    "123 Lakeshore Dr"
            );
        });
    }

    @Test
    public void testInvalidPhone() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "123",
                    "Sagun",
                    "Pokharel",
                    "12345",
                    "123 Lakeshore Dr"
            );
        });
    }
}