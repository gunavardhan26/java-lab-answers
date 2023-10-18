Raju is feverish. Although the thermometer only displays temperatures in Fahrenheit, his companion Ravi wants 
to check Raju's body temperature in Celsius.
Write a java program to help ravi which converts temperature from Fahrenheit to Celsius scale.
Use the formula:
	Celsius=(Fahrenheit - 32) * 5/9
Sample Test Case:

Enter temperature in Fahrenheit: 100.5
Temperature in Celsius: 38.055557

Sample Test Cases

Test Case 1:

Expected Output:
Enter·temperature·in·Fahrenheit:·100.5
Temperature·in·Celsius:·38.055557

Test Case 2:

Expected Output:
Enter·temperature·in·Fahrenheit:·95.2
Temperature·in·Celsius:·35.11111

Test Case 3:

Expected Output:
Enter·temperature·in·Fahrenheit:·99
Temperature·in·Celsius:·37.22222

Test Case 4:

Expected Output:
Enter·temperature·in·Fahrenheit:·96.58
Temperature·in·Celsius:·35.87778

package q1146;
import java.util.Scanner;
public class TemperatureConverter {
public static void main(String[] args) {
// write your code here
Scanner a = new Scanner(System.in);
System.out.print("Enter temperature in Fahrenheit: ");
float x = a.nextFloat();
System.out.println("Temperature in Celsius: "+((x-32)*5/9));
}
}