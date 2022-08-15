import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    private  String name;
    private int age;
    private String place;

    public Person(int id, String name, int age, String place){
        this.id = id;
        this.age = age;
        this.name = name;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}


//92570179