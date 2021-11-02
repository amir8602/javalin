package Java.Se4;

public class Student extends Person {

    private Book book;
    private String sid;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Student(String name, String family, Integer age, Book book, String sid) {
        super(name, family, age);
        this.book = book;
        this.sid = sid;
    }

    @Override
    public void talk() {
        System.out.println("Student talk");
    }

    @Override
    public String toString() {
        String str = String.format("name : %s  -  family : %s  -  age : %d  -  sid : %s  -  book : %s " , this.getName() , this.getFamily() , this.getAge() , this.getSid() , this.getBook());
        return str;
    }

    @Override
    public boolean equals(Object o) {
        Student sec = (Student)o;
        if(this.getName().equalsIgnoreCase(sec.getName()))
            if(this.getFamily().equalsIgnoreCase(sec.getFamily()))
                return true;
        return false;
    }
}
