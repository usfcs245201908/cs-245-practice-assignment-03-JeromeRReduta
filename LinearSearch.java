public class LinearSearch implements Practice03Search {
    public LinearSearch() {
    }

    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public String searchName() {
        return "Linear search";
    }
}
