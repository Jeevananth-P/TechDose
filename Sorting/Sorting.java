class SortingAlgorithms {

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    public static void insertion(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < left) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < right) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] array, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            int[] leftArr = new int[mid - l + 1];
            int[] rightArr = new int[h - mid];

            for (int i = 0; i < leftArr.length; i++) {
                leftArr[i] = array[l + i];
            }
            for (int i = 0; i < rightArr.length; i++) {
                rightArr[i] = array[mid + 1 + i];
            }

            mergeSort(leftArr, 0, leftArr.length - 1);
            mergeSort(rightArr, 0, rightArr.length - 1);

            merge(array, leftArr, rightArr, leftArr.length, rightArr.length);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        bubble(arr);
        // selection(arr);
        // insertion(arr);
        // mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
