package com.company;

import java.util.Scanner;

public class StudentRecordReader {

    public static void main(String[] args) {
	// write your code here
        String fname, lname ;
        double gpa;
        int hours;


        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Student's First Name? \n " );
        fname = keyboard.next();

        System.out.print( "Student's Last Name? \n " );
        lname = keyboard.next();

        System.out.print( "Student's GPA? \n " );
        gpa = keyboard.nextDouble();

        System.out.print( "Student's Current Course Load? \n " );
        hours = keyboard.nextInt();



if (hours >= 12 ) {
    System.out.println();
    System.out.println("Student Name :" + fname + " " + lname);
    System.out.println("Student GPA :" + gpa);
    System.out.println("Student hours :" + hours);




    if (gpa >= 3) {
        System.out.println("This student is in good standing.");
    } else if (gpa >= 2) {
        System.out.println("This student needs to study more.");
    } else if (gpa >= 1)
    {
        System.out.println("This student is on academic probation.");
    } else {
        System.out.println("This student has been expelled.");
    }

}
    else { System.out.println("This Student is not Full time");}
    }
}
