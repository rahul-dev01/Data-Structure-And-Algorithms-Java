public class SearchOnValueAnswerQuestion {

    static boolean findMaximumMinimal(int[] arr, int n, int m, int maxAllowed) {
        int students = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (currentSum + arr[i] <= maxAllowed) {
                currentSum += arr[i];
            } else {
                students++;
                currentSum = arr[i];

                if (students > m) {
                    return false;
                }
            }
        }
        return true;
    }

    static int findMinimumMax(int[] arr, int n, int m) {
        int low = 0, high = 0;

        for (int chocolates : arr) {
            low = Math.max(low, chocolates);
            high += chocolates;
        }

        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (findMaximumMinimal(arr, n, m, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int n = arr.length;
        int m = 2;

        int result = findMinimumMax(arr, n, m);
        System.out.println("The Answer is : " + result);
    }
}
