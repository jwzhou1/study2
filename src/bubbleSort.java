public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {6631, 315, 64, 6224, 553};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
        }
    }
}
