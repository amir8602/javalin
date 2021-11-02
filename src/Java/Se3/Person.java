package Java.Se3;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Person {

    private String name;
    private String family;
    private Integer age;
    private Boolean goneToEsfahan;
    ArrayList <String> movies ;
    private static Integer max_age = 130;
    private static final String  country = "IRI" ;

    static {
        max_age = 120;
    }

    public Boolean getGoneToEsfahan() {
        return goneToEsfahan;
    }

    public void setGoneToEsfahan(Boolean goneToEsfahan) {
        this.goneToEsfahan = goneToEsfahan;
    }

    public Person() {
    }

    public Person(String name, String family, Integer age, Boolean goneToEsfahan) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.goneToEsfahan = goneToEsfahan;
        movies = new ArrayList<>();
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    public Boolean haveGazSoFar() {
        if(this.getGoneToEsfahan()){
            System.out.println("yes");
            return true ;
        }else {
            System.out.println("no");
            return false;
        }
    }

    public void goToCinema(String movie){
        movies.add(movie);
        System.out.printf("%s watch the %s movie %n", this.getName() , movie );
    }

    public void tellMeMoviesYouSeenBefore(){
        for (String movie : movies) {
            System.out.println(movie);
        }

    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }

    public static Integer getMax_age() {
        return max_age;
    }

    public static void setMax_age(Integer max_age) {
        Person.max_age = max_age;
    }
}
