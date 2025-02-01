package src.start.labs.laboratory;

import java.util.ArrayList;
import java.util.List;

public class lab17 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(3, "Karina");

        System.out.println(list.size());
        for(String names : list){
            System.out.println(names);
        }
        System.out.println("-----------------------");

        //list.remove("Ana");
        //list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String names : list){
            System.out.println(names);
        }
        System.out.println("-----------------------");

        System.out.println(list.indexOf("Bob"));
        System.out.println(list.indexOf("Marco"));
        System.out.println("-----------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String names : result){
            System.out.println(names);
        }
        System.out.println("-----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);


    }
}
