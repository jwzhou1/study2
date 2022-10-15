public class constructorEx {
    public static void main(String[] args) {
            Person1 p1 = new Person1();
            System.out.println("p1 name =" + p1.name+",age=" +p1.age);
           Person1 p2 =  new Person1("scott",50);
        System.out.println("p2 name =" + p2.name+",age=" +p2.age);
    }
}
class Person1 {
    String name;
    int age;
    public Person1(){
        age = 18;
    }
    public Person1(String pNmae, int page) {
        name = pNmae;
        age=page;
    }
}
