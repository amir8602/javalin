package Java.Se4;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Student s1 = new Student("ali" , "alavi" , 22 , book ,"123");
        Student s2 = new Student("maryam" , "rajabi" , 19 , book , "456");
        Person p1 = new Person("ahmad","ahmadi",12);
        s1.talk();
        System.out.println(s1);
        System.out.println(p1);

    }

}
