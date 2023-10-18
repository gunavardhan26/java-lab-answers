You are developing software for an inventory management system in a retail store. Part of the system involves 
entering and processing product prices, which are represented as decimal values. To optimise storage and 
facilitate calculations, Write a program to convert these prices to integers, rounding them to the nearest cent.

Sample Test case:

Enter a double value: 12.35
Original Value before Casting: 12.35
After Type Casting to short: 12
After Type Casting to int: 12

Sample Test Cases

Test Case 1:

Expected Output:
Enter·a·double·value:·12.35
Original·Value·before·Casting:·12.35
After·Type·Casting·to·short:·12
After·Type·Casting·to·int:·12

Test Case 2:

Expected Output:
Enter·a·double·value:·45.123
Original·Value·before·Casting:·45.123
After·Type·Casting·to·short:·45
After·Type·Casting·to·int:·45

Test Case 3:

Expected Output:
Enter·a·double·value:·3.21
Original·Value·before·Casting:·3.21
After·Type·Casting·to·short:·3
After·Type·Casting·to·int:·3

Test Case 4:

Expected Output:
Enter·a·double·value:·100.23
Original·Value·before·Casting:·100.23
After·Type·Casting·to·short:·100
After·Type·Casting·to·int:·100

package q1159;
import java.util.Scanner;
public class NarrowingTypeCasting { public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a double value: "); 
double inputDouble = scanner.nextDouble();
// write your code here
System.out.println("Original Value before Casting: "+inputDouble);
short x=(short)inputDouble; int y=(int) inputDouble;
System.out.println("After Type Casting to short: "+x);
System.out.println("After Type Casting to int: "+y);
}
}