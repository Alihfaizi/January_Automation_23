package Day2_02262023;

public class T1_LinearArray {
    public static void main(String[] args) {
        //create a list of cities in linear array
        //array counts start from 0 index
        String[] cities = new String[]{"Brooklyn","Queens","Manhattan","Bronx","Staten Island"};
        //get out the count of the cities
        System.out.println("Cities count is " + cities.length);
        //print out Brooklyn and Bronx form the array
        System.out.println("My cities are " + cities[0] + ", " + cities[3]);


        //create a list of zipcodes
        int[] zipcode = new int[]{11218,22222,33333,55555};
        //get the count of zipcodes
        System.out.println("Zipcode count is " + zipcode.length);
        //Print out 11218 and 33333 from the list
        System.out.println("My zipcodes are " + zipcode[0] + ", " + zipcode[2]);
        //get the length of brooklyn - not covered in class
        System.out.println(cities[0].length());


    }//end of main method
}//end of class

