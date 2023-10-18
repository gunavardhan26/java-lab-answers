A Class contains 60 Students. Mr. Vinod,class teacher,wants to send a message 
to the students congratulating them for clearing the final tests.
But Vinod doesn't have time to send messages to each student separately.
Write a program which takes the student name as input and displays Student's 
name along with the Vinod's message.
Assumptions:
	Student name doesn't contain empty spaces.
Sample Test Case:

Enter Student name: Vinod
Hello, Vinod. Congratulations on passing your last exams.

Sample Test Cases

Test Case 1:

Expected Output:
Enter·Student·name:·Shiva
Hello,·Shiva.·Congratulations·on·passing·your·last·exams.

Test Case 2:

Expected Output:
Enter·Student·name:·Vinod
Hello,·Vinod.·Congratulations·on·passing·your·last·exams.

Test Case 3:

Expected Output:
Enter·Student·name:·Josh_Putnam
Hello,·Josh_Putnam.·Congratulations·on·passing·your·last·exams.

Test Case 4:

Expected Output:
Enter·Student·name:·Divya
Hello,·Divya.·Congratulations·on·passing·your·last·exams.

package q1152;
import java.util.Scanner;
public class StringExample {
public static void main(String[] args) {
//write your code here
Scanner a= new Scanner(System.in);
System.out.print("Enter Student name: ");
String x-a.nextLine();
System.out.println("Hello, +x+". Congratulations on passing your last exams.);
}
}