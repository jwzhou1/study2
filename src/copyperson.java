public class copyperson {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "hihi";
        p.age = 50;
        myTools tools = new myTools();
        Person p2 = tools.copyPerson(p);
        System.out.println(p.age + " " +p.name);
        System.out.println(p2.age + " " +p2.name);
        System.out.println(p == p2);
    }
}
class Person{
    int age;
    String name;
}
class myTools {
    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}
