import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadFile {
    private List<Person> people;
    private int current;

    public ReadFile() {
        people = new ArrayList<>();

        try{
            List<String> lines = Files.readAllLines(Paths.get("res/preferences.txt"));
            for (int i = 0; i < lines.size(); i++) {
                String[] parts = lines.get(i).split(" ");
                List<Person> temp = new ArrayList<>();
                for (String part : parts) {
                    temp.add(new Person(part));
                }
                people.add(i, new Person(parts[0], temp));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Person> getPeople() {
        return people;
    }
}
