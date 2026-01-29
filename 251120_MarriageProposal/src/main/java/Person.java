import java.util.List;

public class Person {
    public String name;
    public List<Person> preferences;


    public Person(String name, List<Person> preferences) {
        this.name = name;
        this.preferences = preferences;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public List<Person> getPreferences() {
        return preferences;
    }
    public Person getPreferenceAt(int i) {
        return preferences.get(i);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", preferences=" + preferences.toString() + "]";
    }
}
