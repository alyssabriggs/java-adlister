import java.util.List;
public interface Contacts {
    List<Contact> getContacts();
    long saveContact(Contact contact);
    void deleteContactById(long id);
    Contact getContactById(long id);
}
