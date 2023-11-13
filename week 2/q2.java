Create a class InterviewProcess.Write a Java program that models an interview process with multiple rounds. 
The interview process consists of the following rounds: written test, group discussion, technical round, and HR 
round. The program should ask the candidate for their results at each stage and determine if they are eligible 
to proceed to the next round or if they should go home.

Sample Test Case:

Did you clear the written test? (yes/no): yes
You are eligible for the group discussion round
Did you pass the group discussion round? (yes/no): yes
You are eligible for the technical round
Did you pass the technical round? (yes/no): yes
Congrats! You are eligible for the HR round
Note: You must write "Sorry,You can go home" in else block.

Sample Test Cases
Test Case 1:
Expected Output:
Did·you·clear·the·written·test?·(yes/no):·yes
You·are·eligible·for·the·group·discussion·round
Did·you·pass·the·group·discussion·round?·(yes/no):·no
Sorry,You·can·go·home

Test Case 2:
Expected Output:
Did·you·clear·the·written·test?·(yes/no):·yes
You·are·eligible·for·the·group·discussion·round
Did·you·pass·the·group·discussion·round?·(yes/no):·yes
You·are·eligible·for·the·technical·round
Did·you·pass·the·technical·round?·(yes/no):·yes
Congrats!·You·are·eligible·for·the·HR·round



package q1162;
import java.util.Scanner;
public class InterviewProcess
{
	public static void main(String[] args)
	{
		 // Create a Scanner object to read user input
		 Scanner scanner = new Scanner(System.in);
		 // write the code here
		 System.out.print("Did you clear the written test? (yes/no): ");
		 String a = scanner.nextLine();
		 if (a.equals("yes"))
		 {
			 System.out.println("You are eligible for the group discussion round");
			 System.out.print("Did you pass the group discussion round? (yes/no): ");
			 String b = scanner.nextLine();
			 if (b.equals("yes"))
			 {
				 System.out.println("You are eligible for the technical round");
				 System.out.print("Did you pass the technical round? (yes/no): ");
				 String c = scanner.nextLine();
				 if (c.equals("yes"))
				 {
					 System.out.println("Congrats! You are eligible for the HR round");
 				 }
				 else
				 {
					 System.out.println("Sorry,You can go home");
				 }	
			 }
 			 else
 			 {
				 System.out.println("Sorry,You can go home");
 			 }
		 }
		 else
		 {
			 System.out.println("Sorry,You can go home");
		 }

	 }
}