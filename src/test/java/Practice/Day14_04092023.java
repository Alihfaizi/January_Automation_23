package Practice;

import java.util.ArrayList;

public class Day14_04092023 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Manhattan");
        cities.add("Bronx");
        cities.add("Queens");

        for(int i=0; i<cities.size();i++){
            if(cities.get(i) == "Brooklyn" || cities.get(i) == "Queens"){
                System.out.println("Cities: " + cities.get(i));
            }
        }
    }
}
