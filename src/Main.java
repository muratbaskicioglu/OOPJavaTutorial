public class Main {
    public static void main(String [] args) {
        ContactsManager myContactManager = new ContactsManager();
        Contact personOne = new Contact("Murat Baskıcıoğlu", "muratbaskicioglu@gmail.com", "+905354539023");
//        personOne.name = "Murat Baskıcıoğlu";
//        personOne.email = "muratbaskicioglu@gmail.com";
//        personOne.phoneNumber = "+905354539023";
        myContactManager.addContact(personOne);
        System.out.println(myContactManager.searchContact("Murat Baskıcıoğlu").phoneNumber);
    }
}
