Ravi possesses three geometric figures: a rectangle, a square, and a circle. He has the measurements for these 
shapes but lacks the knowledge to compute their respective areas. Create a program that assists Ravi in 
determining the areas of these different shapes.



Note: "Invalid choice. Please choose 1, 2, or 3." Use these sentences in default

Sample Test Case:

Choose a shape:
1. Rectangle
2. Square
3. Circle
Enter your choice (1/2/3): 1
Enter the length of the rectangle: 12
Enter the width of the rectangle: 13
The area of the rectangle is: 156.0
Sample Test Cases
Test Case 1:
Expected Output:
Choose·a·shape:
1.·Rectangle
2.·Square
3.·Circle
Enter·your·choice·(1/2/3):·9
Invalid·choice.·Please·choose·1,·2,·or·3.

Test Case 2:
Expected Output:
Choose·a·shape:
1.·Rectangle
2.·Square
3.·Circle
Enter·your·choice·(1/2/3):·1
Enter·the·length·of·the·rectangle:·20.56
Enter·the·width·of·the·rectangle:·10.365
The·area·of·the·rectangle·is:·213.1044

Test Case 3:
Expected Output:
Choose·a·shape:
1.·Rectangle
2.·Square
3.·Circle
Enter·your·choice·(1/2/3):·2
Enter·the·side·length·of·the·square:·30.569
The·area·of·the·square·is:·934.463761

Test Case 4:
Expected Output:
Choose·a·shape:
1.·Rectangle
2.·Square
3.·Circle
Enter·your·choice·(1/2/3):·3
Enter·the·radius·of·the·circle:·50.64
The·area·of·the·circle·is:·8056.33036015514

Test Case 5:
Expected Output:
Choose·a·shape:
1.·Rectangle
2.·Square
3.·Circle
Enter·your·choice·(1/2/3):·1
Enter·the·length·of·the·rectangle:·256.25
Enter·the·width·of·the·rectangle:·365.2
The·area·of·the·rectangle·is:·93582.5


package q1168;
import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.print("Enter your choice (1/2/3): ");
                    int choice = scanner.nextInt();
            switch (choice) {
                //write code here
                case 1:
                    System.out.print("Enter the length of the rectangle: ");
                    double a = scanner.nextDouble();
                   System.out.print("Enter the width of the rectangle: ");
                   double b = scanner.nextDouble();
                    System.out.println("The area of the rectangle is: "+a*b);
                    break;
                case 2:
                   System.out.print("Enter the side length of the square: ");
                   double c = scanner.nextDouble();
                   System.out.println("The area of the square is: "+c*c);
                    break;
                case 3:
                   System.out.print("Enter the radius of the circle: ");
                   double d = scanner.nextDouble();   
                   System.out.println("The area of the circle is: "+3.141592653589793238*(d*d));
                    break;
                default :
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }
        }
}