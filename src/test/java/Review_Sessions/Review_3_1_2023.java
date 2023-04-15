package Review_Sessions;

import java.util.ArrayList;

public class Review_3_1_2023 {
    public static void main (String[] args) {

        //define a string variable
        //String weekendClass = "Wednesday review session";

        //define an integer variable
        //int number = 404;

        //String job = "Automation engineer";
        //String salary = "$100,000";

        //Concatenation allows us to print out two or more variables

        //System.out.println("My job is " + job + " and my salary is " + salary);

        //creating a string of jobs using linear array
        //String[] job = new String[]{"Dev","QA","PO","BA"};
        //int[] salary = new int[]{200,100,150,125};

        //System.out.println(job.length);
        //System.out.println(salary[0]);

        //create a string using array list
        //ArrayList <String> jobs = new ArrayList<>();
        //jobs.add("QA");
        //jobs.add("PO");
        //jobs.add("BA");

        //System.out.println(jobs.size());
        //System.out.println(jobs.get(0));

      ArrayList <String> jobs = new ArrayList<>();
        jobs.add("QA");
        jobs.add("PO");
        jobs.add("BA");
        jobs.add("Dev");

        int i = 0;
        while(i < jobs.size()){
            System.out.println(jobs.get(i));
            i = i + 1;
        }

        //for(int i = 0; i < jobs.size(); i++){
            //System.out.println(jobs.get(i));

        //}//end of loop

        //selenium is an open source automation testing tool
        //maven allows you to go ahead and define the dependencies.
        // intellij is an IDE -
        //How do you select what test cases to automate? repeditive test cases; high risk of human error; features that are very important to youre client;



    }// end of main
}//end of class
