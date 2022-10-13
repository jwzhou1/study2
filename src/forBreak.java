public class forBreak {
    public static void main (String[] args) {
        for (int i = 1; ; i++){
            double d = Math.random();
            if (d > 0.9999) {
                System.out.println(d);
                break;
            }
        }
    }
}
