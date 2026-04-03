package StopWatch;

public class SelectionSort {
    void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Giả sử phần tử đầu tiên của đoạn chưa sắp xếp là nhỏ nhất
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất tìm được với phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
