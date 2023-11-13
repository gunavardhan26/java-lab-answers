Surya owns a digital watch and wishes to include a feature that provides information about the number of days 
in each month, ranging from 1 to 12. When he presses a single digit(month), the watch should display the corresponding number of days, such as 31. Assist Surya in implementing this update.



Note:

Use the below printing statements appropriately

"Enter a month number (1 to 12): "

"31 days in this month."

"30 days in this month."

"28 or 29 days in this month (leap year dependent)."

"Invalid month number. Please enter a number from 1 to 12."

Sample Test Cases

Test Case 1:
Expected Output:
Enter·a·month·number·(1·to·12):·0
Invalid·month·number.·Please·enter·a·number·from·1·to·12.

Test Case 2:
Expected Output:
Enter·a·month·number·(1·to·12):·9
30·days·in·this·month.

Test Case 3:
Expected Output:
Enter·a·month·number·(1·to·12):·3
31·days·in·this·month.

Test Case 4:
Expected Output:
Enter·a·month·number·(1·to·12):·11
30·days·in·this·month.


package q1170;
import java.util.Scanner;
public class DayscheckWithNumbers
{
            public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a month number (1 to 12): ");
            int month = scanner.nextInt();
            switch (month){
                   case 1: case 3: case 5 : case 7 : case 8 : case 10 : case 12 :
                           System.out.println("31 days in this month.");
                           break;
                   case 2:
                              System.out.println("28 or 29 days in this month (leap year dependent).");
                           break;
                   case 4 : case 6 : case 9 : case 11 :
                              System.out.println("30 days in this month.");
                              break;
                   default:
                   System.out.println("Invalid month number. Please enter a number from 1 to 12.");
            }
        }
}