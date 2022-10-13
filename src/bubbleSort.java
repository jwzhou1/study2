import java.util.Arrays;
import java.util.Random;
    public class bubbleSort {
        //        static Random rand = new Random();
//        public static void main(String[] args) {
//            int [] numbers = new int[10];
//            //Generate 10 random numbers between 1-100
//            for(int i = 0; i < numbers.length; i++) {
//                numbers[i] = (int)(rand.nextFloat() * 100 + 1);
//            }//end of loop
//            System.out.println("The unsorted list is: " + Arrays.toString(numbers));
//            bubbleSort(numbers);
//            System.out.println("The sorted list is: " + Arrays.toString(numbers));
//        }
//        public static void bubbleSort(int[] list) {
//            int temp;
//            for (int i = list.length - 1; i > 0; i--){
//                for (int j = 0; j < i; j++){
//                    if (list[j] > list[j + 1]){
//                        temp = list[j];
//                        list[j] = list[j + 1];
//                        list[j + 1] = temp;
//                    }
//                }
//            }
//        }
//    }
        public static void main(String[] args) {
            Bubble a = new Bubble();
            int[] arr = {4, 2, 5, 6, 1};
            a.bubblee(arr);
        }
    }
          class Bubble {
            public void bubblee(int[] arr) {
                int temp = 0;
                for (int i = 0; i < arr.length - 1; i++) {
                    for (int j = 0; j < arr.length - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            temp = arr[j + 1];
                            arr[j + 1] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
                for (int j = 0; j< arr.length;j++) {
                    System.out.print(arr[j] +"\t");
                }
                System.out.println();
            }
        }
