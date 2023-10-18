Suresh is a civil engineer.He wants to find the perimeter of the plots which helps him to make blueprints of the 
land.
Write a java program to find the perimeter of the plots which helps suresh to execute his plans easily.

Sample Test Case:

Enter the length of the plot: 100
Enter the width of the plot: 50
Perimeter of the plot is: 300

Sample Test Cases

Test Case 1:

Expected Output:
Enter·the·length·of·the·plot:·100
Enter·the·width·of·the·plot:·50
Perimeter·of·the·plot·is:·300

Test Case 2:

Expected Output:
Enter·the·length·of·the·plot:·58
Enter·the·width·of·the·plot:·44
Perimeter·of·the·plot·is:·204

Test Case 3:

Expected Output:
Enter·the·length·of·the·plot:·99
Enter·the·width·of·the·plot:·87
Perimeter·of·the·plot·is:·372

Test Case 4:

Expected Output:
Enter·the·length·of·the·plot:·20
Enter·the·width·of·the·plot:·10
Perimeter·of·the·plot·is:·60

package q1153;
import java.util.Scanner;
public class RectanglePerimeter {
public static void main(String[] args) { 
//write your code here
Scanner a = new Scanner(System.in);
System.out.println("Enter the length of the plot: "); System.out.print("Enter the width of the plot: ");
int x = a.nextInt(); int yea.nextInt();
System.out.println("Perimeter of the plot is: "+(2*(x+y)));
}
}