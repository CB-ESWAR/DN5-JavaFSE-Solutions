public class SearchOperations {

    public static Product linearSearch(Product arr[], String name) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i].productName.equalsIgnoreCase(name)) {
                return arr[i];
            }
        }

        return null;
    }

    public static Product binarySearch(Product arr[], String name) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result = arr[mid].productName.compareToIgnoreCase(name);

            if(result == 0) {
                return arr[mid];
            }

            else if(result < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return null;
    }
}