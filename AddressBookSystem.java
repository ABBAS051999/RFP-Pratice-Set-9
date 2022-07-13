public class AddressBookSystem {
    // main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
        addressBook.editContact();
        addressBook.deleteContact();
        addressBook.getmenu();
    }
}
