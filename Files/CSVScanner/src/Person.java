/**
 * Created by emeis on 7/9/2018.
 */
public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String getPersonData() {
        return this.name+" "+this.surname+" "+this.city+" "+this.phone;
    }

}
