class Library{

    String[] books;
    int no_Of_Books;

    Library()
    {
        this.books = new String[100];
        this.no_Of_Books = 0;

    }

    void addBook(String bok)
    {
        this.books[no_Of_Books] = bok;
        no_Of_Books++;
        System.out.println(bok + " book has been added");
    }

    void showAvailableBooks()
    {
        System.out.println("\n\nAvailable Books are :");
        for (String book : this.books) {
            
            if(book == null)
            {
                continue;
            }
            System.out.println("** "+ book);
            
        }
    }

    void issueBook(String book)
    {
        for(int i = 0; i<this.books.length;i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("\n"+book + " has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist.");
    }

    void returnBook(String book)
    {
        addBook(book);
    }
}


public class ProjectOnlineLibrary {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook("Maths");
        lib.addBook("Computer Programming");
        lib.addBook("Computer Science");
        lib.addBook("Hindi");
        lib.addBook("English");
        lib.addBook("Physics");
        lib.addBook("Chemistry");
        
        lib.showAvailableBooks();

        lib.issueBook("English");
        lib.showAvailableBooks();
       
        lib.returnBook("English");
        lib.showAvailableBooks();
       
    }
    
}
