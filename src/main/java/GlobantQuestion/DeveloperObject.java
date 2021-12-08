package GlobantQuestion;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class DeveloperObject {

    public static void main(String args[]) {

        Developer kolateDeveloper = new Developer("Kolte Patil", 35l);
        Developer paranjapeDeveloper = new Developer("Paranjape", 30l);

        List<Developer> developersList = new ArrayList<Developer>();
        developersList.add(kolateDeveloper);
        developersList.add(paranjapeDeveloper);
        //Sort List based on turnover

        Collections.sort(developersList, (o1, o2) -> o1.getTurnover().compareTo(o2.getTurnover()));
        developersList.stream()
                .forEach( e -> System.out.println(e.getName()));

        //print developer name whose turnover is greater than 32l
        developersList.stream()
                .filter(e -> e.getTurnover()>32l)
                .forEach(e -> System.out.println(e.getName()));


    }
}