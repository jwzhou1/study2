public class testPerson {
    public static void main(String[] args) {
        P1 person1 = new P1("mary", 30);
        P1 person2 = new P1("mary", 30);
        System.out.println("p1 and p2 compare result = " + person1.compareTo(person2));
    }
}

class P1 {
    String name;
    int age;
    public P1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(P1 p){
            return this.name.equals(p.name) && this.age == p.age;
        }
    }
