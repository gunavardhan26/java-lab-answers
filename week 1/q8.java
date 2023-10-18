Write a java program to Convert int to following datatypes
	int to long
	long to float
	float to double
	Print all the converted values.
Sample Test Case:

Enter an Integer: 78
After widening values are:
Long value: 78
Float value: 78.0
Double value: 78.0

Sample Test Cases

Test Case 1:

Expected Output:
Enter·an·Integer:·78
After·widening·values·are:
Long·value:·78
Float·value:·78.0
Double·value:·78.0

Test Case 2:

Expected Output:
Enter·an·Integer:·-123
After·widening·values·are:
Long·value:·-123
Float·value:·-123.0
Double·value:·-123.0

Test Case 3:

Expected Output:
Enter·an·Integer:·-4
After·widening·values·are:
Long·value:·-4
Float·value:·-4.0
Double·value:·-4.0

Test Case 4:

Expected Output:
Enter·an·Integer:·265
After·widening·values·are:
Long·value:·265
Float·value:·265.0
Double·value:·265.0

package q1140; import java.util.Scanner;
public class TypeConversion {
public static void main(String[] args) {
//write your code here
Scanner a = new Scanner(System.in);
System.out.print("Enter an Integer: ");
int x = a.nextInt();
float y = x;
double z= x;
System.out.println("After widening values are:");
System.out.println("Long value: "+x);
System.out.println("Float value: "+y);
System.out.println("Double value: "+z);
}
}