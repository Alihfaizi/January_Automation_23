package Day3_03042023;

public class T4_Split {
    public static void main(String[] args) {
        //create a sting saying what your name is
        String message = "My name is Ali";
        //using split function make your string in to an array and print our your name
        String[] arrayMessage = message.split(" ");
        System.out.println(arrayMessage[3]);
    }//end of main
}//end of class
