public class LibraryTest {

    public static void main(String[] args) {

        Book books[] = {

                new Book(101, "C Programming", "Dennis"),
                new Book(102, "Data Structures", "Narasimha"),
                new Book(103, "Java", "James")
        };

        LibraryManager manager =
                new LibraryManager(books);

        System.out.println("Linear Search");

        System.out.println(
                manager.linearSearch("Java"));

        System.out.println("\nBinary Search");

        System.out.println(
                manager.binarySearch("Java"));
    }
}