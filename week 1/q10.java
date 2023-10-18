You are working on a software project that involves handling user input for various calculations. The user enters 
numeric values as strings, and you need to convert these strings to decimals for the calculations.
Note: Use Double.parseDouble(String) to convert String to double.

Sample Test Case:

Enter a double value: 14.36
Double value entered: 14.36

Sample Test Cases

Test Case 1:

Expected Output:
Enter·a·double·value:·14.36
Double·value·entered:·14.36

Test Case 2:

Expected Output:
Enter·a·double·value:·32.65
Double·value·entered:·32.65

Test Case 3:

Expected Output:
Enter·a·double·value:·46.85
Double·value·entered:·46.85

Test Case 4:

Expected Output:
Enter·a·double·value:·1.254
Double·value·entered:·1.254

package q1157;
import java.util.Scanner;
public class TypeCasting{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); 
//write your code here
System.out.print("Enter a double value: ");
double x = scanner.nextDouble();
System.out.println("Double value entered: "+x);
}
}