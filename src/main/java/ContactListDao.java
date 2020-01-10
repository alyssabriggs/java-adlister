import java.util.ArrayList;
import java.util.List;


// TODO: create a branch from your MVC solution tag called "mvc-contacts" and add this class
// TODO: create a Contact class entity that maps contacts correctly
// TODO: create a Contacts interface with the required methods
// TODO: add a method to the DaoFactory to get an implementation of the contacts DAO
// TODO: create the needed controller and view code to give the user an interface that will CRUD contacts

public class ContactListDao implements Contacts {

    private List<Contact> contacts = new ArrayList<>();

    // initially seed contacts
    public ContactListDao() {
        contacts.add(new Contact(1, "John", "Conner", "2105556767"));
        contacts.add(new Contact(2, "Fred", "Smith", "2105556769"));
        contacts.add(new Contact(3, "Sarah", "Conner", "2105551010"));
        contacts.add(new Contact(4, "Kyle", "Reese", "2105551111"));
    }

    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    @Override
    public long saveContact(Contact contact) {

        if (contact.getId() == 0) {
            contact.setId(contacts.size() + 1);
            contacts.add(contact);
        } else {
            contacts.set((int) contact.getId() - 1, contact);
        }

        return contact.getId();

    }

    @Override
    public void deleteContactById(long id) {
        List<Contact> updatedContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getId() != id) {
                updatedContacts.add(contact);
            }
        }
        contacts = updatedContacts;
    }

    @Override
    public Contact getContactById(long id) {
        return contacts.get((int) id - 1);
    }

    // only for testing DAO; run Tomcat server to run application
    public static void main(String[] args) {
        Contacts contactDao = new ContactListDao();


        // test getContacts()

        System.out.println("\n=== Testing getContacts()");
        List<Contact> allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }

        // test getContactById()
        System.out.println("\n=== Testing getContactById()");

        System.out.print(contactDao.getContactById(1).getFirstName()); // should be "John"
        System.out.print(" // should be John");


        // test save contact on new contact

        System.out.println("\n\n=== Testing saveContact() to create contact");

        long id = contactDao.saveContact(new Contact("TeeOne", "Thousand", "2105555555"));
        System.out.println(id);

        allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }

        // test updating a contact

        System.out.println("\n=== Testing saveContact() to update contact");

        System.out.println("// contacts before update");

        allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }

        System.out.println("// change Fred Smith to Bob Smith");

        Contact contactToUpdate = contactDao.getContactById(2);
        contactToUpdate.setFirstName("Bob");
        contactDao.saveContact(contactToUpdate);

        System.out.println(contactDao.getContactById(2).getFirstName() + " // should be Bob");

        // test deleteContact()

        System.out.println("\n=== Testing deleteContact()");

        System.out.println("// before delete...");

        allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }

        System.out.println("// deleting Fred Smith...");
        contactDao.deleteContactById(2);
        System.out.println("// after delete...");
        allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }


    }
}
