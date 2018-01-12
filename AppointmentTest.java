
/**
 * Write a description of class Appointments here.
 *
 * @author Bailee Sjostrom
 * @version 1/12/2018
 */

import java.util.Scanner;

public class AppointmentTest
{
    public static void main() {
       Appointment app1 = new Appointment();
       Appointment app2 = new Appointment();
        
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter name for first appointment: ");
       app1.setName(in.nextLine());
              
       System.out.print("Enter day for first appointment: ");
       app1.setDay(in.nextLine());
       
       System.out.print("Enter duration for first appointment: ");
       app1.setDuration(Double.parseDouble(in.nextLine()));
       
       System.out.print("Enter name for second appointment: ");
       app2.setName(in.nextLine());
       
       System.out.print("Enter day for second appointment: ");
       app2.setDay(in.nextLine());
       
       System.out.print("Enter duration for second appointment: ");
       app2.setDuration(Double.parseDouble(in.nextLine()));
       
       System.out.println("You have a " + app1.getDuration + " hour appointment on " + app1.getDay + " with " + app1.getName + ".");
       System.out.println("You have a " + app2.getDuration + " hour appointment on " + app2.getDay + " with " + app2.getName + ".");
    
}
}


//Scanner Example
    /* public static void main() {
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter Something: ");
       String s = in.nextLine();
       
       System.out.println(s);
    } */ 