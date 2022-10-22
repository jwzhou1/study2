package com.studybilibili.dynamic;

public class Polyarray {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("mary", 20);
        person[1] = new Student("jack", 30, 80);
        person[2] = new Student("adam", 20, 30);
        person[3] = new Teacher("qa", 20, 10000);
        person[4] = new Teacher("hala", 20, 23000);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());
            if (person[i] instanceof Student) {
                Student student = (Student) person[i]; //向下转型
                student.study();
                // alternative: (Student)person[i].study();
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i]; //向下转型
                teacher.teach();
            } else if(person[i] instanceof Person) {
            }else{
                System.out.println("type is wrong");
            }
        }

    }

}
