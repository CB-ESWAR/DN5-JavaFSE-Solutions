public class OrderTest {

    public static void main(String[] args) {

        Order arr[] = {

                new Order(101, "Eswar", 5000),
                new Order(102, "Ravi", 2000),
                new Order(103, "Sai", 8000),
                new Order(104, "Kiran", 3000)
        };

        System.out.println("Before Sorting");

        for(Order o : arr) {
            System.out.println(o);
        }

        SortOperations.quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter Sorting");

        for(Order o : arr) {
            System.out.println(o);
        }
    }
}