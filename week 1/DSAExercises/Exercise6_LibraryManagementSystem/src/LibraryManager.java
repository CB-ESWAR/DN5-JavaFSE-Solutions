public class LibraryManager {

    Book books[];

    LibraryManager(Book books[]) {
        this.books = books;
    }

    public Book linearSearch(String title) {

        for(int i = 0; i < books.length; i++) {

            if(books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }

        return null;
    }

    public Book binarySearch(String title) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                    books[mid].title.compareToIgnoreCase(title);

            if(result == 0)
                return books[mid];

            else if(result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }
}