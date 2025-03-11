public class LibraryApp {
    public static void main(String[] args) {
        Address authorAddress = new Address("123 Main St", "Cityville");
        Person author = new Person("John Doe", "Author", authorAddress);
        Date pubDate = new Date(1, 1, 2020);
        Book book = new Book("Java Programming", "123456", pubDate, author);
        
        Address inchargeAddress = new Address("456 Elm St", "Townsville");
        Person incharge = new Person("Alice Smith", "Librarian", inchargeAddress);
        
        Address staffAddress = new Address("789 Oak St", "Villagetown");
        Person staff = new Person("Bob Johnson", "Assistant", staffAddress);
        
        Library library = new Library("City Library", book, incharge, staff);
        library.showLibraryDetails();
    }
}
