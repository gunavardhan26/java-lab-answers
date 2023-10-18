You are working on a software project for an international language education program. The project involves 
creating a program that allows users to enter keyboard shortcuts for various language characters and symbols. 
These shortcuts are represented as short data types, and you need to convert them to char data types to display the corresponding characters.

Sample Test Case:

Enter a short value: 65
Original short value: 65
Converted char value: A

Sample Test Cases

Test Case 1:

Expected Output:
Enter·a·short·value:·65
Original·short·value:·65
Converted·char·value:·A

Test Case 2:

Expected Output:
Enter·a·short·value:·67
Original·short·value:·67
Converted·char·value:·C

Test Case 3:

Expected Output:
Enter·a·short·value:·78
Original·short·value:·78
Converted·char·value:·N

Test Case 4:

Expected Output:
Enter·a·short·value:·100
Original·short·value:·100
Converted·char·value:·d

package q1161;
import java.util.Scanner;
public class ShortToCharConversion { public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//write your code here
System.out.print("Enter a short value: ");
Short x = scanner.nextShort();
System.out.println("Original short value: "+x);
int y=x;
char z = (char)y;
System.out.println("Converted char value: "+z);
}
}