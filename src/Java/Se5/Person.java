package Java.Se5;

public class Person implements Comparable<Person> {

    private String name;
    private String family;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, String family, Integer age) {
        this.name = name;
        this.family = family;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.getAge()>person.getAge()){
            return 1;
        }else if (this.getAge()==person.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
