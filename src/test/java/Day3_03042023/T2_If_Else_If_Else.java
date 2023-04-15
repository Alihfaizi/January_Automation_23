package Day3_03042023;

public class T2_If_Else_If_Else {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;

        //using multiple contional statements verify when a+b < c, a+b > c, a+b == c
        if (a+b < c){
            System.out.println("a+b is less than c");
        }else if(a+b > c){
            System.out.println("a+b is more than c");
        }else if(a+b == c){
            //when you compare two values it will always be == double equal sign
            System.out.println("a+b is equal to c");
        }//end of multiple conditional statements
    }//end of main
}//end of class
