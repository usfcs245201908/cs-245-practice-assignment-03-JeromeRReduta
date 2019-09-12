public class BinaryRecursiveSearch implements Practice03Search {
    public BinaryRecursiveSearch() {
    }

    public int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length);
    }

    public int search(int[] arr, int target, int low, int high) {

        int mid = (low + high) / 2;

        if (arr[mid] > target && high > 0)
            search(arr, target, low, mid - 1);

        else if (arr[mid] < target && low < arr.length - 2)
            search(arr, target, mid + 1, high);

        else if (low > high)
            return -1;

        return mid;
}

    public String searchName() {
        return "Binary search recursive";
    }
}
