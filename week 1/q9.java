Imagine having a stock trading application that only shows double datatype stock prices.Users occasionally 
request estimated stock prices in the form of float, long, and int datatypes.
Write a java program which takes the stock price and converts the price to display approximately(Observe the 
Sample Test Case).

Sample Test Case:

Enter the number: 126.321
After narrowing values are:
Float value: 126.321
Long value: 126
Int value: 126

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·number:·126.321
After·narrowing·values·are:
Float·value:·126.321
Long·value:·126
Int·value:·126

Test Case 2:

Expected Output:
Enter·the·number:·23.54
After·narrowing·values·are:
Float·value:·23.54
Long·value:·23
Int·value:·23

Test Case 3:

Expected Output:
Enter·the·number:·89.546
After·narrowing·values·are:
Float·value:·89.546
Long·value:·89
Int·value:·89

Test Case 4:

Expected Output:
Enter·the·number:·2.31
After·narrowing·values·are:
Float·value:·2.31
Long·value:·2
Int·value:·2

package q1141;
import java.util.Scanner;
public class ExplicitTypeConversion
{
public static void main(String[] args)
{
//write your code here
Scanner a = new Scanner(System.in);
System.out.print("Enter the number: ");
float x = a.nextFloat();
long y = (long)x; 
int z = (int)x;
System.out.println("After narrowing values are:");
System.out.println("Float value: "+x); System.out.println("Long value: "+y);
System.out.println("Int value: "+z);
}
}