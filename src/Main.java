import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- HomeWork #1 - HASHMAP ---------------");
        HashMap<String, Cat> cat = new HashMap<>();
        cat.put("cat1", new Cat("cat1", 1));
        cat.put("cat2", new Cat("cat2", 2));
        cat.put("cat3", new Cat("cat3", 3));
        cat.put("cat4", new Cat("cat4", 4));
        cat.put("cat5", new Cat("cat5", 5));
        cat.put("cat6", new Cat("cat6", 6));
        cat.put("cat7", new Cat("cat7", 7));
        cat.put("cat8", new Cat("cat8", 8));
        cat.put("cat9", new Cat("cat9", 9));
        cat.put("cat10", new Cat("cat10", 10));

        for (Map.Entry c:cat.entrySet()) {
            System.out.println(c);
        }
        System.out.println("------------------------------");
        cat.remove("cat10");
        System.out.println("Removed Cat10: "+cat);
        System.out.println("------------------------------");
        System.out.println("Empty or not: "+cat.isEmpty());
        System.out.println("------------------------------");
        cat.putIfAbsent("cat11", new Cat("cat11", 11));
        System.out.println("Put if absent Cat11: "+cat);
        System.out.println("------------------------------");
        System.out.println("Get value with the key: "+cat.get("cat4"));
        System.out.println("------------------------------");
        System.out.println("Size of hashmap: "+cat.size());
        System.out.println("------------------------------");
        System.out.println("Contains: "+cat.containsKey("cat5"));
        System.out.println("------------------------------");
        cat.clear();
        System.out.println("Cleared the Cat hashmap: "+cat);


        System.out.println("--------------- HomeWork #2 - SET ---------------");
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        System.out.println("Set: "+set);

        Set<String> sorted = new TreeSet<>(set);
        System.out.println("Sorted set: "+sorted);

    }
}