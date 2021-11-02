package Java.Se4;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        Student s1 = new Student("ali" , "alavi" , 22 , book ,"123");
        Student s2 = new Student("maryam" , "rajabi" , 19 , book , "456");
        s1.talk();

    }

}
