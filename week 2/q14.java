Create a class PalindromeOrNot with a main method. The method receives one command line argument. 
Check the given argument is palindrome or not.

For example:
Cmd Args : madam
The given string madam is a palindrome
Cmd Args : Godavari
The given string Godavari is not a palindrome


Note: Please don't change the package name.


package q11184;
class PalindromeOrNot
{
	public static void main(String[] args)
	{
		String a=args[0];
		String b="";
		int n = a.length();
		for (int i = n-1;i>=0;i--){
			b=b+a.charAt(i);
		}
		if (a.equals(b))
		{
			System.out.println("The given string "+a+" is a palindrome");
		}
		else
		{
			System.out.println("The given string "+a+" is not a palindrome");
		}
		
	}
}