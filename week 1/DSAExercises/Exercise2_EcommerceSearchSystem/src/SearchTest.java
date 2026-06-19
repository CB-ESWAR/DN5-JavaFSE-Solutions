public class SearchTest {

    public static void main(String[] args) {

        Product arr[] = {

                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics")
        };

        Product p1 = SearchOperations.linearSearch(arr, "Laptop");

        System.out.println("Linear Search:");
        System.out.println(p1);

        Product p2 = SearchOperations.binarySearch(arr, "Laptop");

        System.out.println("\nBinary Search:");
        System.out.println(p2);
    }
}