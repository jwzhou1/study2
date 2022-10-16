public class findmax {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] arr = {2.5,31.2,3.1,1.2};
        Double res = a.max(arr);
        if (res != null) {
            System.out.println("arr max is = " + res);
        } else {
            System.out.println("wrong enter");
        }
    }
}
class A01{
    public Double max(double[] arr) {
        if (arr != null && arr.length > 0) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        } else {
            return null;
        }
    }
}
