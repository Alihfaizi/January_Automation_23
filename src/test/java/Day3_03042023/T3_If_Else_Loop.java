package Day3_03042023;

import java.util.ArrayList;

public class T3_If_Else_Loop {
    public static void main(String[] args) {
        //create a string of fruits
        String[] fruit = new String[]{"Apple", "Orange", "Grape", "Strawberry"};
/*
        //using a loop only print only when the fruit is apple or grape
        for (int i = 0; i < fruit.length; i++){
            if(fruit[i] == "Apple"){
                System.out.println("My fruit is " + fruit[i]);
            }if(fruit[i] == "Grape"){
                System.out.println("My fruit is " + fruit[i]);
            }//end of conditional statements
        }//end of for loop
*/

        /*
        itterate through a list of fruit using ArrayList
        but only print when fruit is grape or apple
         */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Grape");

        for (int i = 0; i < fruits.size(); i++) {
            /*
            if (fruits.get(i) == "Apple") {
                System.out.println("Fruit: Apple");
            } else if (fruits.get(i) == "Grape") {
                System.out.println("Fruits: Grape");
            }//end of condition
             */

            //using the OR operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape"){
                System.out.println("Fruit: " + fruits.get(i));
            }//end of conditonal statement
        }//end of for loop
    }//end of main
}//end of class

