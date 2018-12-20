/**
 * Lucas Waldrop
 * CH7PC2
 * Programming III - AP CS
 * 12/19/18
 */

import java.util.Scanner;

public class UserDataInput {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        EmployeeWageCalc employeeList = new EmployeeWageCalc();
        employeeList.getInfo();
        employeeList.wageCalc();
        
    }

}
