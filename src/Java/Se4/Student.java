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
}
