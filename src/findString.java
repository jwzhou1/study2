public class findString {
    public static void main(String[] args) {
            A02 a2 = new A02();
            String[] arr = {"alex", "tommy","jack","da","wqeq"};
            String str = "tommy";
            System.out.println("string location is " + a2.find(arr,str));
        };
    }
class A02 {
    public int find(String[] arr, String str) {
        if (str != null) {
            for (int i = 0; i < arr.length; i++) {
                if (str.equals(arr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}
