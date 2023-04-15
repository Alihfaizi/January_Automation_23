package Action_Items;

public class Action_Item_2_Assignment_1 {
    public static void main(String[] args) {
        //set a variable to represent what grade a student got
        int grade = 85;

        //using multiple conditional statements print out a letter grade given a numeric grade range
        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Grade is B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Grade is C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Grade is D");
        } else if (grade < 60) {
            System.out.println("Grade is F");
        }// end of conditional statements
    }//end of main
}//end of class
