Ganesh owns a paper plant and recently received a large order to make paper plates with various radii.Ganesh 
needs to compute the area of every plate with a different radius each time.
Create a Java programme that calculates the area of the circular plates using the radius to aid Ganesh.

Note: Take pi value as 3.14

Sample Test Case:

Enter the radius: 20
Area: 1256.0

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·radius:·20
Area:·1256.0

Test Case 2:

Expected Output:
Enter·the·radius:·50
Area:·7850.0

Test Case 3:

Expected Output:
Enter·the·radius:·5
Area:·78.5

Test Case 4:

Expected Output:
Enter·the·radius:·6
Area:·113.03999999999999

package q1154;
import java.util.Scanner; public class Area0fCircle {
public static void main(String[] args) {
//write your code here
Scanner a = new Scanner(System.in);
System.out.print ("Enter the radius: ");
Double x = a.nextDouble();
System.out.println("Area:"+(3.14*x*x)); 
}
}