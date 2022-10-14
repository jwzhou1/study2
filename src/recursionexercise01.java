public class recursionexercise01 {
    public static void main(String[] args){
        tool sum = new tool();
//        int n = 7;
//        int res = sum.fibonacci(n);
//        if (res != -1) {
//            System.out.println("when n =" +n +"correspondding fibonacci number =" + res);
//        }
        int day = 9;
        int peach = sum.monkeyeat(day);
        if (peach != -1) {
            System.out.println(peach);
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
    public int monkeyeat(int day) {
        if (day ==10){
            return 1;
        } else if (day >=1 && day <=9) {
            return (monkeyeat(day+1)+1) *2;
        } else {
            System.out.println("wrong input for day");
            return -1;
        }
    }
}
