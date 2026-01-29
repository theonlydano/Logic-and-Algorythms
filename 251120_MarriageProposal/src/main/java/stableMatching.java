import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stableMatching {
    public static void main(String[] args) {
        List<Person> people;
        Map<String, Person> engagements = new HashMap<>();
        List<String> alreadyEngaged = new ArrayList<>();
        List<Person> males = new ArrayList<>();
        List<Person> females = new ArrayList<>();

        ReadFile readFile = new ReadFile();
        people = readFile.getPeople();

        for (int i = 0; i < people.size()/2; i++) {
            males.add(people.get(i));
        }
        for (int i = people.size()/2; i < people.size(); i++) {
            females.add(people.get(i));
        }

        for (Person male : males) {
            for(Person female : male.getPreferences()) {
                if(male.getPreferences().stream()
                        .anyMatch(e -> e.equals(female.getPreferences()))) {
                    if(!alreadyEngaged.contains(female.getName()) && !alreadyEngaged.contains(male.getName())){
                        System.out.println(female.getName() + " " + male.getName());
                        engagements.put(male.getName(), female);
                        alreadyEngaged.add(female.getName());
                        alreadyEngaged.add(male.getName());
                    }
                }
            }
            alreadyEngaged.add(male.getName());
        }

        // output everything
        engagements.forEach((k,v)->{
            System.out.println(k+"\t"+v);
        });
    }
}
