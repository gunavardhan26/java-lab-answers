Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c . Read in a,b,c and use 
the quadratic formula.

Sample Test Cases

Test Case 1:

Expected Output:
Enter·Value·for·a:·1
Enter·Value·for·b:·4
Enter·Value·for·c:·6
No·Real·Solutions

Test Case 2:

Expected Output:
Enter·Value·for·a:·1
Enter·Value·for·b:·6
Enter·Value·for·c:·6
Real·Solutions·are:·-1.2679491924311228,-4.732050807568877

import java.util.Scanner;
import java.lang.Math;
class realSolutions
{
public static void main(String[] args)
{
Scanner x = new Scanner(System.in);
System.out.print("Enter Value for a: ");
double a = x.nextDouble();
System.out.print("Enter Value for b: ");
double b= x.nextDouble();
System.out.print("Enter Value for c: ");
double c = x.nextDouble(); 
double determinant =(b*b)-(4*a*c);
double sqrt = Math.sqrt(determinant);
if(determinant>0){
double firstRoot = (-b + sqrt)/(2*a);
double secondRoot = (-b-sqrt)/(2*a);
System.out.println("Real Solutions are: "+firstRoot+ "+secondRoot);
} 
else if(determinant = 0){
System.out.println("Roots are equal and value is: "+(-b + sqrt)/(2*a));
}
else {
System.out.println("No Real Solutions");
}
}
}