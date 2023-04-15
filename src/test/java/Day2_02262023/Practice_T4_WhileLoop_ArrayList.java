package Day2_02262023;

import java.util.ArrayList;

public class Practice_T4_WhileLoop_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> towns = new ArrayList<>();
        towns.add("Elmont");
        towns.add("Hempstead");
        towns.add("Selden");

        int i = 0;
        while (i < towns.size()) {
            System.out.println("The towns are " + towns.get(i));

            i = i+1;//i++

        }//end of while loop



    }//end of main method
}//end of class

