/**
 * Lucas Waldrop
 * CH7PC2
 * Programming III - APCS
 * 12/19/18
 */

import java.util.Scanner;

public class EmployeeWageCalc {
    
    Scanner keyboard = new Scanner(System.in);
    
    private int[] employeeID = {5658845, 4520125, 7895122, 8777541, 8541277, 12302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wage = new double[7];

    
    /**
     * The getInfo method takes the user's input and stores it into the arrays.
     */
    
    public void getInfo(){
        for(int x = 0; x < 7; x++){
            System.out.print("Enter the hours worked by employee " + employeeID[x] + ": ");
            hours[x] = keyboard.nextInt();
            System.out.print("Enter the hourly pay rate for employee " + employeeID[x] + ": ");
            payRate[x] = keyboard.nextDouble();
            
        }
    }
    
    public void wageCalc(){
        for(int x = 0; x < 7; x++){
            wage[x] = hours[x] * payRate[x];
            System.out.println(employeeID[x] + ": $" + wage[x]);
        }
    }
     
}
