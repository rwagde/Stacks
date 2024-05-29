// Name: Rashmi Wagde
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Replit
import java.util.Scanner;
public class CheckPalindrome {
    public void checkPalindrome(String s) {
        //variables and new stack
        Stack stack = new Stack();
        String str2 = "";
        int n = 0;
        //pushes each letter into stack
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        //pops the top letter on stack and removes it until stack is empty
        while(stack.isEmpty() != true) {
            str2 = str2 + stack.top();
            stack.pop();
        }
        //compares the new string to the original to see if it is a palindrome
        if(s.compareTo(str2) == n) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }

    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);
        //variables and new object of CheckPalindrome
        int n;
        String s = "";
        CheckPalindrome palindrome = new CheckPalindrome();
        //print menu while 3 is not chosen
        do {
            System.out.println("\n---------------MAIN MENU--------------");
            System.out.println("1 - Read input string");
            System.out.println("2 - Check if palindrome");
            System.out.println("3 - Exit program");
            System.out.print("\nEnter option number: ");
            n = i.nextInt();

            switch(n) {
                //asks user to enter a string
                case 1: System.out.print("Enter a string: ");
                    i.nextLine();
                    s = i.nextLine();
                    //if the string is empty, it prints the string is empty
                    if(s.equals("")) {
                        System.out.print("The string is empty\n");
                        break;
                    }
                    //prints string user has entered
                    System.out.print("Entered string: " + s);
                    System.out.println("\n");
                    break;

                //prints string in reverse order
                case 2:
                    //if string is empty, program prints the string is empty
                    if(s.equals("")) {
                        System.out.print("The string is empty\n");
                        break;
                    }
                    //returns the entered string and whether or not it is a palindrome
                    System.out.print("Entered string:  " + s);
                    System.out.print("\nJudgement:       ");
                    palindrome.checkPalindrome(s);  //palindrome method
                    System.out.println("\n");
            }
        }while(n != 3);

        //exits program if 3 is entered
        if(n == 3) {
            System.exit(0);
        }

    }
}