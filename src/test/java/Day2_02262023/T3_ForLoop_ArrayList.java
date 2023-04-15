package Day2_02262023;

import java.util.ArrayList;
public class T3_ForLoop_ArrayList {
    public static void main(String[] args) {
        //create a list of arrays
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Canada");
        countries.add("Argentina");

        ArrayList<Integer> areaCode = new ArrayList<>();
        areaCode.add(111);
        areaCode.add(211);
        areaCode.add(311);
        areaCode.add(411);
        areaCode.add(511);
        areaCode.add(611);
        areaCode.add(811);

        //System.out.println(countries.size());

        // Practice is below

        //for (int i = 0; i < countries.size(); i++){
        //    System.out.println("Country is " + countries.get(i) + " & " + "area code is " + areaCode.get(i));
        //}
        //if you are using one loop for 2 or more array list, then they all should have the same amount of count
        // if not then it needs to be in separate loop statement

        // iterate/loop through the entire list of countries using for loop

        for (int i = 0; i < countries.size(); i++){
            System.out.println("Country is " + countries.get(i) + " area code is " + areaCode.get(i));
        }//end of loop

    }//end of main
}// end of java class

