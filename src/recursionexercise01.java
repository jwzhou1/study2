public class recursionexercise01 {
    public static void main(String[] args){
        tool sum = new tool();
        int n = 7;
        int res = sum.fibonacci(n);
        if (res != -1) {
            System.out.println("when n =" +n +"correspondding fibonacci number =" + res);
        }
    }
}
class tool {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("error input");
            return -1;
        }
    }
}
