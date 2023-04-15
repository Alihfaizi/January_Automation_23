package Action_Items;

import java.util.ArrayList;

public class Action_Item_1_ArrayList_ForLoop {
    public static void main(String[] args) {

        //create an array list of countries
        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Pakistan");
        country.add("Mexico");
        country.add("Iraq");
        country.add("Afghanistan");

        //create an array list of countryCodes
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(92);
        countryCode.add(52);
        countryCode.add(964);
        countryCode.add(98);

        //create a for loop to print out all countries and their countryCodes
        for(int i = 0; i < country.size(); i++){
            System.out.println("My country is " + country.get(i) + " and my country code is +" + countryCode.get(i) );

        }//end of for loop
    }// End of main
}// End of class
