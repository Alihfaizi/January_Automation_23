package Action_Items;

public class Action_Item_1_LinearArray_WhileLoop {
    public static void main(String[] args) {

        //create a list of regions with linear array
        String[] region = new String[]{"Spain", "Croatia", "Hungary", "Netherlands", "United Kingdom"};

        //create a list of regional codes with linear array
        int[] regionalCode = new int[]{34,385,36,31,44};

        //loop through the entire list of countries using a while loop
        int i = 0;
        while(i < region.length){
            System.out.println("My region is " + region[i] + " and my region code is +" + regionalCode[i]);
            i = i + 1;

        }// end of while loop
    }//end of main
}//end of class
