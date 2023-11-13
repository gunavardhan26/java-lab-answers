In a class, the teacher conducted an exam for all the students. Based on that exam, their ranks were decided like 
this

Marks greater than or equal to 90 and Marks less than or equal to 100 as 1st Rank,
Marks greater than or equal to 75 and Marks less than 90 as 2nd Rank,
Marks greater than or equal to 50 and Marks less than 75 as 3rd Rank,
Marks greater than or equal to 35 and Marks less than 50 as just passed,
Marks greater than or equal to 10 and Marks less than 35 as failed
Any Other Marks as "Invalid credentials. Please enter valid marks."


Sample Test Case:

Enter your marks: 75
You got 2nd rank.


Note: "Congratulations! You got 1st rank."

"You got 2nd rank."

"You got 3rd rank."

"You just passed."

"You failed."

"Invalid credentials. Please enter valid marks." use these sentences in print statements

Sample Test Cases
Test Case 1:
Expected Output:
Enter·your·marks:·23
You·failed.

Test Case 2:
Expected Output:
Enter·your·marks:·8
Invalid·credentials.·Please·enter·valid·marks.

Test Case 3:
Expected Output:
Enter·your·marks:·95
Congratulations!·You·got·1st·rank.

Test Case 4:
Expected Output:
Enter·your·marks:·35
You·just·passed.

Test Case 5:
Expected Output:
Enter·your·marks:·90
Congratulations!·You·got·1st·rank.

package q1166;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter your marks: ");
          // Prompt the user to enter marks
          int a = scanner.nextInt();
          // Determine the student's result based on marks
          if(90<=a&a<=100)
          {
                  System.out.println("Congratulations! You got 1st rank.");
          }
          else if (75<=a&a<90)
          {
                  System.out.println("You got 2nd rank.");
          }
          else if (50<=a&a<75)
          {
                  System.out.println("You got 3rd rank.");
          }
          else if (35<=a&a<50)
          {
                  System.out.println("You just passed.");
          }
          else if (10<=a&a<35)
          {
                  System.out.println("You failed.");
          }
          else
          {
                  System.out.println("Invalid credentials. Please enter valid marks.");
          }
    }
}