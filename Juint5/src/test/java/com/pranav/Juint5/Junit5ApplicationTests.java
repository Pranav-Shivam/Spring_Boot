package com.pranav.Juint5;

import com.pranav.Juint5.contactInfo.ContactManager;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Junit5ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Continuing with test");
    }

    @Test
    @BeforeAll
    public static void setUpAll() {
        System.out.println("Before all the test");
    }

    @Test
    @AfterAll
    public static void afterAll() {
        System.out.println("After All test");
    }

    @Test
    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each test");
    }

    @Test
    @AfterEach
    void afterEach() {
        System.out.println("After Each test");
    }

    @Test
    public void shouldCreateContact() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Pranav", "Shivam", "0271468400");
        Assertions.assertFalse(contactManager.getAllContact().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContact().size());
        Assertions.assertTrue(contactManager.getAllContact().
                stream().
                anyMatch(contact -> contact.getFirstName().equals("Pranav") &&
                        contact.getLastName().equals("Shivam")
                        && contact.getPhoneNumber().equals("0271468400")));
        System.out.println("All test passed");
    }

}
