public class BinaryIterativeSearch implements Practice03Search{
    public BinaryIterativeSearch() {}


    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target)
                high = mid - 1;

            else if (arr[mid] < target)
                low = mid + 1;

            else
                return mid;
        }

        return -1;
    }

    public String searchName() {
        return "Binary search iterative";
    }
}
