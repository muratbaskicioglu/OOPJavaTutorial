class Contact {
    String name;
    String email;
    String phoneNumber;

    Contact() {
        name = null;
        email = null;
        phoneNumber = null;
    }

    Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

public class ContactsManager {
    Contact [] contacts;
    int contactsCount;

    ContactsManager() {
        this.contactsCount = 0;
        this.contacts = new Contact[500];
    }

    void addContact(Contact contact) {
        contacts[contactsCount] = contact;
        contactsCount++;
    }

    Contact searchContact(String searchName) {
        for(int i = 0; i < contactsCount; i++) {
            if(contacts[i].name.equals(searchName)) {
                return contacts[i];
            }
        }
        return null;
    }
}
