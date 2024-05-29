// Name: Rashmi Wagde
// Class: CS 3305/Section 04
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Replit
public class ReverseString {

    //method that prints the string entered by user
    public void printString(String s) {
        System.out.print(s);
    }
    //method that reverses the string user entered
    public void reverse(String s) {
        //each word in string is separated and pushed into stack
        Stack st = new Stack();
        String[] t = s.split(" ", 0);
        for(int i = 0; i < t.length; i++) {
                st.push(t[i]);
        }
        //each word at top of stack is printed and popped
        while(st.isEmpty() != true) {
            System.out.print(st.top() + " ");
            st.pop();
        }
    }

    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);

        //variables
        int n;
        String s="";
        //new string from class ReverseString
        ReverseString string = new ReverseString();

        //print menu while 3 is not chosen
        do {
            System.out.println("\n---------------MAIN MENU--------------");
            System.out.println("1 - Read input string of words");
            System.out.println("2 - Reverse and display input string");
            System.out.println("3 - Exit program");
            System.out.print("\nEnter option number: ");
            n = i.nextInt();

            //switch output choices
            switch(n) {
                //asks user to enter a string
                case 1: System.out.print("Enter a string: ");
                i.nextLine();
                s = i.nextLine();
                //if string empty, print the string is empty
                    if(s.equals("")) {
                        System.out.print("The string is empty\n");
                        break;
                    }
                //prints string user has entered
                System.out.print("Entered string: ");
                string.printString(s); //printString method
                System.out.println();
                break;

                //prints string in reverse order
                case 2:
                    //if string empty, print the string is empty
                    if(s.equals("")) {
                        System.out.print("The string is empty\n");
                        break;
                    }
                //prints entered and reversed string
                System.out.print("Entered string:  ");
                string.printString(s);
                System.out.print("\nReversed string: ");
                string.reverse(s);  //reverse method
                System.out.println();
            }
        }while(n != 3);

        //exits program if 3 is entered
        if(n == 3) {
            System.exit(0);
        }
    }
}